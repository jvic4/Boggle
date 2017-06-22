/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author jordanvictor4
 */
public interface IDie {
    //part 1a adding constant
    public final int NUMBER_OF_SIDES = 6;
    //parts 2.a-c adding method signatures
    public void displayLetters();
    
    public void addLetter(String letter);
    
    public String rollDie();


    
}
