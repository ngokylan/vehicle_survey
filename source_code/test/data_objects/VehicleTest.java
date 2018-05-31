/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ducnguyen
 */
public class VehicleTest {
    Vehicle vehicle;
    public static final int FirstAxleHosesATimestamp = 97573;
    public static final int SecondAxleHosesATimestamp = 97788;
    public static final int FirstAxleHosesBTimestamp = 97577;
    public static final int SecondAxleHosesBTimestamp = 97892;
    public static final String Direction = "Southbound";
    
    public VehicleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vehicle = new Vehicle();
        vehicle.setTimeStamp(FirstAxleHosesATimestamp, "A");
        vehicle.setTimeStamp(SecondAxleHosesATimestamp, "A");
        
        vehicle.setTimeStamp(FirstAxleHosesBTimestamp, "B");
        vehicle.setTimeStamp(SecondAxleHosesBTimestamp, "B");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTimeStamp method, of class Vehicle.
     */
    @Test
    public void testSetTimeStamp() {
        vehicle.setTimeStamp(FirstAxleHosesATimestamp, "A");
        System.out.println("set timestamp for first axle for hoses A");
        assertEquals(FirstAxleHosesATimestamp, vehicle.getFirstAxleHosesATimestamp());       
         
        vehicle.setTimeStamp(SecondAxleHosesATimestamp, "A");
        System.out.println("set timestamp for second axle for hoses A");
        assertEquals(97588, vehicle.getSecondAxleHosesATimestamp());       
        
        vehicle.setTimeStamp(FirstAxleHosesBTimestamp, "B");
        System.out.println("set timestamp for second axle for hoses B");
        assertEquals(97577, vehicle.getFirstAxleHosesBTimestamp());       
        
        vehicle.setTimeStamp(SecondAxleHosesBTimestamp, "B");
        System.out.println("set timestamp for second axle for hoses B");
        assertEquals(97592, vehicle.getSecondAxleHosesBTimestamp());       
    }

    /**
     * Test of isDataFullySet method, of class Vehicle.
     */
    @Test
    public void testIsDataFullySet() {
        System.out.println("isDataFullySet");
        boolean expResult = true;
        boolean result = vehicle.isDataFullySet();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Vehicle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        int countVehicle = 0;
        String expResult = String.format("Vehicle 0 (1st axle: %2d, 2nd axle: %2s, direction: %s)", FirstAxleHosesATimestamp, SecondAxleHosesATimestamp, Direction);
        String result = vehicle.toString(countVehicle);

        assertEquals(expResult, result.toString());
    }

    /**
     * Test of getFirstAxleHosesATimestamp method, of class Vehicle.
     */
    @Test
    public void testGetFirstAxleHosesATimestamp() {
        System.out.println("getFirstAxleHosesATimestamp");
       
        assertEquals(FirstAxleHosesATimestamp, vehicle.getFirstAxleHosesATimestamp());
    }

    /**
     * Test of setFirstAxleHosesATimestamp method, of class Vehicle.
     */
    @Test
    public void testSetFirstAxleHosesATimestamp() {
        System.out.println("setFirstAxleHosesATimestamp");
       
        vehicle.setFirstAxleHosesATimestamp(FirstAxleHosesATimestamp);
        
        assertEquals(FirstAxleHosesATimestamp, vehicle.getFirstAxleHosesATimestamp());
    }

    /**
     * Test of getSecondAxleHosesATimestamp method, of class Vehicle.
     */
    @Test
    public void testGetSecondAxleHosesATimestamp() {
        System.out.println("getSecondAxleHosesATimestamp");
       
        assertEquals(SecondAxleHosesATimestamp, vehicle.getSecondAxleHosesATimestamp());
    }

    /**
     * Test of setSecondAxleHosesATimestamp method, of class Vehicle.
     */
    @Test
    public void testSetSecondAxleHosesATimestamp() {
        System.out.println("setSecondAxleHosesATimestamp");
        
        vehicle.setSecondAxleHosesATimestamp(SecondAxleHosesATimestamp);
        
        assertEquals(SecondAxleHosesATimestamp, vehicle.getSecondAxleHosesATimestamp());
    }

    /**
     * Test of getFirstAxleHosesBTimestamp method, of class Vehicle.
     */
    @Test
    public void testGetFirstAxleHosesBTimestamp() {
        System.out.println("getFirstAxleHosesBTimestamp");
        
        assertEquals(FirstAxleHosesBTimestamp, vehicle.getFirstAxleHosesBTimestamp());
    }

    /**
     * Test of setFirstAxleHosesBTimestamp method, of class Vehicle.
     */
    @Test
    public void testSetFirstAxleHosesBTimestamp() {
        System.out.println("setFirstAxleHosesBTimestamp");
        
        vehicle.setFirstAxleHosesBTimestamp(FirstAxleHosesBTimestamp);
        assertEquals(FirstAxleHosesBTimestamp, vehicle.getFirstAxleHosesBTimestamp());
    }

    /**
     * Test of getSecondAxleHosesBTimestamp method, of class Vehicle.
     */
    @Test
    public void testGetSecondAxleHosesBTimestamp() {
        System.out.println("getSecondAxleHosesBTimestamp");

        assertEquals(SecondAxleHosesBTimestamp, vehicle.getSecondAxleHosesBTimestamp());
    }

    /**
     * Test of setSecondAxleHosesBTimestamp method, of class Vehicle.
     */
    @Test
    public void testSetSecondAxleHosesBTimestamp() {
        System.out.println("setSecondAxleHosesBTimestamp");
        
        vehicle.setSecondAxleHosesBTimestamp(SecondAxleHosesBTimestamp);
        assertEquals(SecondAxleHosesBTimestamp, vehicle.getSecondAxleHosesBTimestamp());
    }

    /**
     * Test of getDirection method, of class Vehicle.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        
        assertEquals(Vehicle.SOUTH_BOUND_DIRECTION, vehicle.getDirection());
    }

    /**
     * Test of setDirection method, of class Vehicle.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
       
        vehicle.setDirection(Vehicle.NORTH_BOUND_DIRECTION);
        assertEquals(Vehicle.NORTH_BOUND_DIRECTION, vehicle.getDirection());
    }
    
}
