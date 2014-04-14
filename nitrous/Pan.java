package models;

import javax.persistence.Entity;
import play.db.jpa.Model;



@Entity
public class Pan extends Model {
    
    public String nombre;
    public double precio;
    public String tamaño;
    public String sabor;

    public Pan(String nombre, double precio, String tamaño, String sabor) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
        this.sabor = sabor;
    }
    
    
}