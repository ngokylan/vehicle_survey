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
public final class Time {
    private long hours;
    private long minutes;
    private long seconds;
    private long milliseconds;
    
    /**
     * 
     * @param milliseconds 
     */
    Time(long milliseconds)
    {
       this.milliseconds = milliseconds;
       this.seconds = (milliseconds / 1000) % 60;
       this.minutes = (milliseconds / (1000 * 60)) % 60;
       this.hours = (milliseconds / (1000 * 60 * 60)) % 24;
    }
    
    @Override
    public String toString()
    {
        return("Timestamp: " + this.getHours() + ":" + this.getMinutes() + ":" + this.getSeconds() + ":" + this.getMilliseconds());
    }

    /**
     * @return the hours
     */
    public long getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(long hours) {
        this.hours = hours;
    }

    /**
     * @return the minutes
     */
    public long getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    /**
     * @return the seconds
     */
    public long getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    /**
     * @return the milliseconds
     */
    public long getMilliseconds() {
        return milliseconds;
    }

    /**
     * @param milliseconds the milliseconds to set
     */
    public void setMilliseconds(long milliseconds) {
        this.milliseconds = milliseconds;
    }
}
