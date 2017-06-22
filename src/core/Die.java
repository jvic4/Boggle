/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jordanvictor4
 */
//part 5 implementing IDie
public class Die implements IDie{
 
    //Adding member variables to store dice data
    private ArrayList<String> letters = new ArrayList<String>();
    //part 8 method displayletters with for loop
    @Override
    public void displayLetters()
    {
         for(String value : letters)
        
         {
            System.out.print(value + " ");
             
         }
    }
  //part 7 implement method addletter representing letters on die.
    @Override
    public void addLetter(String letter)
    {
        letters.add(letter);
} // Method rollDie to select one of six letters to use as game data.
    @Override
    public String rollDie()
    {   int index;
        Random ranLetter = new Random();
        index = ranLetter.nextInt(NUMBER_OF_SIDES);
        return letters.get(index);
        
    }
}  
  
