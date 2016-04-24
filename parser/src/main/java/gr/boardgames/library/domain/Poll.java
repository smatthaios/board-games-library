package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "poll")
public class Poll {

    String name;
    String title;
    long totalVotes;
    List<PollResult> pollResults;

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    @XmlAttribute
    public void setTitle(String title) {
        this.title = title;
    }

    public long getTotalVotes() {
        return totalVotes;
    }

    @XmlAttribute(name = "totalvotes")
    public void setTotalVotes(long totalVotes) {
        this.totalVotes = totalVotes;
    }

    public List<PollResult> getPollResults() {
        return pollResults;
    }

    @XmlElement(name="results")
    public void setPollResults(List<PollResult> pollResults) {
        this.pollResults = pollResults;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "value='" + name + '\'' +
                ", title='" + title + '\'' +
                ", totalVotes=" + totalVotes +
                ", pollResults=" + pollResults +
                '}';
    }
}
