package gr.boardgames.library.enumeration;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.domain.User;

/** The enumeration UserRole contains values that indicate the {@link User user's} status. */
public enum BoardGameCategory {
	/** The basic format using day, month and year precision. */
	STRATEGY("Strategy");

	/** The category of the {@link BoardGame} as a {@link String}. */
	private String category;

	/**
	 * Instantiates a new {@link gr.boardgames.library.enumeration.BoardGameCategory}.
	 *
	 * @param category the category of the {@link BoardGame}
	 */
	private BoardGameCategory(final String category) {
		this.category = category;
	}

	/**
	 * Gets the category of current {@link gr.boardgames.library.enumeration.BoardGameCategory}.
	 *
	 * @return the category of the {@link BoardGame}
	 */
	public String getCategory() {
		return category;
	}
}
