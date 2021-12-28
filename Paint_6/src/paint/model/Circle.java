/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Circle implements Shape,Cloneable{
private Point p;
private Color c;
private Color fc;
private  Map<String,Double> m = new HashMap<String,Double>();
private String r="radius";
   private double radius;
public Circle() {
   
   
}
    @Override
    public void setPosition(Point position) {
        p=position;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getPosition() {
         return p; //To change body of generated methods, choose Tools | Templates.
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
         radius=m.get("radius");
        BasicStroke bs= new BasicStroke(4);
      g.setStroke(bs);
     g.setColor(getColor());
     if(this.fc==null)
      g.draw(new Ellipse2D.Double(p.x, p.y,radius,radius));
  else
           g.fill(new Ellipse2D.Double(p.x, p.y,radius,radius));

//To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public Object clone() throws CloneNotSupportedException
    {
        Circle circle = (Circle) super.clone();

        circle.p = (Point) p.clone();
 
        return circle;
    }
    @Override
       public boolean contains(Point zx){
        return (p.getX() < zx.getX() &&p.getY() < zx.getY() &&
                p.getX() + radius > zx.getX()  &&
           p.getY() + radius > zx.getY());
    }
}
