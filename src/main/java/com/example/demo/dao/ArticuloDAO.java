package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import com.example.demo.db.ConnectorDB;

import com.example.demo.model.Articulo;

/**
 * Esta clase agrupa todas las consultas a la tabla articulos
 */

public class ArticuloDAO {

    public List<Articulo> listar() {

        try {
            Statement st = ConnectorDB.getSt();
            ResultSet rs = st.executeQuery("SELECT * FROM articulos");

            List<Articulo> listArticulos = new ArrayList<Articulo>();
            while (rs.next()) {
                // mapeo de tablas relacionales a objetos
                // orm = mapeo objeto-relacional
                Articulo articulo = new Articulo(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("categoria"),
                        rs.getFloat("precio"), rs.getInt("stock"),
                        rs.getInt("descuento"), rs.getString("foto"));

                listArticulos.add(articulo);
            }

            return listArticulos;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public Boolean add(Articulo articulo) {
        try {
            Statement st = ConnectorDB.getSt();
            Integer cantInsert = st
                    .executeUpdate("INSERT INTO articulos (nombre, categoria, precio,stock,descuento,foto) VALUES ('"
                            + articulo.getNombre() + "', '" + articulo.getCategoria() + "', " + articulo.getPrecio()
                            + ", " + articulo.getStock() + ", " + articulo.getDescuento() + ",'" + articulo.getFoto()
                            + "')");

            Boolean insertOk = (cantInsert == 1);

            return insertOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Boolean del(Articulo articulo) {
        try {
            Statement st = ConnectorDB.getSt();
            Integer cantDel = st.executeUpdate("DELETE FROM articulos WHERE id=" + articulo.getId());

            Boolean delOk = (cantDel == 1);

            return delOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Articulo artInfo(Integer id) {

        try {
            Statement st = ConnectorDB.getSt();
            ResultSet rs = st.executeQuery("SELECT * FROM `articulos` WHERE id = '" + id + "'");

            if (rs.next()) {
                Articulo articulo = new Articulo(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("categoria"), rs.getFloat("precio"), rs.getInt("stock"),
                        rs.getInt("descuento"), rs.getString("foto"));

                return articulo;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // método que busca todos los articulos por categoria
    public List<Articulo> buscarPorCat(String categoria) {

        try {
            Statement st = ConnectorDB.getSt();
            ResultSet rs = st.executeQuery("SELECT * from articulos where categoria like '" + categoria + "%'");

            List<Articulo> listArticulo = new ArrayList<Articulo>();

            while (rs.next()) {
                Articulo articulo = new Articulo(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("categoria"), rs.getFloat("precio"), rs.getInt("stock"),
                        rs.getInt("descuento"), rs.getString("foto"));
                listArticulo.add(articulo);
            }

            return listArticulo;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
