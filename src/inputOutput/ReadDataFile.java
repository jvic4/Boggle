/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputOutput;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jordanvictor4
 */
//part 1 implementing IReadDataFile
public class ReadDataFile implements IReadDataFile
{
    //part 2.a-c adding member variables
    private Scanner inputFile;
    private String dataFileName;
    private ArrayList<String> data;
   
    //part 3 custom constructor and instantiating the member variable of type ArrayList
    public ReadDataFile(String fileName)
    {
        dataFileName = fileName;
        data = new ArrayList<String>();
    }
    //part 5 implement method populate data
    @Override
    public void populateData()
    {
        
       
        try
        {
            //instntiate an instance of JavaAPI
            URL url = getClass().getResource("/data/"+dataFileName);
           
            //instantiate class file
            File file = new File(url.toURI());
            
            //initialize scanner
            inputFile = new Scanner(file);

            //loop through the data
            while(inputFile.hasNext())
            {
                data.add(inputFile.next());
            }
        }
        catch(IOException | URISyntaxException ex)
        {
            System.out.println(ex.toString());
            ex.printStackTrace();
            
        } 
        finally
        {
            if(inputFile != null)
                inputFile.close();
        }
     
    }
    
    //part 4 adding the getter
    public ArrayList<String> getData() {
        return data;
    }

}