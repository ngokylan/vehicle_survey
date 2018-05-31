/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import data_objects.Day;
import java.util.ArrayList;
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
public class ReportTest {
    
    public ReportTest() {
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
     * Test of calculateVehicles method, of class Report.
     */
    @Test
    public void testCalculateVehicles() {
        System.out.println("calculateVehicles");
        Report instance = null;
        ArrayList<Day> expResult = null;
        ArrayList<Day> result = instance.calculateVehicles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateReport method, of class Report.
     */
    @Test
    public void testCalculateReport() {
        System.out.println("calculateReport");
        Report instance = null;
        instance.calculateReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ReportImpl extends Report {

        public ReportImpl() {
            super(null);
        }

        public void calculateReport() {
        }
    }
    
}
