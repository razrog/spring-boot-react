package core.Exceptions;

public class CannotAddCustomerException extends Exception {
    private static final String MESSAGE = "Cannot Add Customer - Check Inputs";

    public CannotAddCustomerException(){
        super(MESSAGE);
    }
}

