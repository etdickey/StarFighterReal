package starfighterreal;

/*
*
*@author Ethan Dickey
*
*
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class AlienHorde
{ 
	private ArrayList<Alien> aliens;
	public AlienHorde(int size){
            aliens = new ArrayList<Alien>();
            for(int i=0;i<size;i++){
//                Alien temp = new Alien((i*50+20),20);
                addAlien(new Alien(i*50+20,20));
//                aliens.add(new Alien((i*50+20),20));
//                aliens.add(temp);
            }
	}
	public void addAlien(Alien al){
            aliens.add(al);
	}
	public void drawEmAll(Graphics window){
            aliens.stream().forEach((ab) -> {
                ab.draw(window);
            });
	}
	public void moveEmAll(){
            int rand = (int)(Math.random()*2+1);
            int xAmount;
            if(((int)(Math.random()*3+1)*(int)(Math.pow((-1), rand)))+aliens.get(0).getX()>0)
                xAmount = (int)(Math.random()*3+1)*(int)(Math.pow((-1), rand));
            else
                xAmount = (int)(Math.random()*3+1);
//            out.println("-1^"+rand+" = "+Math.pow((-1), rand));
//            out.println("== "+xAmount);
            int yAmount = (int)(Math.random()*3+1);
            aliens.forEach((ab) -> {
                ab.setX(xAmount);
                ab.setY(yAmount);
            });
	}
	public void removeDeadOnes(Bullets bull){
            for(int ab=0;ab<aliens.size();ab++){
                if(aliens.get(ab).getSpeed()==0){
                    aliens.remove(ab);
                    ab--;
                }
            }
	}
	public String toString(){
            return "not implemeneted yet";
	}
}