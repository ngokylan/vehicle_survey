/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import data_objects.Vehicle;
import data_objects.Day;
import data_objects.Record;
import data_objects.RecordCollection;
import java.util.ArrayList;

/**
 *
 * @author ducnguyen
 */
public abstract class Report {
    public static final int COUNT_VEHICLE_EACH_DIRECTION = 1;
    public static final int COUNT_VEHICLE_EACH_EACH_DAY_SESSION = 2;
    public static final int COUNT_VEHICLE_DURING_PEAK_VOLUMN_TIMES = 3;
    public static final int AVERAGE_SPEED = 4;
    public static final int DISTANCE_BETWEEN_CAR = 5;
    
    protected RecordCollection recordCollection;
    
    /**
     * 
     * @param recordCollection 
     */
    Report(RecordCollection recordCollection)
    {
        this.recordCollection = recordCollection;
    }
    
    /**
     * 
     * @return Day[]
     */
    public ArrayList<Day> calculateVehicles()
    {
        Vehicle vehicle = new Vehicle();
        Day day = new Day();
        ArrayList<Day> days = new ArrayList<>();
        long higherTimeStamp = 0;
        for(int i = 0; i < this.recordCollection.getRecords().size(); i++)
        {
            Record record = this.recordCollection.getRecords().get(i);   
            long currentRecordTimeStamp = record.getTime().getMilliseconds();
            
            /**
             * check if the next record is exist 
             * and same type as the current one
             */
            if((i + 1) < this.recordCollection.getRecords().size())
            {
                Record nextRecord = this.recordCollection.getRecords().get(i + 1);
                
                /**
                * Append vehicle to the day list
                * 
                * Initialize a new vehicle object
                * when the current vehicle object data (including first and second axle) are fully set
                */
                if(vehicle.isDataFullySet())
                {
                   day.addVehicleToDay(vehicle);
                   vehicle = new Vehicle();
                }
                
                vehicle.setTimeStamp(currentRecordTimeStamp, record.getRecordType());               
            }
            
            /**
             * The current record is a same day if
             * the current record milliseconds timestamp is higher than the previous one
             */
            if(currentRecordTimeStamp <= higherTimeStamp)
            {
                /**
                 * the current record is belonged to the next day
                 */
                days.add(day);
                day = new Day();
            }
            
            /**
             * if only 1 day records available
             */
            if(days.size() == 0 && i == this.recordCollection.getRecords().size() - 1)
            {
                days.add(day);
            }
            
            higherTimeStamp = currentRecordTimeStamp;
        }
        
        return days;
    }
    
    public abstract void calculateReport();
}
