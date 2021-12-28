/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import paint.model.Shape;

/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Memento {
   
   private Shape s;

   public Memento(Shape s){
  
      this.s=s;
   }
     public Shape getShape(){
      return s;
   }	
}
