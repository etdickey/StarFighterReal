package starfighteraped6;

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
            URL url = getClass().getResource("/images/ship.jpg");
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
        
    }
    @Override
    public void draw(Graphics window){
        window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
    }
    @Override
    public String toString(){
        return super.toString() + getSpeed();
    }
}