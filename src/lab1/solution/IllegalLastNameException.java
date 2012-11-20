package lab1.solution;

/**
 *
 * @author Sean Ennis
 */
public class IllegalLastNameException extends Exception{
    private static final String MSG = "Last name must be between 1 and 30 letters.";

    public IllegalLastNameException() {
    }

    public IllegalLastNameException(String message) {
        super(MSG);
    }

    public IllegalLastNameException(String message, Throwable t) {
        super(MSG, t);
    }
    
    public IllegalLastNameException(Throwable t) {
        super(t);
    }
    
    public String getMessage() {
        return MSG;
    }
}
