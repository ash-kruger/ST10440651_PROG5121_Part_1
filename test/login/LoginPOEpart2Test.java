/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package login;

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
public class LoginPOEpart2Test {
    
    public LoginPOEpart2Test() {
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
     * Test of setUsername method, of class LoginPOEpart2.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        LoginPOEpart2 instance = new LoginPOEpart2();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginPOEpart2.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginPOEpart2 instance = new LoginPOEpart2();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class LoginPOEpart2.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        LoginPOEpart2 instance = new LoginPOEpart2();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginPOEpart2.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginPOEpart2 instance = new LoginPOEpart2();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserFirstName method, of class LoginPOEpart2.
     */
    @Test
    public void testGetUserFirstName() {
        System.out.println("getUserFirstName");
        LoginPOEpart2 instance = new LoginPOEpart2();
        String expResult = "";
        String result = instance.getUserFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserFirstName method, of class LoginPOEpart2.
     */
    @Test
    public void testSetUserFirstName() {
        System.out.println("setUserFirstName");
        String userFirstName = "";
        LoginPOEpart2 instance = new LoginPOEpart2();
        instance.setUserFirstName(userFirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserLastName method, of class LoginPOEpart2.
     */
    @Test
    public void testGetUserLastName() {
        System.out.println("getUserLastName");
        LoginPOEpart2 instance = new LoginPOEpart2();
        String expResult = "";
        String result = instance.getUserLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserLastName method, of class LoginPOEpart2.
     */
    @Test
    public void testSetUserLastName() {
        System.out.println("setUserLastName");
        String userLastName = "";
        LoginPOEpart2 instance = new LoginPOEpart2();
        instance.setUserLastName(userLastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserPassword method, of class LoginPOEpart2.
     */
    @Test
    public void testUserPassword() {
        System.out.println("UserPassword");
        String expResult = "";
        String result = LoginPOEpart2.UserPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Username method, of class LoginPOEpart2.
     */
    @Test
    public void testUsername() {
        System.out.println("Username");
        String expResult = "";
        String result = LoginPOEpart2.Username();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateDueDate method, of class LoginPOEpart2.
     */
    @Test
    public void testCalculateDueDate() {
        System.out.println("calculateDueDate");
        int daysToAdd = 0;
        String expResult = "";
        String result = LoginPOEpart2.calculateDueDate(daysToAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class LoginPOEpart2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginPOEpart2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class LoginPOEpart2.
     */
    @Test
    public void testAddTasks() {
           System.out.println("addTasks");
        LoginPOEpart2.addTasks();
        int numberOfTasks = 2;
        String taskName = "Login Feature";
        String taskDeveloper = "Robyn Harrison";
        String taskDescription = "Create Login to authenticate users";
        String taskDuration =  "8";
        String taskStatus = "ToDo";
        String dateStr = "23/03/2023";
                // TODO review the gene
        LoginPOEpart2.addTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDate method, of class LoginPOEpart2.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String dateStr = "";
        boolean expResult = false;
        boolean result = LoginPOEpart2.isValidDate(dateStr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateTaskID method, of class LoginPOEpart2.
     */
    @Test
    public void testGenerateTaskID() {
        System.out.println("generateTaskID");
        String taskName = "";
        String taskDeveloper = "";
        String expResult = "";
        String result = LoginPOEpart2.generateTaskID(taskName, taskDeveloper);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewTasks method, of class LoginPOEpart2.
     */
    @Test
    public void testViewTasks() {
        System.out.println("viewTasks");
        LoginPOEpart2.viewTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class LoginPOEpart2.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "";
        boolean expResult = false;
        boolean result = LoginPOEpart2.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class LoginPOEpart2.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int expResult = 0;
        int result = LoginPOEpart2.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
