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
    //Die die = new Die();
    }

    @Override
    public void shakeDice()
    {
        throw new UnsupportedOpperationException("Not support yet.");
    }

    @Override
    public void populateDice()
    {
      Die die; //a)
      int counter = 0; //b)
      for (int i=0;i < NUMBER_OF_DICE;i++) //c)
        {
          die = new Die(); //c.i)
          for (int j=0;j < NUMBER_OF_SIDES;j++) //c.ii)
          {
            diceData.add(die.addLetter()); //c.ii.1) Not sure how this will actually look
          }
          die.displayLetters(); //c.iii) Might need to be called on diceData instead of die?
          gameDice.add(die); //c.iii.2)
        }
    }
