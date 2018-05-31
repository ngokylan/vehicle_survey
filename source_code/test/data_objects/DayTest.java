/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import java.util.ArrayList;
import java.util.Arrays;
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
public class DayTest {
    Day day;
    
    public DayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        day = new Day();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addVehicleToDay method, of class Day.
     */
    @Test
    public void testAddVehicleToDay() {
        System.out.println("addVehicleToDay");
        Vehicle vehicle = new Vehicle();

        day.addVehicleToDay(vehicle);
        assertEquals(1, day.getVehicles().size());
    }

    /**
     * Test of getVehicles method, of class Day.
     */
    @Test
    public void testGetVehicles() {
        System.out.println("getVehicles");
        Vehicle vehicle = new Vehicle();
        vehicle.setTimeStamp(VehicleTest.FirstAxleHosesATimestamp, "A");
        vehicle.setTimeStamp(VehicleTest.SecondAxleHosesATimestamp, "A");
        
        day.addVehicleToDay(vehicle);

        assertEquals(1, day.getVehicles().size());
    }

    /**
     * Test of setVehicles method, of class Day.
     */
    @Test
    public void testSetVehicles() {
        System.out.println("setVehicles");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(Arrays.asList(new Vehicle(), new Vehicle()));
        
        day.setVehicles(vehicles);
        assertEquals(2, day.getVehicles().size());
    }
    
}
