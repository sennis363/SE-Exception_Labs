package lab1.solution;

import javax.swing.JOptionPane;

/**
 *
 * @author Sean Ennis
 */
public class NameRetrievalApp {
    private String fullName;
    private String lastName;
    //put this in main class as a final
    //private String outputMessage;

    public NameRetrievalApp() {
        fullName = "Unknown";
        lastName = "Unknown";
    }
    
    public NameRetrievalApp(String fullName, String lastName) {
        this.fullName = fullName;
        this.lastName = lastName;
    }

    
    /**
     * gets a validated full name
     * @return a validated full name
     */
    public String getFullName() {
        
        return fullName;
    }
/**
 * Sets the full name for a NameRetrievalApp domain.
 * 
 * @param fullName - the entered full name
 * @throws IllegalFullNameException if value is not valid
 */
    public void setFullName(String fullName) throws IllegalFullNameException{
        String[] words = {"", "", ""};
        words = fullName.split(" ");
        if (fullName.isEmpty() || words.length < 3 || words.length > 3) {
            throw new IllegalFullNameException();
        }
        //fullName = JOptionPane.showInputDialog("Enter full name:");
        fullName.trim();
        this.fullName = fullName;
    }
/**
     * gets a validated last name
     * @return a validated last name
     */
    public String getLastName() {
        return lastName;
    }
/**
 * Sets the last name for a NameRetrievalApp domain.
 * 
 * @param lastName - the entered full name
 * @throws IllegallastNameException if value.length() < 1 || value.length() > 30
 */
    public void setLastName(String lastName) throws IllegalLastNameException{
        if (lastName.length() < 1 || lastName.length() > 30) {
            throw new IllegalLastNameException();
        }
        this.lastName = lastName;
    }
    
    
}
