package com.tienda.dao;

import java.sql.ResultSet;
// import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import com.tienda.db.ConnectorDB;

import entidades.Articulo;

/**
 * Esta clase agrupa todas las consultas a la tabla articulos
 */

public class ArticuloDAO {

    private Statement st;

    // Constructor
    public ArticuloDAO() {
        // creo el objeto connector para luego llamar a sus metodos
        ConnectorDB connector = new ConnectorDB();
        // me conecto a la bd devuelve un statement que me permite hacerle consultas
        // asigno el statement al atributo st de esta clase
        st = connector.conectarDB();
    }

    public List<Articulo> listarArticulos() {

        try {
            ResultSet rs = st.executeQuery("SELECT * FROM articulos");

            List<Articulo> listArticulos = new ArrayList<Articulo>();
            while (rs.next()) {
                // mapeo de tablas relacionales a objetos
                // orm = mapeo objeto-relacional
                Articulo articulo = new Articulo(rs.getInt("articuloID"), rs.getString("nombreProducto"),
                        rs.getString("categoria"),
                        rs.getFloat("precio"), rs.getInt("stock"), rs.getBoolean("tieneDescuento"),
                        rs.getInt("descuento"), rs.getString("foto"));

                listArticulos.add(articulo);
            }

            return listArticulos;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    /*
    // Modificar un articulo y stock
    public void modificarArticulo(int idArticulo, String nombreActualizado, String descripcionActualizada,
            double precioActualizado) {
        // Obtener el artículo a modificar
        Articulo articuloAModificar = recuperarArticulo(idArticulo);

        // Validar permisos de administrador
        if (admin) {
            // Verificar si el nombre ha cambiado
            if (!articuloAModificar.getNombreProducto().equals(nombreActualizado)) {
                articuloAModificar.setNombreProducto(nombreActualizado);
                System.out.println("Nombre del artículo actualizado: " + nombreActualizado);
            }

            // ... (Modificar otras propiedades del artículo)

            // Actualizar el artículo en la base de datos
            actualizarArticulo(articuloAModificar);
        } else {
            System.out.println("Error: Permisos insuficientes para modificar el artículo.");
        }
    }

    // Agregar articulo
    public void agregarArticulo(String nombre, String descripcion, double precio, int stock) {
        // Implementar la lógica para agregar un nuevo artículo a la venta
        // En este ejemplo, se simula la creación de un nuevo artículo en memoria
        System.out.println("Artículo agregado: " + nombre + " - Descripción: " + descripcion + ", Precio: " + precio
                + ", Stock: " + stock);
    }

    // Elimina articulos
    public void eliminarArticulo(int idArticulo) {
        // Implementar la lógica para eliminar un artículo de la venta
        // En este ejemplo, se simula la eliminación de un artículo almacenado en
        // memoria
        System.out.println("Artículo eliminado: " + idArticulo);
    }
         */

}
