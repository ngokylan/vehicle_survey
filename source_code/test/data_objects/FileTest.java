/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import Exceptions.InvalidRecordException;
import java.io.IOException;
import java.net.URISyntaxException;
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
public class FileTest {
    
    public FileTest() {
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
     * Test of readRecordFromFile method, of class File.
     */
    @Test()
    public void testReadRecordFromFile() throws IOException, URISyntaxException, InvalidRecordException {
        System.out.println("readRecordFromFile");
        File instance = new File();
        RecordCollection result = instance.readRecordFromFile(File.FOLDER_NAME + File.FILE_NAME);
        
        assertNotNull(result.getRecords());
    }
    
    @Test(expected = NullPointerException.class)
    public void testReadRecordFromFile2() throws URISyntaxException, InvalidRecordException, IOException
    {        
        System.out.println("readRecordFromFile");
        File instance = new File();
        RecordCollection result = instance.readRecordFromFile(File.FILE_NAME);
    }
}
