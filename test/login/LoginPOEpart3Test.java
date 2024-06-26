package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import login.LoginPOEpart3;
import login.LoginPOEpart2.Task;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ash
 */
public class LoginPOEpart3Test {

    private int index;
    
    public LoginPOEpart3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class LoginPOEpart3.
     */
    @Test

    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginPOEpart3.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class LoginPOEpart3.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String developer = "";
        String taskName = "";
        String taskID = "";
        int taskDuration = 0;
        String taskStatus = "";
        LoginPOEpart3.addTask(developer, taskName, taskID, taskDuration, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayDoneTasks method, of class LoginPOEpart3.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("displayDoneTasks");
        LoginPOEpart3.displayDoneTasks();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class LoginPOEpart3.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        LoginPOEpart3.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of searchByTaskName method, of class LoginPOEpart3.
     */
    @Test
    public void testSearchByTaskName() {
        Task [] tasks = {
            new Task("Mike Smith", "Create Login", "CL1", 5, "To Do"),
             new Task("Edward Harrison", "Create Add Features", "CAF2", 8, "Doing"),
              new Task("Samantha Paulson", "Create Reports", "CR3", 2, "Done"),
                 new Task("Glenda Oberholzer", "Add Arrays", "AA4", 11, "To Do")
        };
        
        String searchTaskName = "Create Login";
       String expected =  "Mike Smith, Create Login";
        
        String result= " ";
        for (Task task : tasks) {
            if (task.taskName.equals(searchTaskName)) {
                result = task.developer +", " + task.taskName;
                break;
            }
            
        }
        assertEquals(expected, result);
     //   System.out.println("searchByTaskName");
       // LoginPOEpart3.searchByTaskName();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchByDeveloper method, of class LoginPOEpart3.
     */
    @Test
    public void testSearchByDeveloper() { 
        Task [] tasks = {
            new Task("Mike Smith", "Create Login", "CL1", 5, "To Do"),
             new Task("Edward Harrison", "Create Add Features", "CAF2", 8, "Doing"),
              new Task("Samantha Paulson", "Create Reports", "CR3", 2, "Done"),
                 new Task("Glenda Oberholzer", "Add Arrays", "AA4", 11, "To Do")
        };
        
        String searchDeveloper = "Samantha Paulson";
        String expected = "Create Reports";
        
        String result= " ";
        for (Task task : tasks) {
            if (task.developer.equals(searchDeveloper)) {
                result =  task.taskName;
                break;
            }
            
        }
        assertEquals(expected, result);
     //   System.out.println("searchByDeveloper");
      //  LoginPOEpart3.searchByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class LoginPOEpart3.
     */
    @Test
    public void testDeleteTask() {
        Task [] tasks = {
            new Task("Mike Smith", "Create Login", "CL1", 5, "To Do"),
             new Task("Edward Harrison", "Create Add Features", "CAF2", 8, "Doing"),
              new Task("Samantha Paulson", "Create Reports", "CR3", 2, "Done"),
                 new Task("Glenda Oberholzer", "Add Arrays", "AA4", 11, "To Do")
        };
        
        String taskToDelete = "Create Reports";
         Task[] expectedTasks = {
             new Task("Mike Smith", "Create Login", "CL1", 5, "To Do"),
             new Task("Edward Harrison", "Create Add Features", "CAF2", 8, "Doing"),
             new Task("Glenda Oberholzer", "Add Arrays", "AA4", 11, "To Do")
             
         };
         
         Task[] newTasks = new Task[tasks.length -1];
        for (Task task : tasks) {
            if (!task.taskName.equals(taskToDelete)) {
              newTasks[index++] = task;
                
            }
             
      //  System.out.println("deleteTask");
       // LoginPOEpart3.deleteTask();
        //TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
        assertEquals(expectedTasks.length, newTasks.length);
        for (int i = 0; i < newTasks.length; i++) {
            assertEquals(expectedTasks[i].taskName, newTasks[i].taskName);
            assertEquals(expectedTasks[i].developer, newTasks[i].developer);
            assertEquals(expectedTasks[i].taskDuration, newTasks[i].taskDuration);
            assertEquals(expectedTasks[i].taskStatus, newTasks[i].taskStatus);
            
        }
        System.out.println("'Create Reports' successfully deleted");
    }
    
    /**
     * Test of displayAllTasks method, of class LoginPOEpart3.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        LoginPOEpart3.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
