package gr.boardgames.library.service;

import gr.boardgames.library.domain.BoardGame;
import gr.boardgames.library.domain.builder.BoardGameBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/** The type BoardGame service impl contains all the business methods related to a {@link BoardGame}. */
@Service
public class BoardGameServiceImpl implements BoardGameService {

	/** Logger to be used */
	private final static Logger LOG = LoggerFactory.getLogger(BoardGameServiceImpl.class);

	/** The Board Game Repository. */
	/*@Autowired
	private BoardGameRepository boardGameRepository;*/

	/** {@inheritDoc} */
	@Override
	public List<BoardGame> findAll(String userId) {
		List<BoardGame> boardGames = new ArrayList<>();

		return boardGames;
	}

	/** {@inheritDoc} */
	@Override
	public BoardGame create(BoardGame boardGame) {
		BoardGame boardGames = BoardGameBuilder.aBoardGame()
				.withId("1")
				.build();

		return boardGames;
	}

}
