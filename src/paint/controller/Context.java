/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.util.List;
import paint.model.Shape;

/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Context {
    private final Strategy strategy;
 public Context(Strategy strategy){
      this.strategy = strategy;
   }
    public void save(String filename){
        strategy.Save(filename);
    }
    public void load(String filename){
        strategy.Load(filename);
    }
    public List<Shape> get()
    {
        return strategy.get();
    }
}
