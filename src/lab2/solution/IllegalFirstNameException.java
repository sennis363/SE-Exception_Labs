package lab2.solution;

/**
 *
 * @author Sean Ennis
 */
public class IllegalFirstNameException extends Exception{
    private static final String MSG = "First name must be between 1 and 30 characters.";

    public IllegalFirstNameException() {
    }

    public IllegalFirstNameException(String message) {
        super(MSG);
    }

    public IllegalFirstNameException(String message, Throwable t) {
        super(MSG, t);
    }
    
    public IllegalFirstNameException(Throwable t) {
        super(t);
    }
    
    public String getMessage() {
        return MSG;
    }
}
