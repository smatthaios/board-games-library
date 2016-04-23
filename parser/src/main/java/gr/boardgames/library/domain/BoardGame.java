package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="boardgame")
public class BoardGame {

    long objectId;
    int yearPublished;
    int minPlayers;
    int maxPlayers;
    long playingTime;
    long minPlayingTime;
    long maxPlayingTime;
    int age;
    String name;
    String description;
    String thumbnail;
    String image;
    List<String> boardgameHonor;

    public long getObjectId() {
        return objectId;
    }


    @XmlAttribute(name="objectid")
    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @XmlElement(name="yearpublished")
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    @XmlElement(name="minplayers")
    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @XmlElement(name="maxplayers")
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public long getPlayingTime() {
        return playingTime;
    }

    @XmlElement(name="playingtime")
    public void setPlayingTime(long playingTime) {
        this.playingTime = playingTime;
    }

    public long getMinPlayingTime() {
        return minPlayingTime;
    }

    @XmlElement(name="minplayingtime")
    public void setMinPlayingTime(long minPlayingTime) {
        this.minPlayingTime = minPlayingTime;
    }

    public long getMaxPlayingTime() {
        return maxPlayingTime;
    }

    @XmlElement(name="maxplayingtime")
    public void setMaxPlayingTime(long maxPlayingTime) {
        this.maxPlayingTime = maxPlayingTime;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    @XmlElement
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    @XmlElement
    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getBoardgameHonor() {
        return boardgameHonor;
    }

    @XmlElement(name="boardgamehonor")
    public void setBoardgameHonor(List<String> boardgameHonor) {
        this.boardgameHonor = boardgameHonor;
    }
}
