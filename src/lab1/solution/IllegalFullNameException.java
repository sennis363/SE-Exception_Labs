package lab1.solution;

/**
 *
 * @author Sean Ennis
 */
public class IllegalFullNameException extends Exception{
    private static final String MSG = "Full name must be valid.";
    

    public IllegalFullNameException() {
    }

    public IllegalFullNameException(String message) {
        super(MSG);
    }

    public IllegalFullNameException(String message, Throwable t) {
        super(MSG, t);
    }
    
    public IllegalFullNameException(Throwable t) {
        super(t);
    }
    
    public String getMessage() {
        return MSG;
    }
}
