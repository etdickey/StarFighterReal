package starfighterreal;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    public MovingThing(){
        this(10,10,10,10,new Color(255,0,0));
    }
    public MovingThing(int x, int y){
        this(x,y,10,10,new Color(255,0,0));
    }
    public MovingThing(int x, int y,Color c){
        this(x,y,10,10,c);
    }
    public MovingThing(int x,int y,int w,int h){
        this(x,y,w,h,new Color(255,0,0));
    }
    public MovingThing(int x,int y,int w,int h,Color c){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = c;
    }
    public abstract void move(String direction);
    public abstract void draw(Graphics window);
    @Override
    public void setPos(int x,int y){
        xPos = x;
        yPos = y;
    }
    @Override
    public void setX(int x){
        xPos = x;
    }
    @Override
    public void setY(int y){
        yPos = y;
    }
    @Override
    public void setWidth(int w){
        width = 10;
    }
    @Override
    public void setHeight(int h){
        height = h;
    }
    @Override
    public void setColor(Color c){
        color = c;
    }
    @Override
    public int getX(){
        return xPos;
    }
    @Override
    public int getY(){
        return yPos;
    }
    @Override
    public int getWidth(){
        return width;
    }
    @Override
    public int getHeight(){
        return height;
    }
    @Override
    public Color getColor(){
        return color;
    }
    @Override
    public String toString(){
        return getX()+" "+getY()+" "+getWidth()+" "+getHeight()+" "+getColor();
    }
}