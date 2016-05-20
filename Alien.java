package starfighterreal;

/*
*
*@author Ethan Dickey
*
*
*/

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import static java.lang.System.*;

public class Alien extends MovingThing
{
    private int speed;
    private Image image;
    
    public Alien(){
        this(0,0,30,30,0);
    }
    public Alien(int x, int y){
        this(x,y,30,30,0);
    }
    public Alien(int x, int y, int s){
        this(x,y,30,30,s);
    }
    public Alien(int x, int y, int w, int h, int s){
        super(x,y,w,h);
        speed=s;
        try{
            File url = new File("H:\\CompSci\\Programs\\StarfighterAPED6\\"
                    + "src\\StarFighterReal\\alien.jpg");
            image = ImageIO.read(url);
        }
        catch(Exception e){
            err.println(e);
        }
    }
    @Override
    public void setSpeed(int s){
       speed=s;
    }
    @Override
    public int getSpeed(){
       return speed;
    }
    @Override
    public void move(String direction){
       
    }
    @Override
    public void draw(Graphics window){
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
    }
}