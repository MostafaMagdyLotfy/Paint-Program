/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.util.ArrayList;
import java.util.Stack;
import paint.model.Shape;

/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Caretaker {
 Stack<Memento> s=new Stack<Memento>();
 
 public Caretaker()
         {
             
         }
  public void add(Memento state){
      s.push(state);
   }
   public Memento get(){
      return s.pop();
   }

    
}
