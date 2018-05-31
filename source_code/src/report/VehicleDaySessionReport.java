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
public class VehicleDaySessionReport extends Report{

    /**
     * 
     * @param recordCollection 
     */
    public VehicleDaySessionReport(RecordCollection recordCollection) {
        super(recordCollection);
    }

    @Override
    public void calculateReport() {
        ArrayList<Day> days = super.calculateVehicles();
        
        int countDay = 0;
        int countVehicle = 0;
        for(Day currentDay: days)
        {
            countDay++;
            for(Vehicle currentVehicle: currentDay.getVehicles())
            {
                countVehicle++;
                System.out.println(String.format("Day %d: %s", countDay, currentVehicle.toString(countVehicle)));
            }    
        }
    }
}
