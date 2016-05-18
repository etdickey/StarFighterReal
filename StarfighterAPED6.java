/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starfighterreal;

/**
 * 
 * @author Ethan Dickey
 * Date Created:: 5/12/16
 * Date Last Modified:: 5/18/16
 */

import java.awt.Component;
import static java.lang.System.*;
import javax.swing.JFrame;

public class StarfighterAPED6 extends JFrame{
    public static final int WIDTH = 1280;
    public static final int LENGTH = 1024;
    public StarfighterAPED6(){
        super("STARFIGHTER");
        setSize(WIDTH,HEIGHT);
        this.setTitle("Space Invaders");
        
	OuterSpace theGame = new OuterSpace();
	((Component)theGame).setFocusable(true);
        
	getContentPane().add(theGame);
	setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{new StarfighterAPED6();}
        catch(Exception e){
            err.println(e);
        }
    }
}