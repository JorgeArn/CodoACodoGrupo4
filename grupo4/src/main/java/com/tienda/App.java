package com.tienda;

import com.tienda.dao.ArticuloDAO;
import entidades.Articulo;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println(articulo.getNombreProducto());
        }

    }
}
