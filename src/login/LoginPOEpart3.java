package login;



import javax.swing.JOptionPane;

public class LoginPOEpart3 {
    static String[] developers = new String[100];
    static String[] taskNames = new String[100];
    static String[] taskIDs = new String[100];
    static int[] taskDurations = new int[100];
    static String[] taskStatuses = new String[100];
    static int taskCount = 0;

    public static void main(String[] args) {  // Populating the array
      
        addTask("Mike Smith", "Create Login", "CL1", 5, "To Do");
        addTask("Edward Harrison", "Create Add Features", "CAF2", 8, "Doing");
        addTask("Samantha Paulson", "Create Reports", "CR3", 2, "Done");
        addTask("Glenda Oberholzer", "Add Arrays", "AA4", 11, "To Do");

        while (true) {
            String[] options = {"Display 'Done' Tasks", "Longest Task", "Search by Task Name", "Search by Developer", "Delete Task", "Display All Tasks", "Quit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    displayDoneTasks();
                    break;
                case 1:
                    displayLongestTask();
                    break;
                case 2:
                    searchByTaskName();
                    break;
                case 3:
                    searchByDeveloper();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    displayAllTasks();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    static void addTask(String developer, String taskName, String taskID, int taskDuration, String taskStatus) {
        developers[taskCount] = developer;
        taskNames[taskCount] = taskName;
        taskIDs[taskCount] = taskID;
        taskDurations[taskCount] = taskDuration;
        taskStatuses[taskCount] = taskStatus;
        taskCount++;
    }

    static void displayDoneTasks() {
        String result = "Tasks with 'Done' status:\n";
        for (int i = 0; i < taskCount; i++) {
            if ("Done".equalsIgnoreCase(taskStatuses[i])) {
                result += "Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task Duration: " + taskDurations[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void displayLongestTask() {
        int maxDuration = 0;
        int index = -1;
        for (int i = 0; i < taskCount; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                index = i;
            }
        }
        if (index != -1) {
            JOptionPane.showMessageDialog(null, "Developer: " + developers[index] + ", Task Duration: " + taskDurations[index]);
        }
    }

    static void searchByTaskName() {
        String taskName = JOptionPane.showInputDialog("Enter Task Name:");
        String result = "";
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                result += "Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Status: " + taskStatuses[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void searchByDeveloper() {
        String developer = JOptionPane.showInputDialog("Enter Developer Name:");
        String result = "";
        for (int i = 0; i < taskCount; i++) {
            if (developers[i].equalsIgnoreCase(developer)) {
                result += "Task Name: " + taskNames[i] + ", Task Status: " + taskStatuses[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void deleteTask() {
        String taskName = JOptionPane.showInputDialog("Enter Task Name to Delete:");
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                for (int j = i; j < taskCount - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                taskCount--;
                JOptionPane.showMessageDialog(null, "Task deleted successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    static void displayAllTasks() {
        String result = "All Tasks:\n";
        for (int i = 0; i < taskCount; i++) {
            result += "Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task ID: " + taskIDs[i] + ", Task Duration: " + taskDurations[i] + ", Task Status: " + taskStatuses[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }

   
}
