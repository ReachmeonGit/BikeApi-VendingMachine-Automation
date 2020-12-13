package exceptions;

/**
 * Vending Machine throws this exception to indicate that it doesn't have sufficient change to complete this request.
 */
public class NotSufficientChangeException extends RuntimeException {

    private final String message;

    public NotSufficientChangeException(String string) {
        this.message = string;
    }

    @Override
    public String getMessage() {
        return message;
    }

}