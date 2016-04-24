package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "boardgame")
public class BoardGame {

    long objectId;
    int yearPublished;
    int minPlayers;
    int maxPlayers;
    long playingTime;
    long minPlayingTime;
    long maxPlayingTime;
    int age;
    List<BoardGameName> names;
    String description;
    String thumbnail;
    String image;
    List<BoardGameHonor> boardgameHonors;
    List<BoardGameMechanic> boardGameMechanics;
    List<BoardGamePodcastEpisode> boardGamePodcastEpisodes;
    List<BoardGameArtist> boardGameArtists;
    List<BoardGameCategory> boardGameCategories;
    List<BoardGameDesigner> boardGameDesigners;
    List<BoardGameExpansion> boardGameExpansions;
    List<BoardGameFamily> boardGameFamilies;
    List<BoardGamePublisher> boardGamePublishers;
    List<BoardGameSubdomain> boardGameSubdomains;
    List<BoardGameVersion> boardGameVersions;
    List<Poll> polls;

    public long getObjectId() {
        return objectId;
    }

    @XmlAttribute(name = "objectid")
    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @XmlElement(name = "yearpublished")
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    @XmlElement(name = "minplayers")
    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @XmlElement(name = "maxplayers")
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public long getPlayingTime() {
        return playingTime;
    }

    @XmlElement(name = "playingtime")
    public void setPlayingTime(long playingTime) {
        this.playingTime = playingTime;
    }

    public long getMinPlayingTime() {
        return minPlayingTime;
    }

    @XmlElement(name = "minplaytime")
    public void setMinPlayingTime(long minPlayingTime) {
        this.minPlayingTime = minPlayingTime;
    }

    public long getMaxPlayingTime() {
        return maxPlayingTime;
    }

    @XmlElement(name = "maxplaytime")
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

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<BoardGameHonor> getBoardgameHonors() {
        return boardgameHonors;
    }

    @XmlElement(name = "boardgamehonor")
    public void setBoardgameHonors(List<BoardGameHonor> boardgameHonors) {
        this.boardgameHonors = boardgameHonors;
    }

    public List<BoardGameMechanic> getBoardGameMechanics() {
        return boardGameMechanics;
    }

    @XmlElement(name = "boardgamemechanic")
    public void setBoardGameMechanics(List<BoardGameMechanic> boardGameMechanics) {
        this.boardGameMechanics = boardGameMechanics;
    }

    public List<BoardGamePodcastEpisode> getBoardGamePodcastEpisodes() {
        return boardGamePodcastEpisodes;
    }

    @XmlElement(name = "boardgamepodcastepisode")
    public void setBoardGamePodcastEpisodes(List<BoardGamePodcastEpisode> boardGamePodcastEpisodes) {
        this.boardGamePodcastEpisodes = boardGamePodcastEpisodes;
    }

    public List<BoardGameName> getNames() {
        return names;
    }

    @XmlElement(name = "name")
    public void setNames(List<BoardGameName> names) {
        this.names = names;
    }

    public List<BoardGameArtist> getBoardGameArtists() {
        return boardGameArtists;
    }

    @XmlElement(name = "boardgameartist")
    public void setBoardGameArtists(List<BoardGameArtist> boardGameArtists) {
        this.boardGameArtists = boardGameArtists;
    }

    public List<BoardGameCategory> getBoardGameCategories() {
        return boardGameCategories;
    }

    @XmlElement(name = "boardgamecategory")
    public void setBoardGameCategories(List<BoardGameCategory> boardGameCategories) {
        this.boardGameCategories = boardGameCategories;
    }

    public List<BoardGameDesigner> getBoardGameDesigners() {
        return boardGameDesigners;
    }

    @XmlElement(name = "boardgamedesigner")
    public void setBoardGameDesigners(List<BoardGameDesigner> boardGameDesigners) {
        this.boardGameDesigners = boardGameDesigners;
    }

    public List<BoardGameFamily> getBoardGameFamilies() {
        return boardGameFamilies;
    }

    @XmlElement(name = "boardgamefamily")
    public void setBoardGameFamilies(List<BoardGameFamily> boardGameFamilies) {
        this.boardGameFamilies = boardGameFamilies;
    }

    public List<BoardGameExpansion> getBoardGameExpansions() {
        return boardGameExpansions;
    }

    @XmlElement(name = "boardgameexpansion")
    public void setBoardGameExpansions(List<BoardGameExpansion> boardGameExpansions) {
        this.boardGameExpansions = boardGameExpansions;
    }

    public List<BoardGamePublisher> getBoardGamePublishers() {
        return boardGamePublishers;
    }

    @XmlElement(name = "boardgamepublisher")
    public void setBoardGamePublishers(List<BoardGamePublisher> boardGamePublishers) {
        this.boardGamePublishers = boardGamePublishers;
    }

    public List<BoardGameSubdomain> getBoardGameSubdomains() {
        return boardGameSubdomains;
    }

    @XmlElement(name = "boardgamesubdomain")
    public void setBoardGameSubdomains(List<BoardGameSubdomain> boardGameSubdomains) {
        this.boardGameSubdomains = boardGameSubdomains;
    }

    public List<BoardGameVersion> getBoardGameVersions() {
        return boardGameVersions;
    }

    @XmlElement(name = "boardgameversion")
    public void setBoardGameVersions(List<BoardGameVersion> boardGameVersions) {
        this.boardGameVersions = boardGameVersions;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    @XmlElement(name = "poll")
    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

    @Override
    public String toString() {
        return objectId +
                "|" + yearPublished +
                "|" + minPlayers +
                "|" + maxPlayers +
                "|" + playingTime +
                "|" + minPlayingTime +
                "|" + maxPlayingTime +
                "|" + age +
                "|" + ((names != null) ? names.toString() : "") +
                "|" + description +
                "|" + thumbnail +
                "|" + image +
                "|" + ((boardgameHonors != null) ? boardgameHonors.toString() : "") +
                "|" + ((boardGameMechanics != null) ? boardGameMechanics.toString() : "") +
                "|" + ((boardGamePodcastEpisodes != null) ? boardGamePodcastEpisodes.toString() : "") +
                "|" + ((boardGameArtists != null) ? boardGameArtists.toString() : "") +
                "|" + ((boardGameCategories != null) ? boardGameCategories.toString() : "") +
                "|" + ((boardGameDesigners != null) ? boardGameDesigners.toString() : "") +
                "|" + ((boardGameExpansions != null) ? boardGameExpansions.toString() : "") +
                "|" + ((boardGameFamilies != null) ? boardGameFamilies.toString() : "") +
                "|" + ((boardGamePublishers != null) ? boardGamePublishers.toString() : "") +
                "|" + ((boardGameSubdomains != null) ? boardGameSubdomains.toString() : "") +
                "|" + ((boardGameVersions != null) ? boardGameVersions.toString() : "") +
                "|" + ((polls != null) ? polls.toString() : "");
    }
}
