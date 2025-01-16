import java.util.ArrayList;
import java.util.List;

public class UsersWithEnum {

    // User class with enum for Role
    public static class User {
        private String username;
        private int userid;
        private Role role;

        // Enum for roles
        public enum Role {
            Admin, Editor, Reader
        }

        // Constructor
        public User(String username, int userid, Role role) {
            this.username = username;
            this.userid = userid;
            this.role = role;
        }

        // Getters
        public String getUsername() {
            return username;
        }

        public int getUserid() {
            return userid;
        }

        public Role getRole() {
            return role;
        }

        // To string for easy printing
        public String toString() {
            return "User{username='" + username + "', userid=" + userid + ", role=" + role + '}';
        }
    }

    // Users class that holds a list of User objects
    public static class Users {
        private List<User> userList = new ArrayList<>();
        private int nextUserId = 1; // Keeps track of the next available user ID

        // Method to create a new user
        public void createUser(String username, User.Role role) {
            User newUser = new User(username, nextUserId, role);
            userList.add(newUser);
            nextUserId++; // Increment the ID for the next user
        }

        // Method to get a list of all users with a specific role
        public List<User> getUsersByRole(User.Role role) {
            List<User> usersWithRole = new ArrayList<>();
            for (User user : userList) {
                if (user.getRole() == role) {
                    usersWithRole.add(user);
                }
            }
            return usersWithRole;
        }

        // Method to print all users
        public void printAllUsers() {
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }

    public static void main(String[] args) {
        Users users = new Users();

        // Create some users
        users.createUser("Alice", User.Role.Admin);
        users.createUser("Bob", User.Role.Editor);
        users.createUser("Charlie", User.Role.Reader);
        users.createUser("Dave", User.Role.Editor);

        // Print all users
        System.out.println("All users:");
        users.printAllUsers();

        // Get and print all Editor users
        System.out.println("\nEditor users:");
        for (User user : users.getUsersByRole(User.Role.Editor)) {
            System.out.println(user);
        }
    }
}