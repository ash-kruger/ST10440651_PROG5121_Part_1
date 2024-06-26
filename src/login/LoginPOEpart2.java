//ST10440651
package login;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LoginPOEpart2 {
    private String username;
    private String password;
    private String userFirstName; 
    private String userLastName;

    LoginPOEpart2() {
        throw new UnsupportedOperationException("Not supported.");
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


    public LoginPOEpart2(String FirstName, String LastName){
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

   public static String calculateDueDate(int daysToAdd) {
       
        LocalDate currentDate = LocalDate.now();


        LocalDate dueDate = currentDate.plusDays(daysToAdd);

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDueDate = dueDate.format(formatter);

        return formattedDueDate;
    }
    

    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null,"Enter user first name");
        String lastName = JOptionPane.showInputDialog(null,"enter user last name");
       String password = UserPassword();
       String username = Username();
        
       
        LoginPOEpart2 login = new LoginPOEpart2(firstName, lastName);
        login.setUsername(username);
        login.setPassword(password);
        
        LoginPOEpart2 newUser = new LoginPOEpart2(firstName, lastName);
        newUser.setUsername(username);
        newUser.setPassword(password);

       
        List<LoginPOEpart2> userAccounts = new ArrayList<>();
    userAccounts.add(newUser);
    
  
    boolean isAuthenticated = false;
    while (!isAuthenticated) {
        String inputUsername = JOptionPane.showInputDialog(null, "Enter Username:");
        String inputPassword = JOptionPane.showInputDialog(null, "Enter Password:");
        
        for (LoginPOEpart2 user : userAccounts) {
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
    
      
    JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

   
while (true) {
    String[] options = {"Add tasks", "View tasks", "Show report", "Task Details", "Total Hours", "Quit"};
    int choice = JOptionPane.showOptionDialog(null, "Please choose an option", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    switch (choice) {
        case 0:
            addTasks();
            break;
        case 1:
            viewTasks();
            break;
        case 2:
            if (tasks.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No tasks available.");
            } else {
                StringBuilder taskDetails = new StringBuilder("Task Details:\n");
                for (Task task : tasks) {
                    taskDetails.append(task.printTaskDetails()).append("\n");
                }
                JOptionPane.showMessageDialog(null, taskDetails.toString());
            }
            break;
        case 3:
            int totalHours = returnTotalHours();
            JOptionPane.showMessageDialog(null, "Total hours spent on tasks: " + totalHours);
            break;
        case 4:
            System.exit(0);
    }
}

}


    private static int taskCounter = 0;
    private static int totalHours = 0;
    private static List<Task> tasks = new ArrayList<>();
    
   public static void addTasks() {
      
       
    String input = JOptionPane.showInputDialog(null, "How many tasks would you like to add?");
    int numberOfTasks = Integer.parseInt(input);

    for (int i = 0; i < numberOfTasks; i++) {
        String taskName = JOptionPane.showInputDialog(null, "Enter task name:");
        String taskDescription;
        while (true) {
            taskDescription = JOptionPane.showInputDialog(null, "Enter task description (max 50 characters):");
            if (checkTaskDescription(taskDescription)) {
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            }
        }
        String taskDeveloper = JOptionPane.showInputDialog(null, "Enter developer first and last name:");
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter task duration in hours:"));

        String dueDateString;
        while (true) {
            dueDateString = JOptionPane.showInputDialog(null, "Enter task due date (format: dd/mm/yyyy):");
            if (isValidDate(dueDateString)) {
                JOptionPane.showMessageDialog(null, "Due date successfully captured");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter the due date in the format dd/mm/yyyy");
            }
        }
        
        //  due date string into LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dueDate = LocalDate.parse(dueDateString, formatter);

        String[] statusOptions = {"ToDo", "Doing", "Done"};
        String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);

        // Creates a task ID
        String taskID = generateTaskID(taskName, taskDeveloper);

        // create a Task object
        Task task = new Task(taskName, taskDescription, taskDeveloper, taskDuration, taskStatus, taskID, dueDate);
        tasks.add(task);
        taskCounter++;
        totalHours += taskDuration;
    }

    // Display the tasks added
    StringBuilder taskList = new StringBuilder("Tasks added:\n");
    for (Task task : tasks) {
        taskList.append(task.printTaskDetails()).append("\n");
    }
    JOptionPane.showMessageDialog(null, taskList.toString());
}

// method to check if the input string is a valid date in the format "dd/mm/yyyy"
public static boolean isValidDate(String dateStr) {
    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate.parse(dateStr, formatter);
        return true;
    } catch (DateTimeParseException e) {
        return false;
    }
}


public static String generateTaskID(String taskName, String taskDeveloper) {
    String[] names = taskDeveloper.split(" ");
    String firstName = names[0];
    String lastName = names[1];
    String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskCounter + ":" + lastName.substring(Math.max(0, lastName.length() - 3)).toUpperCase();
    return taskID;
}
/*

    public static void addTasks() {
    String input = JOptionPane.showInputDialog(null, "How many tasks would you like to add?");
    int numberOfTasks = Integer.parseInt(input);

    for (int i = 0; i < numberOfTasks; i++) {
        String taskName = JOptionPane.showInputDialog(null, "Enter task name:");
        String taskDescription;
        while (true) {
            taskDescription = JOptionPane.showInputDialog(null, "Enter task description (max 50 characters):");
            if (checkTaskDescription(taskDescription)) {
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            }
        }
        String taskDeveloper = JOptionPane.showInputDialog(null, "Enter developer first and last name:");
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter task duration in hours:"));

        String[] statusOptions = {"ToDo", "Doing", "Done"};
        String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);

        Task task = new Task(taskName, taskDescription, taskDeveloper, taskDuration, taskStatus, taskCounter);
        tasks.add(task);
        taskCounter++;
        totalHours += taskDuration;
    }

    // Display the tasks added
    StringBuilder taskList = new StringBuilder("Tasks added:\n");
    for (Task task : tasks) {
        taskList.append(task.printTaskDetails()).append("\n");
    }
    JOptionPane.showMessageDialog(null, taskList.toString());
}
*/

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
        } else {
            StringBuilder taskList = new StringBuilder("Tasks:\n");
            for (Task task : tasks) {
                taskList.append(task.printTaskDetails()).append("\n");
            }
            JOptionPane.showMessageDialog(null, taskList.toString());
        }
    }

    public static boolean checkTaskDescription(String description) {
        return description.length() <= 50;
    }

    public static class Task {
        public String taskName;
        public String taskDescription;
        public String taskDeveloper;
        public int taskDuration;
        public String taskStatus;
        public int taskNumber;
        public String developer;

        public Task(String taskName, String taskDescription, String taskDeveloper, int taskDuration, String taskStatus) {
            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.taskDeveloper = taskDeveloper;
            this.taskDuration = taskDuration;
            this.taskStatus = taskStatus;
            this.taskNumber = taskNumber;
        }

        public Task(String taskName, String taskDescription, String taskDeveloper, int taskDuration, String taskStatus, String taskID, LocalDate dueDate) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public String createTaskID() {
            String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + taskDeveloper.substring(taskDeveloper.length() - 3).toUpperCase();
            return taskID;
        }

        public String printTaskDetails() {
            return "Task Name: " + taskName +
                   "\nDescription: " + taskDescription +
                   "\nDeveloper: " + taskDeveloper +
                   "\nDuration: " + taskDuration + " hours" +
                   "\nStatus: " + taskStatus +
                   "\nTask ID: " + createTaskID();
        }
    }

    public static int returnTotalHours() {
        return totalHours;
    }
}
