package gr.boardgames.library.exception;

import gr.boardgames.library.enumeration.FaultReason;

/** The {@link gr.boardgames.library.exception.UserNotFoundException} must be thrown when a {@link gr.boardgames.library.domain.User} is not found in the user repository. */
public class EmailNotFoundException extends DataException {

    /** The {@link gr.boardgames.library.enumeration.FaultReason} object representing the cause of the application error. */
    private FaultReason faultReason;

    /**
     * Instantiates a new {@link gr.boardgames.library.exception.UserNotFoundException}.
     *
     * @param message the message that contains information about the raised exception
     */
    public EmailNotFoundException(String message) {
        super(message);
        this.faultReason = FaultReason.USER_NOT_FOUND;
    }

    /**
     * Instantiates a new {@link gr.boardgames.library.exception.UserNotFoundException}.
     *
     * @param message   the message that contains information about the raised exception
     * @param exception the exception that has caused this exception
     */
    public EmailNotFoundException(String message, Throwable exception) {
        super(message, exception);
        this.faultReason = FaultReason.USER_NOT_FOUND;
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
