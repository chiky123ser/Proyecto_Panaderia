package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void Mostrar() {
         List<Pan> lista = Pan.findAll();
        renderJSON(lista);
        
        
    }
    

     public static void alta(String n,double pre,String t,String s) {
         Pan p = new Pan(n,pre,t,s).save();
        renderJSON(p);
    }
     
     public static void update(Long id, String n,double pre,String t,String s) {
      Pan p = Pan.findById(id);
      
      if(p != null)
      {
        p.nombre=n;
        p.precio=pre;
        p.tamaño=t;
        p.sabor=s;
         p.save();
      }
        renderJSON(p);
    }
     
     public static void del(Long id) {
         Pan p = Pan.findById(id);
         if (p!= null) {
             p.delete();
         }
        
        renderJSON(p);
    }
}