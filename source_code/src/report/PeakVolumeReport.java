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
import java.util.ArrayList;

/**
 *
 * @author ducnguyen
 */
public class PeakVolumeReport extends Report{
    public static final int MINUTE_BLOCK = 9000000;//60 minutes in milliseconds

    /**
     * 
     * @param recordCollection 
     */
    public PeakVolumeReport(RecordCollection recordCollection) {
        super(recordCollection);
    }

    @Override
    public void calculateReport() {
        ArrayList<Day> days = super.calculateVehicles();
        
        ArrayList<PeakVolume> peakVolumes = new ArrayList<>();
        
        for(Day day: days)
        {
            PeakVolume peakVolume = new PeakVolume();
            
            int minutesBlockFrom = 0;
            int minutesBlockTo = minutesBlockFrom + PeakVolumeReport.MINUTE_BLOCK;
            int countVehicles = 0;
            for(Vehicle vehicle: day.getVehicles())
            {
                /**
                 * if the current vehicle first axle timestamp
                 * within the current 15 minutes block
                 */
                if(minutesBlockFrom <= vehicle.getFirstAxleHosesATimestamp() 
                      && minutesBlockTo >= vehicle.getFirstAxleHosesATimestamp() 
                )
                {
                    countVehicles++;
                }
                else
                {
                    peakVolume.appendTimeBlock(minutesBlockTo);
                    peakVolume.appendVehicleCount(countVehicles);
                    
                    /**
                     * move on to the next 15 minutes block
                     */
                    minutesBlockFrom += PeakVolumeReport.MINUTE_BLOCK;
                    minutesBlockTo = minutesBlockFrom + PeakVolumeReport.MINUTE_BLOCK;
                    
                    //reset vehicle counter
                    countVehicles = 0;
                }
            }
            
            peakVolumes.add(peakVolume);
        }
        
        for(int i = 0; i < peakVolumes.size(); i++)
        {
            System.out.println("Day " + i + " peak times:" + peakVolumes.get(i));
        }
    }
   
}
