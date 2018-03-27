
public class EmptyCartException extends Exception {
    public EmptyCartException() {

    }

    public EmptyCartException(String message) {
        super(message);
    }

    public EmptyCartException(Throwable cause) {
        super(cause);

    }

    public EmptyCartException(String message, Throwable cause) {
        super(message, cause);
    }
}
