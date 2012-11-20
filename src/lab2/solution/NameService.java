package lab2.solution;


/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int MIDDLE_NAME_IDX = 1;
    private static final int LAST_NAME_IDX = 2;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws IllegalFullNameException{
        String[] words = {"", "", ""};
        words = fullName.trim().split(" ");
        if(fullName.length() < 1 || words.length < 3 || words.length > 3) {
            throw new IllegalFullNameException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[LAST_NAME_IDX];
//        String[] nameParts;
//        nameParts = fullName.trim().split(" ");
//        return nameParts[LAST_NAME_IDX];
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) throws IllegalFirstNameException{
        String[] words = {"", "", ""};
        words = fullName.split(" ");
        if(fullName.length() < 1 || words.length < 3 || words.length > 3) {
            throw new IllegalFirstNameException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[FIRST_NAME_IDX];
    }
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractMiddleName(String fullName) throws IllegalMiddleNameException{
        if(fullName.length() < 1) {
            throw new IllegalMiddleNameException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[MIDDLE_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
