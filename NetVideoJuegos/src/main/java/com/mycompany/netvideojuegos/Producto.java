/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netvideojuegos;

/**
 *
 * @author strdh
 */
public abstract class Producto {  
    
    protected int id;
    protected String nombrej;
    protected double precio;

    public Producto(int id, String nombrej, double precio) {
        this.id = id;
        this.nombrej = nombrej;
        setPrecio(precio);
    }

    public int getId() {
        return id;
    }

    public String getNombrej() {
        return nombrej;
    }

    public double getPrecio() {
        return precio;
    }

    public final void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio no puede ser cero.");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre del Videojuego: " + nombrej + ", Precio: " + precio;
    }
}

