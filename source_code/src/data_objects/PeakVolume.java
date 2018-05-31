/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author ducnguyen
 */
public class PeakVolume {
    private ArrayList<Calendar> times = new ArrayList<>();
    private ArrayList<Integer> countVehicles = new ArrayList<>();
    private ArrayList<Calendar> peakTimes = new ArrayList<>();

    /**
     * 
     * @param milliseconds 
     */
    public void appendTimeBlock(int milliseconds)
    {
        // today    
        Calendar time = new GregorianCalendar();
        // reset hour, minutes, seconds and millis
        time.set(Calendar.HOUR_OF_DAY, 0);
        time.set(Calendar.MINUTE, 0);
        time.set(Calendar.SECOND, 0);
        time.set(Calendar.MILLISECOND, 0);
        
        time.add(Calendar.MILLISECOND, milliseconds);
        
        getTimes().add(time);
    }
    
    /**
     * 
     * @param count 
     */
    public void appendVehicleCount(int count)
    {
        this.countVehicles.add(count);
    }

    /**
     * @return the times
     */
    public ArrayList<Calendar> getTimes() {
        return times;
    }

    /**
     * @param times the times to set
     */
    public void setTimes(ArrayList<Calendar> times) {
        this.times = times;
    }

    /**
     * @return the countVehicles
     */
    public ArrayList<Integer> getCountVehicles() {
        return countVehicles;
    }

    /**
     * @param countVehicles the countVehicles to set
     */
    public void setCountVehicles(ArrayList<Integer> countVehicles) {
        this.countVehicles = countVehicles;
    }
    
    /**
     * Loop through each block time
     * Record the time block index of the peak time
     */
    public void calculatePeakVolumeIndex()
    {
        int lowerCount = 0;
        this.peakTimes.add(this.times.get(0));
        for(int i = 0; i < this.times.size(); i++)
        {
            if(lowerCount < this.countVehicles.get(i))
            {
                lowerCount = this.countVehicles.get(i);
            }
            else
            {
                /**
                 * capture count drop
                 */
                this.peakTimes.add(this.times.get(i));
            }
        }
    }
    
    /**
     * 
     * @return String
     */
    public String toString()
    {
        this.calculatePeakVolumeIndex();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");        
        String output = "\n";
        for(Calendar peakTime: this.peakTimes)
        {
            Date time = peakTime.getTime();
            
            output += " - " + dateFormat.format(time) + "\n";
        }
        
        return output;
    }
}
