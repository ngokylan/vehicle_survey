/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Exceptions.InvalidRecordException;
import java.io.IOException;
import java.net.URISyntaxException;
import data_objects.File;
import data_objects.RecordCollection;
import report.Report;

/**
 *
 * @author ducnguyen
 */
public class Vehicle_survey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try
        {
            String filePath = "";
            if(args.length != 0)
            {
                filePath = args[0];
            }
            Application app = new Application();
            app.start(filePath);
        }
        catch(URISyntaxException e)
        {
            //@todo: handle msg here
            System.out.println(e);
        }
        catch(IOException e)
        {
            //@todo: handle msg here
            System.out.println(e);
        }
        catch(InvalidRecordException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }  
}
