import javax.swing.JOptionPane;
import java.util.HashMap;

public class UI {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();

        // Add users
        boolean addMoreUsers = true;
        while (addMoreUsers) {
            String username = JOptionPane.showInputDialog("Enter the username for the new user:");
            String password = JOptionPane.showInputDialog("Enter the password for the new user:");

            if (username == null || password == null) {
                JOptionPane.showMessageDialog(null, "Operation cancelled by user.");
                return;
            }

            users.put(username, password);

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to add another user?", "Add User", JOptionPane.YES_NO_OPTION);
            addMoreUsers = (choice == JOptionPane.YES_OPTION);
        }

        // Login
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");

        if (username == null || password == null) {
            JOptionPane.showMessageDialog(null, "Operation cancelled by user.");
            return;
        }

        if (login(users, username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static boolean login(HashMap<String, String> users, String username, String password) {
        if (users.containsKey(username)) {
            String storedPassword = users.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }
}
