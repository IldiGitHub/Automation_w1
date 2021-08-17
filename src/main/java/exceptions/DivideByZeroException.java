package exceptions;

public class DivideByZeroException extends Exception {
    /**
     * Returns the message when dividing by zero happens
     *
     * @param message
     */
    public DivideByZeroException(String message) {
        super(message);
    }
}
