package starfighterreal;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import static java.lang.System.*;

public class Ship extends MovingThing
{
    private int speed;
    private Image image;

    public Ship(){
        this(10,10,10,10,10);
    }
    public Ship(int x, int y){
       this(x,y,10,10,10);
    }
    public Ship(int x, int y, int s){
       this(x,y,10,10,s);
    }
    public Ship(int x, int y, int w, int h, int s){
        super(x, y, w, h);
        speed=s;
        try{
            URL url = getClass().getResource("/ship.jpg");
            image = ImageIO.read(url);
        }
        catch(Exception e){
            err.println(e);
        }
    }
    @Override
    public void setSpeed(int s){
       speed = s;
    }
    @Override
    public int getSpeed(){
       return speed;
    }
    /**
     *
     * @param direction
     */
    @Override
    public void move(String direction){
        if(direction.equals("LEFT")){
            if(getX()-2>=0){ //screen left param = 0
                setX(getX()-2);
            }
        }
        if(direction.equals("RIGHT")){
            if(getX()+getWidth()+2<=1280){ //screen right param = 1280
                setX(getX()+2);
            }
        }
        if(direction.equals("UP")){
            if(getY()-2>=0){ //screen upper param = 1280
                setY(getY()-2);
            }
        }
        if(direction.equals("DOWN")){
            if(getY()+getHeight()+2<=985){ //screen lower param = 985
                setY(getY()+2);
            }
        }
        if(direction.equals("SPACE")){
            //implement
        }
    }
    @Override
    public void draw(Graphics window){
        window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
    }
    @Override
    public String toString(){
        return super.toString() + " " + getSpeed();
    }
}