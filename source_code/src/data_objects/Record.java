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
public class Record {
    protected String value = ""; 
    private Time time;
    
    /**
     * Record object constructor
     * 
     * initiate a record value read from file
     * 
     * @param rawRecord 
     */
    Record(String rawRecord)
    {
        this.value = rawRecord.toUpperCase();
        this.time = new Time(this.getTimeStamp());
    }
    
    /**
     * 
     * @return 
     */
    public String getRecordType()
    {
        return (this.value.charAt(0) == 'A') ? "A" : "B";
    }
    
    /**
     * 
     * @param nextRecord
     * @return 
     */
    public boolean isSameRecordType(Record nextRecord)
    {
        return (this.value.charAt(0) == nextRecord.getValue().charAt(0));
    }
    
    /**
     * 
     * @return 
     */
    public long getTimeStamp()
    {
        return Long.parseLong(this.value.substring(1, this.value.length()));
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Time time) {
        this.time = time;
    }
}
