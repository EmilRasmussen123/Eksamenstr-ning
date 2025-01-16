import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    // Constructor
    public User(String fullName) {
        this.fullName = fullName;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getUserID() {
        return userID;
    }

    // Method to validate userID format
    public boolean validUserID() {
        return userID != null && userID.matches("[a-z]{4}\\d{4}");
    }

    // Method to create userID based on fullName
    public void createUserID() {
        if (fullName == null || !fullName.contains(" ")) {
            throw new IllegalArgumentException("Full name must include both first and last name.");
        }

        String[] names = fullName.split(" ");
        String firstName = names[0].toLowerCase();
        String lastName = names[names.length - 1].toLowerCase();

        if (firstName.length() < 2 || lastName.length() < 2) {
            throw new IllegalArgumentException("Both first and last name must have at least two letters.");
        }

        String prefix = firstName.substring(0, 2) + lastName.substring(0, 2);

        // Generate four random digits
        Random random = new Random();
        int randomDigits = 1000 + random.nextInt(9000); // Ensures 4 digits

        userID = prefix + randomDigits;
    }

    public static void main(String[] args) {
        // Example usage
        User user = new User("John Doe");

        // Create and display userID
        user.createUserID();
        System.out.println("Generated userID: " + user.getUserID());

        // Validate and display if userID is valid
        System.out.println("Is the userID valid? " + user.validUserID());
    }
}
