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

/**
 *
 * @author jordanvictor4
 */
public class Boggle {
    
    private static ArrayList<String> boggleData = new ArrayList();
    
    private static ArrayList<String> dictionaryData = new ArrayList();
    
    private static String dataFileName = new String("BoggleData.txt");
            
    private static String dictionaryFileName = new String ("Dictionary.txt");
    
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Boggle!");
        JOptionPane.showMessageDialog(null, "Let's Play Boggle!");
        
        ReadDataFile data = new ReadDataFile(dataFileName);
        data.populateData();
        
        ReadDataFile dictionary = new ReadDataFile(dictionaryFileName);
        dictionary.populateData();
        
        Board board = new Board(data.getData(), dictionary.getData());
        board.populateDice();
        
        System.out.println("There are " + dictionary.getData().size() + "entries in the dictionary" );
        
        
    }

   
    }

