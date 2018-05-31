/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ducnguyen
 */
public class ApplicationTest {
    
    public ApplicationTest() {
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
     * Test of start method, of class Application.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Application.start("");
        // TODO review the generated test code and remove the default call to fail.
        
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of readUserInput method, of class Application.
     */
    @Test
    public void testReadUserInput() {
        System.out.println("readUserInput");
        Scanner scanner = null;
        String inputMessage = "";
        int expResult = 0;
        int result = Application.readUserInput(scanner, inputMessage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
