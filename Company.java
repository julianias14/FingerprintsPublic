import java.util.*;

/**
 * A Company object will represent a biometric fingerprint authentication system.
 * Manages employee records with fingerprint data for secure access control.
 * 
 * Each company has an ArrayList of Person objects representing employees.
 * Supports adding employees, authenticating via fingerprint matching, and 
 * generating security reports.
 * 
 * @author Juliania Shyprykevych 
 * @author Maaz Mansuri
 */
public class Company {

    private ArrayList<Employee> employeeList; // list of all employees in the company

    /*
     * Constructor initializes an empty company list with no employees
     */
    public Company() {
        employeeList = new ArrayList<Employee>();
    }

    /*
     * Resets the company database by nullifying the employee list
     */
    public void quit() {
        this.employeeList = null;
    }

    /*
     * Returns the ArrayList containing all company employees
     * 
     * @return ArrayList of Employee objects representing all employees
     */
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * Creates an Employee object using the information contained in filename.
     *
     * File format: id, firstName, lastName, age, securityLevel, rows, columns,
     * followed by a 2D character array representing the fingerprint.
     *
     * @param filename the name of the text file containing employee data
     * @return Employee object with all attributes initialized from file data
     */
    public Employee createEmployee(String filename) {
        // WRITE YOUR CODE HERE
    }

    /**
     * Adds a new employee to the company database if they don't already exist.
     * Prevents duplicate employees by checking company ID.
     *
     * @param filename the Employee to be added to the company
     * @return true if Employee was successfully added, false if duplicate
     * detected.
     */
    public boolean onboardEmployee(String filename) {
        // WRITE YOUR CODE HERE
        return false;
    }

    /**
     * Authenticates an Employee by comparing their fingerprint against stored
     * data. Uses pixel-by-pixel comparison with a percentage threshold for
     * matching. Updates authentication statistics and login status.
     *
     * @param login contains the Employee ID and fingerprint attempting to login
     * @param threshold minimum percentage match required (0-100)
     * @return true if authentication successful, false otherwise
     */
    public boolean authenticate(LoginCredentials login, int threshold) {
        // WRITE YOUR CODE HERE
        return false;
    }

    /**
     * Analyzes security vulnerability by testing how many employees could
     * potentially authenticate using another person's fingerprint. Compares the
     * given person's fingerprint against all other employees using the smaller
     * dimensions when fingerprint sizes differ.
     *
     * @param hackerAttempts list of different people with different fingerprints trying to hack in under the same victim's userID
     * @param threshold minimum percentage match required for authentication
     */
    public int testAuthenticationRobustness(ArrayList<LoginCredentials> hackerAttempts, int threshold) {
        // WRITE YOUR CODE HERE
        return 0.0;
    }

    /**
     * PROVIDED CODE Prints detailed information for a specific employee
     * including their fingerprint as ASCII characters, login status, and
     * authentication statistics.
     *
     * @param ID the employee's ID
     */
    public void getImageToString(int ID) {

        for (Employee e : employeeList) {
            if (e.getID() == ID) {
                // fingerprint dimension
                int rows = e.getFingerprint().length;
                int cols = e.getFingerprint()[0].length;

                if (e.getLoggedIn()) {
                    StdOut.println("Employee: " + e + " is logged in.");
                } else {
                    StdOut.println("Employee: " + e + " is logged out.");
                }
                StdOut.println("Number of success logins: " + e.getSuccessLoginCount() + "\nNumber of attempt logins: "
                        + e.getAttemptLoginCount());
                StdOut.println("Age: " + e.getAge());
                StdOut.println("Level of Security: " + e.getLevelOfSecurity());
                StdOut.println("Fingerprint dimensions: " + rows + " by " + cols);
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        StdOut.print(e.getFingerprint()[i][j]);
                    }
                    StdOut.println();
                }
                StdOut.println();
            }
        }
    }

    /**
     * PROVIDED CODE Prints detailed information for all employees in the
     * company including their fingerprints as ASCII characters, login status,
     * and authentication statistics
     */
    public void getImageToString() {
        for (Employee e : employeeList) {
            getImageToString(e.getID());
        }
    }

    /*
     * Main method that redirects users to run the Driver class instead.
     * The Company class is not meant to be run directly.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Hey, did you try to run the wrong file?");
        System.out.println("Make sure you run the DRIVER to test your output in the terminal!");
    }
}
