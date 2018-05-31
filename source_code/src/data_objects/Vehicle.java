/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

/**
 *
 * @author ducnguyen
 */
public class Vehicle {
    public static final String NORTH_BOUND_DIRECTION = "Northbound";
    public static final String SOUTH_BOUND_DIRECTION = "Southbound";
    public static final Double AXLES_DISTANCE = 0.0025;
    
    protected long firstAxleHosesATimestamp;
    protected long secondAxleHosesATimestamp;
    protected long firstAxleHosesBTimestamp;
    protected long secondAxleHosesBTimestamp;
    protected String direction;
    protected float speed;
            
    public Vehicle() {
        this.firstAxleHosesATimestamp = 0;
        this.secondAxleHosesATimestamp = 0;
        this.firstAxleHosesBTimestamp = 0;
        this.secondAxleHosesBTimestamp = 0;
        this.direction = Vehicle.NORTH_BOUND_DIRECTION;
        this.speed = 0;
    }
    
    /**
     * 
     * @param timestamp
     * @param hosesType 
     */
    public void setTimeStamp(long timestamp, String hosesType)
    {
        if(hosesType.equals("A"))
        {
            if(this.getFirstAxleHosesATimestamp()== 0)
            {
                this.setFirstAxleHosesATimestamp(timestamp);
            }
            else if(this.getSecondAxleHosesATimestamp()== 0)
            {
                this.setSecondAxleHosesATimestamp(timestamp);
            }
        }
        else
        {
            if(this.getFirstAxleHosesBTimestamp()== 0)
            {
                this.setFirstAxleHosesBTimestamp(timestamp);
                this.setDirection(Vehicle.SOUTH_BOUND_DIRECTION);
            }
            else if(this.getSecondAxleHosesBTimestamp()== 0)
            {
                this.setSecondAxleHosesBTimestamp(timestamp);
                this.setDirection(Vehicle.SOUTH_BOUND_DIRECTION);
            }
        }
    }
    
    /**
     * 
     * @return 
     */
    public boolean isDataFullySet()
    {
        return (this.getFirstAxleHosesATimestamp()!= 0 && this.getSecondAxleHosesATimestamp()!= 0);
    } 
    
    /**
     * 
     * @param countVehicle
     * @return 
     */
    public String toString(int countVehicle)
    {
        return String.format("Vehicle %d (1st axle: %d, 2nd axle: %d, direction: %s)", countVehicle, this.firstAxleHosesATimestamp, this.secondAxleHosesATimestamp, this.direction);
    }

    /**
     * @return the firstAxleHosesATimestamp
     */
    public long getFirstAxleHosesATimestamp() {
        return firstAxleHosesATimestamp;
    }

    /**
     * @param firstAxleHosesATimestamp the firstAxleHosesATimestamp to set
     */
    public void setFirstAxleHosesATimestamp(long firstAxleHosesATimestamp) {
        this.firstAxleHosesATimestamp = firstAxleHosesATimestamp;
    }

    /**
     * @return the secondAxleHosesATimestamp
     */
    public long getSecondAxleHosesATimestamp() {
        return secondAxleHosesATimestamp;
    }

    /**
     * @param secondAxleHosesATimestamp the secondAxleHosesATimestamp to set
     */
    public void setSecondAxleHosesATimestamp(long secondAxleHosesATimestamp) {
        this.secondAxleHosesATimestamp = secondAxleHosesATimestamp;
    }

    /**
     * @return the firstAxleHosesBTimestamp
     */
    public long getFirstAxleHosesBTimestamp() {
        return firstAxleHosesBTimestamp;
    }

    /**
     * @param firstAxleHosesBTimestamp the firstAxleHosesBTimestamp to set
     */
    public void setFirstAxleHosesBTimestamp(long firstAxleHosesBTimestamp) {
        this.firstAxleHosesBTimestamp = firstAxleHosesBTimestamp;
    }

    /**
     * @return the secondAxleHosesBTimestamp
     */
    public long getSecondAxleHosesBTimestamp() {
        return secondAxleHosesBTimestamp;
    }

    /**
     * @param secondAxleHosesBTimestamp the secondAxleHosesBTimestamp to set
     */
    public void setSecondAxleHosesBTimestamp(long secondAxleHosesBTimestamp) {
        this.secondAxleHosesBTimestamp = secondAxleHosesBTimestamp;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    /**
     * 
     * @return 
     */
    public Double getCalculateSpeed()
    {
        /**
         * vehicle speed
         *  = ((vehicle second axles timestamp - vehicle first axle timestamp) * 360000) / 2.5 / 1000 meters
         * 
         * note: 
         *  - 2.5 meters is the wheelbase between first and second axles
         *  - 3600000 is 1 hour, the speed will be measure in km/hour
         *  - 1000 is 1000 meter = 1km
         * 
         */
        Double time = (double) (this.secondAxleHosesATimestamp - this.firstAxleHosesATimestamp) / 3600000;

        return (double) Vehicle.AXLES_DISTANCE / time;
    }
}
