/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import data_objects.Vehicle;
import data_objects.Day;
import data_objects.RecordCollection;
import java.util.ArrayList;

/**
 *
 * @author ducnguyen
 */
public class VehicleDirectionReport extends Report {

    /**
     * 
     * @param recordCollection 
     */
    public VehicleDirectionReport(RecordCollection recordCollection) {
        super(recordCollection);
    }

    @Override
    public void calculateReport() {
        ArrayList<Day> days = super.calculateVehicles();
        
        int countDay = 0;
        int countSouthboundVehicle = 0;
        int countNorthboundVehicle = 0;
        for(Day currentDay: days)
        {
            countDay++;
            for(Vehicle currentVehicle: currentDay.getVehicles())
            {
                if(currentVehicle.getDirection() == Vehicle.NORTH_BOUND_DIRECTION)
                {
                    countNorthboundVehicle++;
                }
                else
                {
                    countSouthboundVehicle++;
                }
            }    
            System.out.println(String.format("Day %d: %s (%d), %s (%d)", 
                    countDay, 
                    Vehicle.SOUTH_BOUND_DIRECTION, 
                    countSouthboundVehicle, 
                    Vehicle.NORTH_BOUND_DIRECTION, 
                    countNorthboundVehicle)
            );
        }
    }
   
}
