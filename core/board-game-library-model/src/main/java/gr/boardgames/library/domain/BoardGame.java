package gr.boardgames.library.domain;

import gr.boardgames.library.enumeration.BoardGameCategory;

import java.io.OutputStream;
import java.util.List;

/** The type {@link BoardGame} represents the user entity of the application. */
public class BoardGame extends LoggableEntity {
	/**
	 * The constant serialVersionUID.
	 */
	private static final long serialVersionUID = 7204837193341131918L;

	/** The title of the {@link BoardGame}. */
	private String title;

	/** The description of the {@link BoardGame}. */
	private String description;

	/** The year that the {@link BoardGame} was published. */
	private int yearPublished;

	/** The approximate minimum playing time of the {@link BoardGame}. */
	private int minPlayingTime;

	/** The approximate maximum playing time of the {@link BoardGame}. */
	private int maximumPlayingTime;

	/** The minimum number of persons that this {@link BoardGame} can be played. */
	private int minPlayers;

	/** The maximum number of persons that this {@link BoardGame} can be played. */
	private int maximumPlayers;

	/** The suggested number of persons that this {@link BoardGame} can be played. */
	private int suggestedPlayers;

	/** The suggested number of persons that this {@link BoardGame} can be played. */
	private float rating;

	/** The category of the {@link BoardGame}. */
	private BoardGameCategory boardGameCategory;

	/** The {@link BoardGame} cover image. */
	private OutputStream boardGameImage;

	/** A {@link List} of the expansion {@link BoardGame}. */
	List<BoardGame> expansions = null;

	/** The main {@link BoardGame} (has value if this board game is an expansion, if not is null). */
	BoardGame mainGame = null;

	/**
	 * Gets title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets title.
	 *
	 * @param title the title
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Gets description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description.
	 *
	 * @param description the description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Gets year published.
	 *
	 * @return the year published
	 */
	public int getYearPublished() {
		return yearPublished;
	}

	/**
	 * Sets year published.
	 *
	 * @param yearPublished the year published
	 */
	public void setYearPublished(final int yearPublished) {
		this.yearPublished = yearPublished;
	}

	/**
	 * Gets min playing time.
	 *
	 * @return the min playing time
	 */
	public int getMinPlayingTime() {
		return minPlayingTime;
	}

	/**
	 * Sets min playing time.
	 *
	 * @param minPlayingTime the min playing time
	 */
	public void setMinPlayingTime(final int minPlayingTime) {
		this.minPlayingTime = minPlayingTime;
	}

	/**
	 * Gets maximum playing time.
	 *
	 * @return the maximum playing time
	 */
	public int getMaximumPlayingTime() {
		return maximumPlayingTime;
	}

	/**
	 * Sets maximum playing time.
	 *
	 * @param maximumPlayingTime the maximum playing time
	 */
	public void setMaximumPlayingTime(final int maximumPlayingTime) {
		this.maximumPlayingTime = maximumPlayingTime;
	}

	/**
	 * Gets min players.
	 *
	 * @return the min players
	 */
	public int getMinPlayers() {
		return minPlayers;
	}

	/**
	 * Sets min players.
	 *
	 * @param minPlayers the min players
	 */
	public void setMinPlayers(final int minPlayers) {
		this.minPlayers = minPlayers;
	}

	/**
	 * Gets maximum players.
	 *
	 * @return the maximum players
	 */
	public int getMaximumPlayers() {
		return maximumPlayers;
	}

	/**
	 * Sets maximum players.
	 *
	 * @param maximumPlayers the maximum players
	 */
	public void setMaximumPlayers(final int maximumPlayers) {
		this.maximumPlayers = maximumPlayers;
	}

	/**
	 * Gets suggested players.
	 *
	 * @return the suggested players
	 */
	public int getSuggestedPlayers() {
		return suggestedPlayers;
	}

	/**
	 * Sets suggested players.
	 *
	 * @param suggestedPlayers the suggested players
	 */
	public void setSuggestedPlayers(final int suggestedPlayers) {
		this.suggestedPlayers = suggestedPlayers;
	}

	/**
	 * Gets rating.
	 *
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * Sets rating.
	 *
	 * @param rating the rating
	 */
	public void setRating(final float rating) {
		this.rating = rating;
	}

	/**
	 * Gets board game category.
	 *
	 * @return the board game category
	 */
	public BoardGameCategory getBoardGameCategory() {
		return boardGameCategory;
	}

	/**
	 * Sets board game category.
	 *
	 * @param boardGameCategory the board game category
	 */
	public void setBoardGameCategory(final BoardGameCategory boardGameCategory) {
		this.boardGameCategory = boardGameCategory;
	}

	/**
	 * Gets board game image.
	 *
	 * @return the board game image
	 */
	public OutputStream getBoardGameImage() {
		return boardGameImage;
	}

	/**
	 * Sets board game image.
	 *
	 * @param boardGameImage the board game image
	 */
	public void setBoardGameImage(final OutputStream boardGameImage) {
		this.boardGameImage = boardGameImage;
	}

	/**
	 * Gets expansions.
	 *
	 * @return the expansions
	 */
	public List<BoardGame> getExpansions() {
		return expansions;
	}

	/**
	 * Sets expansions.
	 *
	 * @param expansions the expansions
	 */
	public void setExpansions(final List<BoardGame> expansions) {
		this.expansions = expansions;
	}

	/**
	 * Returns true if this {@link BoardGame} has expansions (if not it returns false).
	 *
	 * @return if this {@link BoardGame} has expansions or not
	 */
	public boolean hasExpansions() {
		return expansions != null && expansions.size() > 0;
	}

	/**
	 * Gets main game.
	 *
	 * @return the main game
	 */
	public BoardGame getMainGame() {
		return mainGame;
	}

	/**
	 * Sets main game.
	 *
	 * @param mainGame the main game
	 */
	public void setMainGame(final BoardGame mainGame) {
		this.mainGame = mainGame;
	}

	/**
	 * Return true if the board game is the main or false if it is an expansion.
	 *
	 * @return if the {@link BoardGame} is the main game.
	 */
	public boolean isMainGame() {
		return this.mainGame == null;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BoardGame{");
		sb.append("title='").append(title).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append(", yearPublished=").append(yearPublished);
		sb.append(", minPlayingTime=").append(minPlayingTime);
		sb.append(", maximumPlayingTime=").append(maximumPlayingTime);
		sb.append(", minPlayers=").append(minPlayers);
		sb.append(", maximumPlayers=").append(maximumPlayers);
		sb.append(", suggestedPlayers=").append(suggestedPlayers);
		sb.append(", rating=").append(rating);
		sb.append(", boardGameCategory=").append(boardGameCategory);
		sb.append(", boardGameImage=").append(boardGameImage);
		sb.append(", expansions=").append(expansions);
		sb.append(", mainGame=").append(mainGame);
		sb.append('}');
		return sb.toString();
	}
}
