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
        this(20,20,2); //fix
    }
    public Ammo(int x,int y){
        super(x,y,8,10);
    }
    public Ammo(int x,int y,int s){
        super(x,y,8,10,new Color(255,0,0));
        speed = s;
    }
    public Ammo(int x,int y,int s,Color c){
        super(x,y,8,10,c);
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
        Color temp = window.getColor();
        window.setColor(getColor());
        window.fillRect(getX(), getY(), getWidth(), getHeight());
        window.setColor(temp);
    }
    @Override
    public void move(String direction){ //doesn't use direction
        setY(getY()-getSpeed());
    }
    @Override
    /*
    *@param return format x y speed
    */
    public String toString(){
        return getX()+" "+getY()+" "+getSpeed();
    }
}