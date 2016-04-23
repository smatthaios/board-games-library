package gr.boardgames.library.service;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.domain.BoardGames;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class ParserServiceImpl {
    private static final int BOARDGAMES_THRESHOLD = 5;
    private static final String BOARDGAME_GEEK_URI = "http://boardgamegeek.com/xmlapi/boardgame/";

    private static CloseableHttpClient httpclient;

    public static void initializeHttpClient() {
        httpclient = HttpClients.createDefault();
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
            e.printStackTrace();
        }

        return boardGame;
    }

    public static void main(String args[]) {
        initializeHttpClient();
        CloseableHttpResponse response = null;
        for (int i = 1; i <= BOARDGAMES_THRESHOLD; i++) {
            try {
                HttpGet httpget = new HttpGet(BOARDGAME_GEEK_URI + i);
                response = httpclient.execute(httpget);
                if(response.getStatusLine().getStatusCode() == 200) {
                    BoardGame boardGame = parseResponse(response.getEntity().getContent());
                }
            } catch (IOException e) {
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
    }
}
