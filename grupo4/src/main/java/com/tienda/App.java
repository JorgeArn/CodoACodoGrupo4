package com.tienda;

import com.tienda.dao.ArticuloDAO;
import com.tienda.model.Articulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase main del backend del ecomerce grupo 4
 * 
 * @author Grupo 4 comisión 24119 codo a codo 2024
 * @since junio 2024
 */
public class App {
    public static void main(String[] args) {

         ArticuloDAO articuloDAO = new ArticuloDAO();
        // guarda en listArticulos una lista con los objetos de la tabla articulos,
        // obtenidos en el mapeo hecho en ArticuloDAO
        List<Articulo> listArticulos = articuloDAO.listarArticulos(); 
 
        // recorre la listArticulos con el for y los muestra
        for (Articulo articulo : listArticulos) {
            System.out.println(articulo.toString());
        }

       /*  // Buscador por categoria
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la categoria: ");
        String teclado = scanner.nextLine().toLowerCase();// lo pongo en minuscula

        List<Articulo> buscador = new ArrayList<>();
        for (Articulo articulo : listArticulos) {

            // buscador de 4 letras iniciales
            String categoriaArticulo = articulo.getCategoria().toLowerCase();// lo pongo en minuscula
            if (categoriaArticulo.contains(teclado.substring(0, 4))) { // Check for 4-letter substring match
                buscador.add(articulo);
            }

            scanner.close();
        }

        // llamo al metodo mostrarArticulo con los parametros del buscador
        for (Articulo articulo : buscador) {
            articulo.mostrarArticulo();
        }*/
    } 
}
