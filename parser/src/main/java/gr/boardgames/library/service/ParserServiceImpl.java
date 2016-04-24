package gr.boardgames.library.service;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.domain.BoardGames;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParserServiceImpl {
    private static final int BOARDGAMES_START_POINT = 1;//set the number to start from
    private static final int BOARDGAMES_THRESHOLD = 5;//set the number to end
    private static final String BOARDGAME_GEEK_URI = "http://boardgamegeek.com/xmlapi/boardgame/";
    private static final char LINE_SEPARATOR = '\n';
    private static final String FILE_NAME = "BOARDGAMES_DATA_";
    private static final String FILE_NAME_EXTENSION = ".CSV";
    private static final String [] FILE_HEADERS =
    {"objectId","yearPublished", "minPlayers", "maxPlayers", "playingTime", "minPlayingTime", "maxPlayingTime", "age", "names", "description", "thumbnail", "image",
       "boardgameHonors", "boardGameMechanics", "boardGamePodcastEpisodes", "boardGameArtists", "boardGameCategories", "boardGameDesigners", "boardGameExpansions",
    "boardGameFamilies", "boardGamePublishers", "boardGameSubdomains", "boardGameVersions", "polls"};

    private static final CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(FILE_HEADERS).withRecordSeparator(LINE_SEPARATOR);

    private static CloseableHttpClient httpclient;

    private static FileWriter fileWriter = null;
    private static CSVPrinter csvFilePrinter = null;

    public static void initialize() {
        httpclient = HttpClients.createDefault();
        try {
            fileWriter = new FileWriter(FILE_NAME + BOARDGAMES_START_POINT +'_'+ BOARDGAMES_THRESHOLD + FILE_NAME_EXTENSION);
            csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BoardGame parseResponse(InputStream inputStream) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader
                    (new InputStreamReader(inputStream));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String line = "";
        String bgContent = "";
        BoardGame boardGame = null;
        try {
            while ((line = rd.readLine()) != null) {
                bgContent = bgContent.concat(line);
            }
            System.out.println(bgContent);

            boardGame = unmarshalResponse(bgContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return boardGame;
    }

    public static BoardGame unmarshalResponse(String response) {
        BoardGames boardGames = null;
        BoardGame boardGame = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(BoardGames.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            boardGames = (BoardGames) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes()));
            boardGame = boardGames.getBoardGame();

        } catch (JAXBException e) {
            System.out.println("An error occurred with the xml:" + response);
            e.printStackTrace();
        }

        return boardGame;
    }

    public static List<BoardGame> getBoardGames() {
        List<BoardGame> boardGames = new ArrayList<BoardGame>();
        CloseableHttpResponse response = null;
        for (int i = BOARDGAMES_START_POINT; i <= BOARDGAMES_THRESHOLD; i++) {
            try {
                HttpGet httpget = new HttpGet(BOARDGAME_GEEK_URI + i);
                response = httpclient.execute(httpget);
                if (response.getStatusLine().getStatusCode() == 200) {
                    BoardGame boardGame = parseResponse(response.getEntity().getContent());
                    if (boardGame != null) {
                        boardGames.add(boardGame);
                        System.out.println("Boardgame No" + i + " has been successfully parsed.");
                    }
                }
            } catch (IOException e) {
                System.out.println("Unable to get the boardgame with id:" + i);
                e.printStackTrace();
            } finally {
                if (response != null) {
                    try {
                        response.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return boardGames;
    }

    public static void saveToFile(List<BoardGame> boardGames) {
        try {
            csvFilePrinter.printRecords(boardGames);
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
                csvFilePrinter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter/csvPrinter!");
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        initialize();
        List<BoardGame> boardGames = getBoardGames();
        saveToFile(boardGames);
    }
}
