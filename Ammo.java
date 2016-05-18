package starfighterreal;

/*
*@author Ethan Dickey
*Date Created: 
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
    private int speed;
    public Ammo(){
        this(0,0,0); //fix
    }
    public Ammo(int x,int y){
        super(x,y);
    }
    public Ammo(int x,int y,int s){
        super(x,y);
        speed = s;
    }
    public Ammo(int x,int y,int s,Color c){
        super(x,y,c);
        speed = s;
    }
    @Override
    public void setSpeed(int s){
       speed = s;
    }
    @Override
    public int getSpeed(){
       return speed;
    }
    @Override
    public void draw(Graphics window){
        //add code to draw the ammo
    }
    @Override
    public void move(String direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
//    @Override
//    public String toString(){
//        return "";
//    }

    @Override
    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}