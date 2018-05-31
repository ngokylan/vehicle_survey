/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import Exceptions.InvalidRecordException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class RecordCollectionTest {
    public static RecordCollection recordCollection;
    public static List<String> rawRecords = Arrays.asList("A98186","A98333","A499718","A499886","A638379","B638382","A638520","B638523");

    public RecordCollectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws InvalidRecordException {
        recordCollection = new RecordCollection();
        recordCollection.transformDataToObjects(rawRecords);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of transformDataToObjects method, of class RecordCollection.
     */
    @Test
    public void testTransformDataToObjects() throws Exception {
        System.out.println("transformDataToObjects");
        List<String> rawLocalRecords = Arrays.asList();
        recordCollection = new RecordCollection();
        recordCollection.transformDataToObjects(rawLocalRecords);
        assertEquals(0, recordCollection.getRecords().size());
    }

    /**
     * Test of getRecords method, of class RecordCollection.
     */
    @Test
    public void testGetRecords() {
        System.out.println("getRecords");
        
        assertEquals(rawRecords.size(), recordCollection.getRecords().size());
    }

    /**
     * Test of setRecords method, of class RecordCollection.
     */
    @Test
    public void testSetRecords() {
        System.out.println("setRecords");
        ArrayList<Record> localRecords = new ArrayList<Record>(Arrays.asList(new Record(rawRecords.get(0)), new Record(rawRecords.get(1))));
       
        recordCollection.setRecords(localRecords);
        assertEquals(localRecords.size(), recordCollection.getRecords().size());
    }
    
}
