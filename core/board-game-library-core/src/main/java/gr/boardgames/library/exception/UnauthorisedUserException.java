package gr.boardgames.library.exception;

import gr.boardgames.library.domain.User;
import gr.boardgames.library.enumeration.FaultReason;

/** The {@link gr.boardgames.library.exception.UnauthorisedUserException} must be thrown when an unauthorized {@link User} tried to gain access to the system. */
public class UnauthorisedUserException extends SecurityException {
	/** The {@link import gr.boardgames.library.enumeration..FaultReason} object representing the cause of the application error. */
	private FaultReason faultReason;

	/**
	 * Instantiates a new {@link gr.boardgames.library.exception.UnauthorisedUserException}.
	 *
	 * @param message the message that contains information about the raised exception
	 */
	public UnauthorisedUserException(String message) {
		super(message);
		this.faultReason = FaultReason.UNAUTHORISED_USER;
	}

	/**
	 * Instantiates a new {@link gr.boardgames.library.exception.UnauthorisedUserException}.
	 *
	 * @param message   the message that contains information about the raised exception
	 * @param exception the exception that has caused this exception
	 */
	public UnauthorisedUserException(String message, Throwable exception) {
		super(message, exception);
		this.faultReason = FaultReason.UNAUTHORISED_USER;
	}

	/**
	 * Gets the {@link FaultReason} object representing the cause of the application error.
	 *
	 * @return the {@link FaultReason} object representing the cause of the application error
	 */
	public FaultReason getFaultReason() {
		return faultReason;
	}
}
