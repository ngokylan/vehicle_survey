/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

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
public class TimeTest {
    Time time;
    long milliseconds = 93902;
    long hour = 0;
    long minute = 1;
    long second = 33;
    
    public TimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        time = new Time(milliseconds);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Time.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expectedResult = "Timestamp: 0:1:33:93902";
        assertEquals(expectedResult, time.toString());
    }

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
       
        assertEquals(hour, time.getHours());
    }

    /**
     * Test of setHours method, of class Time.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
      
        time.setHours(hour);
        assertEquals(hour, time.getHours());
    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
      
        assertEquals(minute, time.getMinutes());
    }

    /**
     * Test of setMinutes method, of class Time.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
       
        time.setMinutes(minute);
        assertEquals(minute, time.getMinutes());
    }

    /**
     * Test of getSeconds method, of class Time.
     */
    @Test
    public void testGetSeconds() {
        System.out.println("getSeconds");
        
        assertEquals(second, time.getSeconds());
    }

    /**
     * Test of setSeconds method, of class Time.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        
        time.setSeconds(second);
        assertEquals(second, time.getSeconds());
    }

    /**
     * Test of getMilliseconds method, of class Time.
     */
    @Test
    public void testGetMilliseconds() {
        System.out.println("getMilliseconds");
        
        assertEquals(milliseconds, time.getMilliseconds());
    }

    /**
     * Test of setMilliseconds method, of class Time.
     */
    @Test
    public void testSetMilliseconds() {
        System.out.println("setMilliseconds");
        
        time.setMilliseconds(milliseconds);
        assertEquals(milliseconds, time.getMilliseconds());
    }
    
}
