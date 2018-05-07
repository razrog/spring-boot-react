package core.Exceptions;

public class CustomerNotFoundException extends Exception {
    private static final String MESSAGE = "Customer Not Found";

    public CustomerNotFoundException() {
        super(MESSAGE);
    }
}
