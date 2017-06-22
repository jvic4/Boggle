/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import core.Board;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author jordanvictor4
 */
public class BoggleUi {
    
JFrame frame;
JMenuBar menuBar;
JMenu menu;
JMenuItem menuItem1;
JMenuItem menuItem2;
JPanel panel1;
JButton[][] buttonDice;
JPanel panel2;
JScrollPane scroll;
JTextPane text;
JLabel labelWord;
JButton buttonWord;
JPanel panel3;
JLabel scoreLabel;
JButton button2;
JLabel labelTime;
Board boardUi; 
   
public BoggleUi(Board board){ 
        boardUi = board;
        frame = new JFrame();
        menuBar = new JMenuBar();
        menu = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        panel1 = new JPanel();
        buttonDice = new JButton[4][4];
           for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {     
                buttonDice[i][j] = new JButton();
            }
        }
        panel2 = new JPanel();
        scroll = new JScrollPane();
        text = new JTextPane();
        labelWord = new JLabel();
        buttonWord = new JButton();
        panel3 = new JPanel();
        scoreLabel = new JLabel();
        button2 = new JButton();
        labelTime = new JLabel();
 
  
       initComponents();
   }
 

private void initComponents(){
     frame.setSize(500,500);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(new BorderLayout());
     
     menuBar.add(menu);
     menu.add("Boggle");
     menuItem1.setName("New Game");
     menuItem2.setName("Exit");
     menu.add(menuItem1);
     menu.add(menuItem2);
     
     panel1.setLayout(new FlowLayout());
     panel1.add(labelWord);
     panel1.add(buttonWord);
     panel1.add(scoreLabel);
     
     panel2.setLayout(new GridLayout(4,4));
     for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {     
                panel2.add(buttonDice[i][j]);
            }
        }
     panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
     panel3.add(text);
     text.add(scroll);
     panel3.add(labelTime);
     panel3.add(button2);
     
     frame.setJMenuBar(menuBar);
     frame.add(panel1);
     frame.add(panel2);
     frame.add(panel3);
     
     frame.setVisible(true);
     
     
     
     
     
     
     
 }
}
