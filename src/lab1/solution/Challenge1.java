package lab1.solution;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques. <p> Your challenge is to consider all the
 * possible things that can go wrong with this program and use exception
 * handling where appropriate to prevent the program from crashing. In addition
 * you must display a friendly error message in a JOptionPane and ask the user
 * to try again.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    public static final int LAST_NAME_INDEX = 2;

    public static void main(String[] args) throws IllegalFullNameException, IllegalLastNameException {
        Challenge1 app = new Challenge1();
        NameRetrievalApp nra = new NameRetrievalApp();
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        try {
            nra.setFullName(fullName);
        } catch (IllegalFullNameException ifne) {
            System.out.println(ifne.getMessage());
            return;
        }

        String lastName = app.extractLastName(nra.getFullName());
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }

    public String extractLastName(String fullName) {
        String[] nameParts;
        nameParts = fullName.trim().split(" ");
        return nameParts[LAST_NAME_INDEX];
    }
}
