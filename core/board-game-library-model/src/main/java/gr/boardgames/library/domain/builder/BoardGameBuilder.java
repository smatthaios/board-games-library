package gr.boardgames.library.domain.builder;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.enumeration.BoardGameCategory;

import java.io.OutputStream;
import java.util.Date;
import java.util.List;

/**
 * A builder for {@link BoardGame} entity.
 */
public class BoardGameBuilder {
	/**
	 * The Id.
	 */
	protected String id;
	List<BoardGame> expansions = null;
	BoardGame mainGame = null;
	private String title;
	private String description;
	private int yearPublished;
	private int minPlayingTime;
	private int maximumPlayingTime;
	private int minPlayers;
	private int maximumPlayers;
	private int suggestedPlayers;
	private float rating;
	private BoardGameCategory boardGameCategory;
	private OutputStream boardGameImage;
	private Date creationDate;
	private Date lastModified;

	private BoardGameBuilder() {}

	/**
	 * A board game.
	 *
	 * @return the board game builder
	 */
	public static BoardGameBuilder aBoardGame() { return new BoardGameBuilder();}

	/**
	 * With id.
	 *
	 * @param id the id
	 * @return the board game builder
	 */
	public BoardGameBuilder withId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * With title.
	 *
	 * @param title the title
	 * @return the board game builder
	 */
	public BoardGameBuilder withTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * With description.
	 *
	 * @param description the description
	 * @return the board game builder
	 */
	public BoardGameBuilder withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * With year published.
	 *
	 * @param yearPublished the year published
	 * @return the board game builder
	 */
	public BoardGameBuilder withYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
		return this;
	}

	/**
	 * With min playing time.
	 *
	 * @param minPlayingTime the min playing time
	 * @return the board game builder
	 */
	public BoardGameBuilder withMinPlayingTime(int minPlayingTime) {
		this.minPlayingTime = minPlayingTime;
		return this;
	}

	/**
	 * With maximum playing time.
	 *
	 * @param maximumPlayingTime the maximum playing time
	 * @return the board game builder
	 */
	public BoardGameBuilder withMaximumPlayingTime(int maximumPlayingTime) {
		this.maximumPlayingTime = maximumPlayingTime;
		return this;
	}

	/**
	 * With min players.
	 *
	 * @param minPlayers the min players
	 * @return the board game builder
	 */
	public BoardGameBuilder withMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
		return this;
	}

	/**
	 * With maximum players.
	 *
	 * @param maximumPlayers the maximum players
	 * @return the board game builder
	 */
	public BoardGameBuilder withMaximumPlayers(int maximumPlayers) {
		this.maximumPlayers = maximumPlayers;
		return this;
	}

	/**
	 * With suggested players.
	 *
	 * @param suggestedPlayers the suggested players
	 * @return the board game builder
	 */
	public BoardGameBuilder withSuggestedPlayers(int suggestedPlayers) {
		this.suggestedPlayers = suggestedPlayers;
		return this;
	}

	/**
	 * With rating.
	 *
	 * @param rating the rating
	 * @return the board game builder
	 */
	public BoardGameBuilder withRating(float rating) {
		this.rating = rating;
		return this;
	}

	/**
	 * With board game category.
	 *
	 * @param boardGameCategory the board game category
	 * @return the board game builder
	 */
	public BoardGameBuilder withBoardGameCategory(BoardGameCategory boardGameCategory) {
		this.boardGameCategory = boardGameCategory;
		return this;
	}

	/**
	 * With board game image.
	 *
	 * @param boardGameImage the board game image
	 * @return the board game builder
	 */
	public BoardGameBuilder withBoardGameImage(OutputStream boardGameImage) {
		this.boardGameImage = boardGameImage;
		return this;
	}

	/**
	 * With expansions.
	 *
	 * @param expansions the expansions
	 * @return the board game builder
	 */
	public BoardGameBuilder withExpansions(List<BoardGame> expansions) {
		this.expansions = expansions;
		return this;
	}

	/**
	 * With main game.
	 *
	 * @param mainGame the main game
	 * @return the board game builder
	 */
	public BoardGameBuilder withMainGame(BoardGame mainGame) {
		this.mainGame = mainGame;
		return this;
	}

	/**
	 * With creation date.
	 *
	 * @param creationDate the creation date
	 * @return the board game builder
	 */
	public BoardGameBuilder withCreationDate(Date creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * With last modified.
	 *
	 * @param lastModified the last modified
	 * @return the board game builder
	 */
	public BoardGameBuilder withLastModified(Date lastModified) {
		this.lastModified = lastModified;
		return this;
	}

	/**
	 * But board game builder.
	 *
	 * @return the board game builder
	 */
	public BoardGameBuilder but() { return aBoardGame().withTitle(title).withDescription(description).withYearPublished(yearPublished)
			.withMinPlayingTime(minPlayingTime).withMaximumPlayingTime(maximumPlayingTime).withMinPlayers(minPlayers).withMaximumPlayers
					(maximumPlayers).withSuggestedPlayers(suggestedPlayers).withRating(rating).withBoardGameCategory(boardGameCategory).withBoardGameImage(boardGameImage).withExpansions(expansions).withMainGame(mainGame).withCreationDate(creationDate).withLastModified(lastModified).withId(id);}

	/**
	 * Build board game.
	 *
	 * @return the board game
	 */
	public BoardGame build() {
		BoardGame boardGame = new BoardGame();
		boardGame.setTitle(title);
		boardGame.setDescription(description);
		boardGame.setYearPublished(yearPublished);
		boardGame.setMinPlayingTime(minPlayingTime);
		boardGame.setMaximumPlayingTime(maximumPlayingTime);
		boardGame.setMinPlayers(minPlayers);
		boardGame.setMaximumPlayers(maximumPlayers);
		boardGame.setSuggestedPlayers(suggestedPlayers);
		boardGame.setRating(rating);
		boardGame.setBoardGameCategory(boardGameCategory);
		boardGame.setBoardGameImage(boardGameImage);
		boardGame.setExpansions(expansions);
		boardGame.setMainGame(mainGame);
		boardGame.setCreationDate(creationDate);
		boardGame.setLastModified(lastModified);
		boardGame.setId(id);
		return boardGame;
	}
}
