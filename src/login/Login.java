package login;

import javax.swing.JOptionPane;

public class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Login login = new Login();

        boolean validPassword = false;
        do {
            String password = JOptionPane.showInputDialog("Enter a password:");
            if (password.matches("^(?=.*[@#$%^&+=])(?=.*[a-zA-Z0-9]).{4,}$")) {
                login.setPassword(password);
                validPassword = true;
            } else {
                JOptionPane.showMessageDialog(null, "Password must contain at least one special character or pattern and be at least 4 characters long.");
            }
        } while (!validPassword);

        String username = JOptionPane.showInputDialog("Enter a username:");
        login.setUsername(username);

        System.out.println("You're all set!");
        System.out.println("Username: " + login.getUsername() + ", Password: " + login.getPassword());
    }
}
