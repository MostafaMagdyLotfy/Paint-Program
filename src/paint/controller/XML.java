/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import paint.model.Shape;
import paint.model.Square;
import paint.view.view1;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FilterInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import paint.model.Elipse;


/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class XML implements Strategy{
    Shape n[];
      List<Shape>m=new ArrayList<Shape>();
public XML(Shape[] n){
    this.n=n;
}
    @Override
    public void Save(String filename) {
          FileOutputStream fos=null;
        try {
            fos = new  FileOutputStream(new File(filename)+".xml");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        }
                    XMLEncoder encoder =new  XMLEncoder(fos);
                     encoder.writeObject(n.length);
            for(int i=0;i<n.length;i++)
            { 
            
               
                   
                    encoder.writeObject(n[i]);
                   
                 
                    
              
                            
            }
            
        encoder.close();
           try {
                        fos.close();
                    } catch (IOException ex) {
                        Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }

    @Override
    public void Load(String filename) {
        
         int i=0;
        try {
            FileInputStream Fos = new  FileInputStream(new File(filename));
            XMLDecoder decoder=new XMLDecoder (Fos);
    int d=(int)decoder.readObject();
    
         
        System.out.println(d);      
     while(d!=0)
     {
      m.add((Shape)decoder.readObject());
      d--;
     }
            try {
                Fos.close();
            } catch (IOException ex) {
                Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(m.get(m.size()-1).getProperties());
       
    }

    @Override
    public List<Shape> get() {
        return m; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
