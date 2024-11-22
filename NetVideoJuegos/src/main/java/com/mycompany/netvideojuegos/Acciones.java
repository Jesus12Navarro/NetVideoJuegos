/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.netvideojuegos;

import java.util.List;

/**
 *
 * @author strdh
 * @param <J>
 */
public interface Acciones<J> {
    void agregar(J producto);
    List<J> consultar();
    List<J> buscarVideoJuegoPorGenero(String genero);
    List<J> buscarVideoJuegoPorPlataforma(String plataforma);
    void actualizarPrecio(int id, double nuevoPrecio);
    void eliminar(int id);

    public Object getGenero();
}
