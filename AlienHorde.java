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
            int xAmount = (int)(Math.random()*5+1)*(int)(Math.pow((-1), rand));
//            out.println("-1^"+rand+" = "+Math.pow((-1), rand));
//            out.println("== "+xAmount);
            int yAmount = (int)(Math.random()*5+1);
            
            aliens.forEach((ab) -> {
                ab.setX(xAmount);
                ab.setY(yAmount);
            });
	}
	public void removeDeadOnes(List<Ammo> shots){
            aliens.forEach((ab) -> {
//                if(ab.getWidth) //fix
            });
	}
	public String toString(){
            
		return "asdf";
	}
}