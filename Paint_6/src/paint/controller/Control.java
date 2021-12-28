 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import paint.model.Shape;

/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Control implements DrawingEngine{
    private static ArrayList<Shape> shapes= new ArrayList<Shape>();
     Originator o=new Originator();
    Caretaker T= new Caretaker();
    private String vr;
    Stack<Shape> stack;
    Queue<Shape> queue;
    int count=0;
    private static Control c=new Control();
    public static Control instance(){
        return c;
    }

    private Control()
    {} 
    
 public void refresh(Graphics2D canvas)
  {
   for (Shape s:shapes){
       s.draw((Graphics2D) canvas);
       
  }
   
    
  }
public void addShape(Shape shape)
{
    shapes.add(shape);
    System.out.println(shapes.size());
    
}

public void removeShape(Shape shape)
{
    shapes.remove(shape);
}
public void updateShape(Shape oldShape, Shape newShape){
   
}

public Shape[] getShapes()
{ int i=0;
Shape[] n = new Shape[shapes.size()];
for(Shape s:shapes)
{
    n[i]=s;
    i++;
}

      return n;
    
}
/* limited to 20 steps. You consider these actions in
* undo & redo: addShape, removeShape, updateShape */
public void undo()
{
    
    o.setState(shapes.get(shapes.size()-1));
    T.add(o.saveStateToMemento());
shapes.remove(shapes.size()-1);
    
    
}
public void redo()
{
 shapes.add(o.getStateFromMemento(T.get()));
}
/* use the file extension to determine the type,
* or throw runtime exception when unexpected extension */
public void save(String path)
{
    
}
public void load(String path)
{
    
}
// *************** bonus functions ****************
/* return the classes (types) of supported shapes already exist and the
* ones that can be dynamically loaded at runtime (see Part 4) */
public java.util.List<Class<? extends Shape>> getSupportedShapes()
{
      return null;
    
}
/* add to the supported shapes the new shape class (see Part 4) */
public void installPluginShape(String jarPath)
{
    
} 

public void GetState(String m)
{
    vr.equals(m);
    
}
}
