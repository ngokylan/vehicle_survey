/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import Exceptions.InvalidRecordException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ducnguyen
 */
public class File {
    public static final String FOLDER_NAME = "/Users/ducnguyen/NetBeansProjects/vehicle_survey/src/datasource/";
    public static final String FILE_NAME = "data_input.txt";
    
    /**
     * 
     * @return
     * @throws URISyntaxException
     * @throws IOException
     * @throws InvalidRecordException 
     */
    public RecordCollection readRecordFromFile(String fileName) throws URISyntaxException, IOException, InvalidRecordException
    {
//        URI uri = null;
//        uri = ClassLoader.getSystemResource(fileName).toURI();
//        
//        RecordCollection recordCollection = new RecordCollection();
//        Stream<String> lines = Files.lines(Paths.get(uri));
//        recordCollection.transformDataToObjects(lines.collect(Collectors.toList()));
        
        ArrayList<String> tempArrayList = new ArrayList<String>();
        BufferedReader bR = new BufferedReader(new FileReader(fileName));
        String readFromFile;
        while((readFromFile = bR.readLine()) !=null )
        {
            tempArrayList.add(readFromFile);
        }
        
        if(bR != null)
        {
            bR.close();
        }
        
        RecordCollection recordCollection = new RecordCollection();
        recordCollection.transformDataToObjects(tempArrayList);
            
        return recordCollection;
    }
    
    
}
