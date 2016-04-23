package gr.boardgames.library.domain;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="boardgames")
public class BoardGames {
    BoardGame boardGame;

    public BoardGame getBoardGame() {
        return boardGame;
    }

    @XmlElement(name="boardgame")
    public void setBoardGame(BoardGame boardGame) {
        this.boardGame = boardGame;
    }
}
