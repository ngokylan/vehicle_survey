/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Exceptions.InvalidRecordException;
import data_objects.File;
import data_objects.RecordCollection;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import report.DistanceReport;
import report.PeakVolumeReport;
import report.Report;
import report.SpeedReport;
import report.VehicleDaySessionReport;
import report.VehicleDirectionReport;

/**
 * 
 * @author ducnguyen
 */
public class Application {
    public static final String APPLICATION_QUESTION_PROMPT = "Welcome to Vehicle Survey application.\nPlease select a below report option\n"
            + "1 - display total vehicle counts in each direction\n"
            + "2 - display total vehicle counts for each day session\n"
            + "3 - peak volume times\n"
            + "4 - rough speed in traffic\n"
            + "5 - rough distance between cars\n\n"
            + "Please enter here: ";
    public static final String TOTAL_VEHICLE_COUNT_MESSAGE = "";
    
    /**
     *
     * @throws URISyntaxException
     * @throws IOException
     * @throws InvalidRecordException
     */
    public static void start(String filePath) throws URISyntaxException, IOException, InvalidRecordException
    {
        File file = new File();
        if(filePath.equals(""))
        {
            filePath = File.FOLDER_NAME + File.FILE_NAME;
        }
        RecordCollection recordCollection = file.readRecordFromFile(filePath);       

        Scanner scanner = new Scanner(System.in);
        try{
            
            /**
             * Prompt user to select the report type:
             * 1 - display total vehicle counts in each direction
             * 2 - display total vehicle counts for each day session
             * 3 - peak volume times
             * 4 - rough speed in traffic
             * 5 - rough distance between cars
             */
            int reportChoice = Application.readUserInput(scanner, Application.APPLICATION_QUESTION_PROMPT);
            
            switch(reportChoice)
            {
                case Report.COUNT_VEHICLE_EACH_DIRECTION:
                    VehicleDirectionReport vehicleEachDirectionReport = new VehicleDirectionReport(recordCollection);
                    vehicleEachDirectionReport.calculateReport();

                    break;
                case Report.COUNT_VEHICLE_EACH_EACH_DAY_SESSION:
                    VehicleDaySessionReport vehicleDaySessionReport = new VehicleDaySessionReport(recordCollection);
                    vehicleDaySessionReport.calculateReport();

                    break;  
                case Report.COUNT_VEHICLE_DURING_PEAK_VOLUMN_TIMES:
                    PeakVolumeReport peakVolumeReport = new PeakVolumeReport(recordCollection);
                    peakVolumeReport.calculateReport();

                    break;
                case Report.AVERAGE_SPEED:
                    SpeedReport speedReport = new SpeedReport(recordCollection);
                    speedReport.calculateReport();

                    break;
                case Report.DISTANCE_BETWEEN_CAR:
                    DistanceReport distanceReport = new DistanceReport(recordCollection);
                    distanceReport.calculateReport();

                    break;
            }   
        }
        finally{
            scanner.close();
        }
    }
    
    /**
     *
     * @param scanner
     * @param inputMessage
     * @return
     */
    protected static int readUserInput(Scanner scanner, String inputMessage)
    {
        System.out.println(inputMessage);
        return scanner.nextInt();
    }
}
