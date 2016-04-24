package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "results")
public class PollResult {

    String numPlayers;
    List<RecommendationVote> recommendationVotes;

    public String getNumPlayers() {
        return numPlayers;
    }

    @XmlAttribute(name = "numplayers")
    public void setNumPlayers(String numPlayers) {
        this.numPlayers = numPlayers;
    }

    public List<RecommendationVote> getRecommendationVotes() {
        return recommendationVotes;
    }

    @XmlElement(name = "result")
    public void setRecommendationVotes(List<RecommendationVote> recommendationVotes) {
        this.recommendationVotes = recommendationVotes;
    }

    @Override
    public String toString() {
        return "PollResult{" +
                "numPlayers=" + numPlayers +
                ", recommendationVotes=" + ((recommendationVotes != null) ? recommendationVotes.toString() : "") +
                '}';
    }
}
