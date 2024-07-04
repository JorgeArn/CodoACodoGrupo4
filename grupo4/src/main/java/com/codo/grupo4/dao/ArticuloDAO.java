package com.codo.grupo4.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codo.grupo4.db.ConectorDB;
import com.codo.grupo4.model.Articulo;

public class ArticuloDAO {

    // método que trae toda la lista de articulos
    public List<Articulo> listarArticulo() {
        try {
            Statement st = ConectorDB.getSt();
            ResultSet rs = st.executeQuery("SELECT * from articulos");

            List<Articulo> listArticulos = new ArrayList<Articulo>();
            while (rs.next()) {
                Articulo articulo = new Articulo(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"),
                        rs.getBoolean("tiene_descuento"), rs.getInt("descuento"), rs.getString("imagen"));
                listArticulos.add(articulo);
            }

            return listArticulos;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // método que busca todos los articulos por categoria
    public List<Articulo> buscarPorCat(String categoria) {

        try {
            Statement st = ConectorDB.getSt();
            ResultSet rs = st.executeQuery("SELECT * from articulos where categoria like '" + categoria + "%'");

            List<Articulo> listArticulo = new ArrayList<Articulo>();

            while (rs.next()) {
                Articulo articulo = new Articulo(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"),
                        rs.getBoolean("tiene_descuento"), rs.getInt("descuento"), rs.getString("imagen"));
                listArticulo.add(articulo);
            }

            return listArticulo;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // método que trae la info del artículo con el id que se pasa como parámetro
    public List<Articulo> artInfo(Integer id) {

        try {
            Statement st = ConectorDB.getSt();
            ResultSet rs = st.executeQuery("SELECT * FROM `articulos` WHERE id = '"+id+"'");

            List<Articulo> listArticulo = new ArrayList<Articulo>();

            while (rs.next()) {
                Articulo articulo = new Articulo(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"),
                        rs.getBoolean("tiene_descuento"), rs.getInt("descuento"), rs.getString("imagen"));
                listArticulo.add(articulo);
            }

            return listArticulo;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // método que agrega un nuevo articulo
    public Boolean addArticulo(Articulo articulo) {
        try {
            Statement st = ConectorDB.getSt();
            Integer cantInsert = st.executeUpdate(
                    "INSERT INTO articulos (nombre, categoria, precio, stock, tiene_descuento, descuento, imagen) VALUES ('"
                            + articulo.getNombre() + ", " + articulo.getCategoria() + ", " + articulo.getPrecio() + ", "
                            + articulo.getStock() + ", " + articulo.getTieneDescuento() + ", " + articulo.getDescuento()
                            + ", " + articulo.getImagen() + "')");
            
            Boolean insertOk = (cantInsert == 1);

            return insertOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // método que elimina un artículo
    public Boolean delArticulo(Articulo articulo) {
        try {
            Statement st = ConectorDB.getSt();
            Integer cantDel = st.executeUpdate("DELETE FROM articulos WHERE id = "+articulo.getId()+"");

            Boolean delOk = (cantDel == 1);

            return delOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;   
    }

}
