package gr.boardgames.library.service;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.domain.User;

import java.util.List;

/** The interface BoardGame service contains all the business methods related to a {@link BoardGame}. */
public interface BoardGameService {

	/**
	 * Finds all {@link BoardGame boardgames} of the specified {@link User}.
	 *
	 * @param userId the {@link User} id
	 * @return a {@link List} of all {@link BoardGame boardgames} belonging to the specified {@link User}.
	 */
	public List<BoardGame> findAll(String userId);

	/**
	 * Creates a new {@link BoardGame}.
	 *
	 * @param boardGame the {@link BoardGame boardGame} we want to create
	 * @return the created {@link BoardGame boardGame}.
	 */
	public BoardGame create(BoardGame boardGame);

}
