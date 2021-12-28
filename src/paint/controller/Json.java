/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;
import paint.model.Shape;
import paint.model.Circle;
import paint.model.Elipse;
import paint.model.LineSegment;
import paint.model.Rect;
import paint.model.Square;
import paint.model.Triangle;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Ramy, Mostafa, Ahmed
 */
public class Json implements Strategy{
  Shape n[];
    public Json(Shape[] n){
    this.n=n;
}
    @Override
    public void Save(String filename) {
    JSONObject o=new JSONObject();
 JSONArray ar= new JSONArray();

for(int i=0;i<n.length;i++)
 {
   ar.add(n[i]);
   
 }
 o.put("Shapes",ar);
      try {
          FileWriter F= new FileWriter(filename);F.write(o.toJSONString());
          F.flush();
      } catch (IOException ex) {
          Logger.getLogger(Json.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    @Override
    public void Load(String filename) {
        JSONParser parser = new JSONParser();
 
        try {
             Shape obj =(Shape) parser.parse(new InputStreamReader(new FileInputStream(filename)));
 
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray List = (JSONArray) jsonObject.get("Shapes");
 
            System.out.println(List.get(List.size()-1));
           
  
           
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Shape> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
