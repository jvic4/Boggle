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
public interface IBoard {
    
    public static final int NUMBER_OF_DICE = 16;
    
    public static final int GRID = 4;
    
    public ArrayList shakeDice();
    
    public void populateDice();
    
}
