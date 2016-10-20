/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Hule
 */
public class View extends JFrame{
    Model model;
    int size;
    int row, col;
    JButton knapp[][];
    JPanel panGame;
    
    public View(Model model){
        //Konstruktor och model ska anropa denna metoden när ett drag görs
        this.model = model;
        this.size = model.boardSize();
        panGame = new JPanel(new GridLayout(size, size));
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panGame, "Center");
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j <size; j++){
                knapp[i][j] = new JButton(Model.getNumber(i, j));
                panGame.add(knapp[i][j]);
            }
        }
        
        
}
    public void update(){
        //få in värden och update spelbordet grafiskt
        
        
    }
}
