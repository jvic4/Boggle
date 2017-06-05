package core;

import java.util.ArrayList;
/**
 *
 * @author jordanvictor4
 */
public class Board implements IBoard
{
    private ArrayList<String> diceData = new ArrayList();
    
    private ArrayList<String> dictionaryData = new Arraylist();
    
    private ArrayList<Die> gameDice;
       
    public Board (ArrayList<String> diceData, ArrayList<String> dictionary){
    
    this.diceData = diceData;
    dictionaryData = dictionary;
    Die die = new Die();
    }
    
    @Override
    public void shakeDice()
    {
        throw new UnsupportedOpperationException("Not support yet.");
    }
    
    @Override 
    public void populateDice()
    {
      Die die;
      int counter = 0;
      for (int i=0;i < NUMBER_OF_DICE;i++)
        {
            


    
        
    
    
    
           
     
            

