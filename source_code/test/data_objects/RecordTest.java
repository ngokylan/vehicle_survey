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
public class RecordTest {
    Record record;
    String rawRecordA = "A98186";
    String rawRecordA2 = "A1624188";
    String rawRecordB = "B1058662";
    String recordTypeA = "A";
    String recordTypeB = "B";
    long milliseconds = 98186;
    
    public RecordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        record = new Record(rawRecordA);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRecordType method, of class Record.
     */
    @Test
    public void testGetRecordType() {
        System.out.println("getRecordType");
        
        record = new Record(rawRecordA);
        assertEquals(recordTypeA, record.getRecordType());
        
        record = new Record(rawRecordB);
        assertEquals(recordTypeB, record.getRecordType());
    }

    /**
     * Test of isSameRecordType method, of class Record.
     */
    @Test
    public void testIsSameRecordType() {
        System.out.println("isSameRecordType");
        Record nextRecord = new Record(rawRecordA2);
        assertEquals(true, record.isSameRecordType(nextRecord));
        
        nextRecord = new Record(rawRecordB);
        assertEquals(false, record.isSameRecordType(nextRecord));
    }

    /**
     * Test of getValue method, of class Record.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        
        assertEquals(rawRecordA.toUpperCase(), record.getValue());
    }

    /**
     * Test of setValue method, of class Record.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        
        record.setValue(rawRecordA);
        assertEquals(rawRecordA, record.getValue());
    }

    /**
     * Test of getTime method, of class Record.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Time expResult = new Time(milliseconds);
       
        assertEquals(expResult.getMilliseconds(), record.getTime().getMilliseconds());
    }

    /**
     * Test of setTime method, of class Record.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        
        Time time = new Time(milliseconds);
        record.setTime(time);
        
        assertEquals(time, record.getTime());
        
    }
    
}
