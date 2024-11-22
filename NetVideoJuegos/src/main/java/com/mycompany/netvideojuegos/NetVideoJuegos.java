/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.netvideojuegos;

/**
 *
 * @author strdh
 */
public class NetVideoJuegos {

    public static void main(String[] args) {
        VideoJuegoManager manager = new VideoJuegoManager();
        
        manager.agregar(new VideoJuego(1, "FC 24", 376.00, "Sports", "Ps4"));
        manager.agregar(new VideoJuego(2, "Call of Duty: Modern Warrfare III", 656.00, "Shots", "Ps4"));
        manager.agregar(new VideoJuego(3, "God of War", 645.00, "Fights", "Ps4"));
        manager.agregar(new VideoJuego(4, "Super Mario Party Jamboree", 526.00, "MultiPlayer", "Switch"));
        manager.agregar(new VideoJuego(3, "Dragon Ball FighterZ", 296.00, "Fights", "Switch"));

        System.out.println("Listado de videojuegos:");
        manager.consultar().forEach(System.out::println);


        System.out.println("\nVideojuegos de género 'Sports':");
        manager.buscarPorGenero("Sports").forEach(System.out::println);

        System.out.println("\nVideojuegos de Plataforma 'Switch':");
        manager.buscarPorGenero("Switch").forEach(System.out::println);

        
        System.out.println("\nActualizando precio del videojuego ID 2:");
        manager.actualizarPrecio(2, 560.00);
        manager.consultar().forEach(System.out::println);

        System.out.println("\nEliminando videojuego con ID 3:");
        manager.eliminar(3);
        manager.consultar().forEach(System.out::println);
        
        System.out.println("\nCantidad de videojuegos Existentes: " + manager.contarVideojuegos());
    }
}
