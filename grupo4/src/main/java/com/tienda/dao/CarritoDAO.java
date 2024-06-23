package com.tienda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tienda.db.ConnectorDB;

/**
 * Esta clase agrupa todas las consultas a la tabla carrito
 */

public class CarritoDAO {

    public void listar() {
        try {
            Statement st = ConnectorDB.getSt(); // statement es el conector entre java y sql. que ya lo tengo en
                                                // connectorDB
            ResultSet rs = st.executeQuery("SELECT carrito.CarritoID, carrito.UsuarioID, carrito.Fecha, " +
                    "detallescarrito.Cantidad, articulos.NombreProducto, articulos.TieneDescuento, articulos.Precio, " +
                    " articulos.Descuento, articulos.Foto " +
                    "FROM carrito " +
                    "JOIN detallescarrito ON carrito.CarritoID = detallescarrito.CarritoID " +
                    "JOIN articulos ON detallescarrito.ArticuloID = articulos.ArticuloID " +
                    "WHERE carrito.CarritoID = 1");

            // ejecucion de la consulta. en resulset tengo todos los artículos
            while (rs.next()) {
                // declaro variables con la consulta del resulset a la base de datos
                int carritoID = rs.getInt("CarritoID");
                int usuarioID = rs.getInt("UsuarioID");
                String fecha = rs.getString("Fecha");
                int cantidad = rs.getInt("Cantidad");
                String nombreProducto = rs.getString("NombreProducto"); // Corregido aquí
                double precio = rs.getDouble("Precio");
                boolean tieneDescuento = rs.getBoolean("TieneDescuento");
                int descuento = rs.getInt("Descuento");
                String foto = rs.getString("Foto");

                // Calcular precio con descuento aplicado
                double precioConDescuento = precio;
                if (tieneDescuento && descuento > 0) {
                    double descuentoDecimal = descuento / 100.0; // Convertir el descuento a decimal
                    precioConDescuento = precio * (1 - descuentoDecimal);
                }

                // imprimo por pantalla
                System.out.println("Numero de compra: " + rs.getInt("carritoID"));
                System.out.println("Nombre del producto: "+ nombreProducto);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio: " + precio);
                System.out.println("Foto: " + foto);
                System.out.println("Fecha de compra: " + rs.getString("fecha"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
