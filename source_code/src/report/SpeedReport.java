/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import data_objects.Day;
import data_objects.PeakVolume;
import data_objects.RecordCollection;
import data_objects.Vehicle;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author ducnguyen
 */
public class SpeedReport extends Report{

    /**
     * 
     * @param recordCollection 
     */
    public SpeedReport(RecordCollection recordCollection) {
        super(recordCollection);
    }

    @Override
    public void calculateReport() {
        /**
         * vehicle speed
         *  = (vehicle second axles timestamp - vehicle first axle timestamp) / 2.5 meters
         * 
         * note: 2.5 meters is the wheelbase between first and second axles
         */
        
        ArrayList<Day> days = super.calculateVehicles();
        
        ArrayList<PeakVolume> peakVolumes = new ArrayList<>();
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(0);
        
        for(Day day: days)
        {
            for(Vehicle vehicle: day.getVehicles())
            {
                System.out.println("Speed: " + numberFormat.format(vehicle.getCalculateSpeed()) + " km/h");
            }
        }
    } 
}
