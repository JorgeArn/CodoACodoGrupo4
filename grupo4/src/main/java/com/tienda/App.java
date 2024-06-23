package com.tienda;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tienda.dao.ArticuloDAO;
import com.tienda.dao.CarritoDAO;
import com.tienda.dao.UsuarioDAO;
import com.tienda.db.ConnectorDB;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // llamo a articulos dao listar.
        try {
            ArticuloDAO articuloDAO = new ArticuloDAO();
            articuloDAO.mostrarArticulo();

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println("Hello World!");
    }
}
