package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "result")
public class RecommendationVote {

    String value;
    long numVotes;

    public String getValue() {
        return value;
    }

    @XmlAttribute
    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name = "numvotes")
    public long getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(long numVotes) {
        this.numVotes = numVotes;
    }

    @Override
    public String toString() {
        return "RecommendationVote{" +
                "value='" + value + '\'' +
                ", numVotes=" + numVotes +
                '}';
    }
}
