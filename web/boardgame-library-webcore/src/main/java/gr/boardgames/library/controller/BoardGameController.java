package gr.boardgames.library.controller;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.domain.User;
import gr.boardgames.library.enumeration.ResponseStatus;
import gr.boardgames.library.exception.DataException;
import gr.boardgames.library.service.BoardGameService;
import gr.boardgames.library.transport.Response;
import org.perf4j.slf4j.Slf4JStopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/** The {@link BoardGameController} contains all {@link User} related methods (authenticate, retrieve etc). */
@RestController
@RequestMapping("/users")
public class BoardGameController extends AbstractController {
	/** The prefix to be used for performance statistics */
	private static final String MODULE = "BoardGame";

	/** The LOGGER. */
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	/** The Board Game Service. */
	@Autowired
	private BoardGameService boardGameService;


	/**
	 * Retrieves all {@link gr.boardgames.library.domain.BoardGame boardgames}
	 *
	 * @return a list of boardgames
	 * @throws gr.boardgames.library.exception.DataException if retrieval fails
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Response<BoardGame> getAll(@RequestParam final String userId) throws DataException {
		final Slf4JStopWatch stopWatch = new Slf4JStopWatch();

		final List<BoardGame> boardgames = boardGameService.findAll(userId);
		stopWatch.stop(MODULE + "getAll");

		return new Response<>(boardgames, ResponseStatus.OK);
	}

	/**
	 * This method creates a {@link BoardGame}.
	 *
	 * @param boardGame the {@link BoardGame} we want to create
	 * @return A response with the created {@link BoardGame}
	 * @throws DataException when {@link BoardGame} creation fails
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Response<BoardGame> create(@RequestParam final BoardGame boardGame) throws
			DataException {
		LOGGER.info("Creating BoardGame[title:{}].", boardGame.getTitle());

		final Slf4JStopWatch stopWatch = new Slf4JStopWatch();

		BoardGame newBoardGame = boardGameService.create(boardGame);

		stopWatch.stop(MODULE + "create");
		return new Response<>(Arrays.asList(newBoardGame), ResponseStatus.OK);
	}


}
