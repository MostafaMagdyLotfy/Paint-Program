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

public interface Strategy {
    
    public  void Save(String filename );
    public  void Load(String filename );   
    public List<Shape> get();
    
}
