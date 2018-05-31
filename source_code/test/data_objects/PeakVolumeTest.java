/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import java.util.ArrayList;
import java.util.Calendar;
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
public class PeakVolumeTest {
    
    public PeakVolumeTest() {
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
     * Test of appendTimeBlock method, of class PeakVolume.
     */
    @Test
    public void testAppendTimeBlock() {
        System.out.println("appendTimeBlock");
        int milliseconds = 0;
        PeakVolume instance = new PeakVolume();
        instance.appendTimeBlock(milliseconds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of appendVehicleCount method, of class PeakVolume.
     */
    @Test
    public void testAppendVehicleCount() {
        System.out.println("appendVehicleCount");
        int count = 0;
        PeakVolume instance = new PeakVolume();
        instance.appendVehicleCount(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimes method, of class PeakVolume.
     */
    @Test
    public void testGetTimes() {
        System.out.println("getTimes");
        PeakVolume instance = new PeakVolume();
        ArrayList<Calendar> expResult = null;
        ArrayList<Calendar> result = instance.getTimes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimes method, of class PeakVolume.
     */
    @Test
    public void testSetTimes() {
        System.out.println("setTimes");
        ArrayList<Calendar> times = null;
        PeakVolume instance = new PeakVolume();
        instance.setTimes(times);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountVehicles method, of class PeakVolume.
     */
    @Test
    public void testGetCountVehicles() {
        System.out.println("getCountVehicles");
        PeakVolume instance = new PeakVolume();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.getCountVehicles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountVehicles method, of class PeakVolume.
     */
    @Test
    public void testSetCountVehicles() {
        System.out.println("setCountVehicles");
        ArrayList<Integer> countVehicles = null;
        PeakVolume instance = new PeakVolume();
        instance.setCountVehicles(countVehicles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePeakVolumeIndex method, of class PeakVolume.
     */
    @Test
    public void testCalculatePeakVolumeIndex() {
        System.out.println("calculatePeakVolumeIndex");
        PeakVolume instance = new PeakVolume();
        instance.calculatePeakVolumeIndex();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PeakVolume.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PeakVolume instance = new PeakVolume();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
