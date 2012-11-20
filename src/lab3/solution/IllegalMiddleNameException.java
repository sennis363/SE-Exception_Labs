package lab3.solution;


/**
 *
 * @author Sean Ennis
 */
public class IllegalMiddleNameException extends Exception{
    private static final String MSG = "Middle name must be valid.";

    public IllegalMiddleNameException() {
    }

    public IllegalMiddleNameException(String message) {
        super(MSG);
    }

    public IllegalMiddleNameException(String message, Throwable t) {
        super(MSG, t);
    }
    
    public IllegalMiddleNameException(Throwable t) {
        super(t);
    }
    
    public String getMessage() {
        return MSG;
    }
}
