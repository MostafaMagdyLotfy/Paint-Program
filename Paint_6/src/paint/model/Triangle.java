package paint.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Triangle implements Shape{
private Point p1;
private Point p;
private Point p2;
private Color c;
private Color fc;
private Map m;

     @Override
    public void setPosition(Point position) {
        p1=position;//To change body of generated methods, choose Tools | Templates.
    }
 public void setPosition2(Point position) {
        p=position;//To change body of generated methods, choose Tools | Templates.
    }
  public void setPosition3(Point position) {
 p2=position;//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Point getPosition() {
        return p1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
       m.putAll(properties); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Double> getProperties() {
        return m;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor(Color color) {
        c=color; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getColor() {
        return c; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFillColor(Color color) {
       fc=color; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getFillColor() {
        return fc; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics canvas) {
   Graphics2D g= (Graphics2D) canvas;
    BasicStroke bs= new BasicStroke(4);
      g.setStroke(bs);
     g.setColor(getColor());
     if(this.fc==null)
 g.drawPolygon(new int[] {p.x, p1.x, p2.x}, new int[] {p.y, p1.y, p2.y}, 3);
     else
         g.fillPolygon(new int[] {p.x, p1.x, p2.x}, new int[] {p.y, p1.y, p2.y}, 3);
   //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public Object clone() throws CloneNotSupportedException
    {
        return null;
        
    }

    @Override
    public boolean contains(Point zx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
