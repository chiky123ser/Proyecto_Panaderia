package com.app.panaderia;

public class Pan {
	
	public int id;
	public String nombre;
    public double precio;
    public String tama�o;
    public String sabor;

    public Pan(String nombre, double precio, String tama�o, String sabor) {
        this.nombre = nombre;
        this.precio = precio;
        this.tama�o = tama�o;
        this.sabor = sabor;
    }
}
