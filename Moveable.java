/*
* @author Ethan Dickey
*
*
*/
package starfighterreal;

public interface Moveable
{
    public void setPos(int x,int y);
    public void setX(int x);
    public void setY(int y);
    public void setWidth(int w);
    public void setHeight(int h);
    public void setColor(java.awt.Color c);
    public void setSpeed(int s);
    
    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public java.awt.Color getColor();
    public int getSpeed();
}