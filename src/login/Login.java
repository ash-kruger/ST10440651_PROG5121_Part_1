package login;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Login {
    private String username;
    private String password;
    private String userFirstName; 
    private String userLastName;

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    public String getUserFirstName() {
       return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
       this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
       return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }


    public Login(String FirstName, String LastName){
        this.userFirstName = FirstName;
        this.userLastName = LastName;
    }

    public static String UserPassword() {
         
        while (true) {
            String userPassword = JOptionPane.showInputDialog(null, "Please Enter A Password\nHint: Must Contain a Capital Letter, Be at least 8 Characters long, Contain a number, and Contain a special Character");
             
            
            boolean containsCapital = false;
            boolean containsNumber = false;
            boolean containSpecial = false;
            
            for (int i = 0; i < userPassword.length(); i++) {
                char currentChar = userPassword.charAt(i);
               
                if (Character.isUpperCase(currentChar)) {
                    containsCapital = true;
          
                } else if (!Character.isLetterOrDigit(currentChar)) {
                    containSpecial = true;
                  
                } else if (Character.isDigit(currentChar)) {
                    containsNumber = true;
                }
            }
            
            if (userPassword.length() >= 8  && containsNumber && containSpecial &&containsCapital) {
                System.out.println("Password successfully captured");
             
               return userPassword;
            }
            else {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character");
            }
        }
    }
   
    public static String Username() {
        Boolean checkUserName = false;
        String userName = "";
        while (!checkUserName) {
            userName = JOptionPane.showInputDialog(null, "Please Enter A UserName \nHint: Must contain an underscore and no longer than 5 Characters");
       
            if (userName != null && userName.contains("_") && userName.length() <= 5) {
                System.out.println("UserName successfully captured");
                checkUserName = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted,   Username must contain an underscore and have no more than 5 characters in length");
            }    
        }
        return userName;
    }

   
    

    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null,"Enter user first name");
        String lastName = JOptionPane.showInputDialog(null,"enter user last name");
       String password = UserPassword();
       String username = Username();
        
       
        Login login = new Login(firstName, lastName);
        login.setUsername(username);
        login.setPassword(password);
        
        Login newUser = new Login(firstName, lastName);
        newUser.setUsername(username);
        newUser.setPassword(password);

       
        List<Login> userAccounts = new ArrayList<>();
    userAccounts.add(newUser);
    
  
    boolean isAuthenticated = false;
    while (!isAuthenticated) {
        String inputUsername = JOptionPane.showInputDialog(null, "Enter Username:");
        String inputPassword = JOptionPane.showInputDialog(null, "Enter Password:");
        
        for (Login user : userAccounts) {
            if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                isAuthenticated = true;
                break;
                
            }
        }
        
        if (!isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
        }
       /* else if (username == "terminate"|| password == "terminate") {
          //  JOptionPane.showMessageDialog(null,);
            System.out.println();
          
        }*/////////Meant to allow the user to terminate the programme//////////
        
    }
    
    JOptionPane.showMessageDialog(null, "Login successful!" +"\n" + "Welcome Back " + firstName +" " + lastName);
    
    
        }
    
}

    
   

