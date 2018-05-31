/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import Exceptions.InvalidRecordException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducnguyen
 */
public class RecordCollection {
    public static final int VALID_RECORD_LIMIT_LENGTH = 2;
    private ArrayList<Record> Records;

    /**
     * 
     */
    public RecordCollection() {
        this.Records = new ArrayList<Record>();
    }
    
    /**
     * 
     * @param rawRecords
     * @throws InvalidRecordException
     * @throws NumberFormatException 
     */
    public void transformDataToObjects(List<String> rawRecords) throws InvalidRecordException, NumberFormatException
    {
        if(!rawRecords.isEmpty() && rawRecords.size() > 0)
        {
            int lineNumber = 1;
            for(String rawRecord: rawRecords)
            {
                if(rawRecord.length() >= this.VALID_RECORD_LIMIT_LENGTH
                    && Integer.parseInt(rawRecord.substring(1, rawRecord.length()-1)) > 0
                )
                {
                    this.Records.add(new Record(rawRecord));
                }
                else
                {
                    throw new InvalidRecordException("Invalid data on line " + lineNumber);
                }
                lineNumber++;
            }
        }
    }

    /**
     * @return the Records
     */
    public ArrayList<Record> getRecords() {
        return Records;
    }

    /**
     * @param Records the Records to set
     */
    public void setRecords(ArrayList<Record> Records) {
        this.Records = Records;
    }
}
