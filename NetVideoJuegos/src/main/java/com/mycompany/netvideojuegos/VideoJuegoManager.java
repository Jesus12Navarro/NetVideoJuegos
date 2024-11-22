/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netvideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author strdh
 */
public class VideoJuegoManager implements Acciones<VideoJuego> {
    private final List<VideoJuego> videojuegos = new ArrayList<>();

    @Override
    public void agregar(VideoJuego videojuego) {
        // Validación para evitar IDs duplicados
        if (videojuegos.stream().anyMatch(v -> v.getId() == videojuego.getId())) {
            throw new IllegalArgumentException("El ID ya está registrado.");
        }
        videojuegos.add(videojuego);
    }

    @Override
    public List<VideoJuego> consultar() {
        if (videojuegos.isEmpty()) {
            throw new IllegalStateException("No hay videojuegos registrados.");
        }
        return new ArrayList<>(videojuegos);
    }

    public List<VideoJuego> buscarPorGenero(String genero) {
        if (videojuegos.isEmpty()) {
            throw new IllegalStateException("No hay videojuegos registrados.");
        }
        // Filtrar videojuegos por género sin importar mayúsculas o minúsculas
        List<VideoJuego> resultado = new ArrayList<>();
        for (VideoJuego v : videojuegos) {
            if (v.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(v);
            }
        }
        return resultado;
    }
    public List<VideoJuego> buscarPorPlataforma(String plataforma) {
        if (videojuegos.isEmpty()) {
            throw new IllegalStateException("No hay videojuegos registrados en esta plataforma.");
        }
        // Filtrar videojuegos por género sin importar mayúsculas o minúsculas
        List<VideoJuego> resultado = new ArrayList<>();
        for (VideoJuego v : videojuegos) {
            if (v.getPlataforma().equalsIgnoreCase(genero)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    @Override
    public void actualizarPrecio(int id, double nuevoPrecio) {
        if (nuevoPrecio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        Optional<VideoJuego> videojuegoOpt = videojuegos.stream().filter(v -> v.getId() == id).findFirst();
        if (videojuegoOpt.isEmpty()) {
            throw new IllegalArgumentException("Videojuego no encontrado.");
        }
        videojuegoOpt.get().setPrecio(nuevoPrecio);
    }

    @Override
    public void eliminar(int id) {
        VideoJuego videojuegoAEliminar = videojuegos.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
        if (videojuegoAEliminar == null) {
            throw new IllegalArgumentException("Videojuego no encontrado.");
        }
        videojuegos.remove(videojuegoAEliminar);
    }

    public int contarVideojuegos() {
        return videojuegos.size();
    }

    @Override
    public List<VideoJuego> buscarVideoJuegoPorGenero(String genero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<VideoJuego> buscarVideoJuegoPorPlataforma(String plataforma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getGenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

