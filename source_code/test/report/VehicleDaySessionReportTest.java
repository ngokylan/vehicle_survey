/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import Exceptions.InvalidRecordException;
import data_objects.RecordCollection;
import data_objects.RecordCollectionTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class VehicleDaySessionReportTest {
    RecordCollection recordCollection;
    
    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    String output = "calculateReport\n" +
"Day 1: Vehicle 1 (1st axle: 98186, 2nd axle: 98333, direction: Northbound)\n" +
"Day 1: Vehicle 2 (1st axle: 499718, 2nd axle: 499886, direction: Northbound)\n" +
"";
    
    public VehicleDaySessionReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        recordCollection = new RecordCollection();
        
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(sysOut);
    }

    /**
     * Test of calculateReport method, of class VehicleDaySessionReport.
     */
    @Test
    public void testCalculateReport() throws InvalidRecordException {
        System.out.println("calculateReport");
        recordCollection.transformDataToObjects(RecordCollectionTest.rawRecords);
        VehicleDaySessionReport report = new VehicleDaySessionReport(recordCollection);
        report.calculateReport();
        String a = outContent.toString();
        assertEquals(outContent.toString(), output);
    }
    
}
