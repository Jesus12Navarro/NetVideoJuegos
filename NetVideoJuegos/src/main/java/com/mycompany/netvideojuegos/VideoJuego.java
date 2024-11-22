/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netvideojuegos;

/**
 *
 * @author strdh
 */
public class VideoJuego extends Producto {
    public String genero;
    public String plataforma;

    public VideoJuego(int id, String nombrej, double precio, String genero, String plataforma) {
        super(id, nombrej, precio);
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Género del Video Juego: " + genero + ", Plataforma del juego: " + plataforma;
    }
}