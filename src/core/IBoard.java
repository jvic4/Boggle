/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author jordanvictor4
 */
public interface IBoard {
    
//1.a.b adding constants
        
    public final int NUMBER_OF_DICE = 16;
    
    public final int GRID = 4;
   
  //2.b.a  adding method signatures
    public ArrayList shakeDice();
    
    public void populateDice();
    
}
