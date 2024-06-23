package com.tienda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tienda.db.ConnectorDB;

/**
 * Esta clase agrupa todas las consultas a la tabla articulos
 */

public class ArticuloDAO {

    public void mostrarArticulo() {
        try {
            Statement st = ConnectorDB.getSt(); // statement es el conector entre java y sql. que ya lo tengo en
                                                // connectorDB
            ResultSet rs = st.executeQuery("SELECT * FROM articulos");// ejecucion de la consulta. en resulset tengo
                                                                      // todos los artículos
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("articuloID")+" nombre: " + rs.getString("nombreProducto"));
                System.out.println("categoría: " + rs.getString("categoria"));
                System.out.println("precio: $" + rs.getDouble("precio"));
                System.out.println("stock: " + rs.getInt("stock"));
                System.out.println("¿Tiene descuento?: " + rs.getBoolean("tieneDescuento"));
                System.out.println("descuento: " + rs.getInt("descuento") + "%");
                System.out.println("foto: " + rs.getString("foto"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
