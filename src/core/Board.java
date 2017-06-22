package core;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author jordanvictor4
 */

//1a implements Iboard
public class Board implements IBoard
{

//2.a.b.c adding member variables
    private ArrayList<String> boggleData;
    
    private ArrayList<String> dictionaryData; 
    
    private ArrayList<Die> boggleDice;
 //1 Adding member variable to store game data of class string   
    private ArrayList<String> storeGameData = new ArrayList();
    
       
//3.a-c   adding customer constructer with two parameter types and instantiating member varibale Arraylist of class die
    public Board (ArrayList<String> diceData, ArrayList<String> dictionary){
    
    boggleData = diceData;
    dictionaryData = dictionary;
    boggleDice = new ArrayList<Die>();
    

    }

    @Override
    public ArrayList shakeDice()
    {
        // Printing Boggle Board to the IDE
        System.out.println("Boggle Board");
        //Setting a random Instance
        Random randomDie = new Random();
        //declaring variables 
        int choosenDie;
        //used to check if die was used
        boolean [] array = new boolean[NUMBER_OF_DICE] ;
        //using a for loop to randomly select one of the dice and call method rollDie
        for (int i=0; i < NUMBER_OF_DICE; i++)
        {
            choosenDie = randomDie.nextInt(NUMBER_OF_DICE);
            if 
                   ( array[choosenDie] == false){
           storeGameData.add(boggleDice.get(choosenDie).rollDie());
            array[choosenDie] = true;
            }
            else{
            i--;
            }
           
            
        }
        //Displaying the game board to the IDE using for loops
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(storeGameData.get((4*i)+j)+ " ");
            if (j==3)
                System.out.println();
            }
            }
        return storeGameData;
    }

 //4a-c  implement method populatedice
    @Override 
    public void populateDice()
    {
       //declaring variable of type class die and using counter to access data
      Die die;
      int counter = 0;
      //for loop to run through number of dice and sides using addletter method
        for (int dice=0;dice < NUMBER_OF_DICE; dice++)
        {
          die = new Die(); 
            for (int side=0;side < die.NUMBER_OF_SIDES;side++)
            {
                    
                    die.addLetter(boggleData.get(counter));
                    counter++;
            }
            boggleDice.add(die);
        //displaying the letters using the method call displayLetters
            
        }    
       }  
    
    /**
     * @return the storeGameData generating a getter part 2
     */
    public ArrayList<String> getStoreGameData() {
        return storeGameData;
    }




}







   
 

