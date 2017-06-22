/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boggle;

import core.Board;
import inputOutput.ReadDataFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import userInterface.BoggleUi;

/**
 *
 * @author jordanvictor4
 */
public class Boggle {
    
    //1.a.c.b.d creating the member variables
    private static ArrayList<String> boggleData = new ArrayList();
    
    private static ArrayList<String> dictionaryData = new ArrayList();
    
    private static String dataFileName = new String("../data/BoggleData.txt");
            
    private static String dictionaryFileName = new String("../data/Dictionary.txt");
    
    
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Welcome to Boggle!");
        //JOptionPane.showMessageDialog(null, "Let's Play Boggle!");
        
        // 1a.b instantiate instance of class readdatafile boggledata and call populatedata
        ReadDataFile data = new ReadDataFile(dataFileName);
        data.populateData();
        
        // 1c.d instantiate instance of class readdatafile dictionary data and call populatedata
        ReadDataFile dictionary = new ReadDataFile(dictionaryFileName);
        dictionary.populateData();
       
        // 1e.f instantiate instance of class Board and call getdata, call populateDice
        Board board = new Board(data.getData(), dictionary.getData());
        board.populateDice();
        
        BoggleUi Ui = new BoggleUi(board);
        
        //set member variabble of class ArrayList stores Boggle data to method shakedice in baord
        boggleData = board.shakeDice();
       
        //output to ide
        //System.out.println("There are " + dictionary.getData().size() + " entries in the dictionary" );
       
           
        
    }

   
    }

