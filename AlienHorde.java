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

public class AlienHorde
{
	private List<Alien> aliens;
	public AlienHorde(int size){
            for(int i=0;i<size;i++){
                add(new Alien(i*50+20,20));
            }
	}
	public void add(Alien al){
            aliens.add(al);
	}
	public void drawEmAll(Graphics window){
            aliens.stream().forEach((ab) -> {
                ab.draw(window);
            });
	}
	public void moveEmAll(){
            int xAmount = (int)(Math.random()*5+1);
            int yAmount = (int)(Math.random()*5+1);
            aliens.forEach((ab) -> {
                ab.setX(xAmount);
                ab.setY(yAmount);
            });
	}
	public void removeDeadOnes(List<Ammo> shots){
            
	}
	public String toString(){
            
		return "";
	}
}