package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.db.ConnectorDB;
import com.example.demo.model.Usuario;

public class UsuarioDAO {

    public List<Usuario> listar() {
        try {

            Statement st = ConnectorDB.getSt();
            ResultSet rs = st.executeQuery("Select * from usuarios");

            List<Usuario> listUsu = new ArrayList<Usuario>();
            while (rs.next()) {
                // orm: mapeo relacional objeto, lo hacen framework hibernate, jpa
                Usuario usu = new Usuario(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("apellido"), rs.getString("email"), rs.getString("clave"),
                        rs.getDate("fechaNacimiento"),
                        rs.getString("pais"), rs.getBoolean("admin"));
                listUsu.add(usu);
            }

            return listUsu;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public boolean add(Usuario usuario) {
        try {
            Statement st = ConnectorDB.getSt();

            // java.sql.Date sqlDate = new java.sql.Date(usuario.getFechaDeNacimiento().getTime());
            
    
            Integer cantInsert = st.executeUpdate(
                    "INSERT INTO usuarios (email, clave, nombre,apellido, pais,admin) VALUES ('"
                            + usuario.getEmail() + "', '"+ usuario.getClave() + "','" + usuario.getNombre() + "','" +usuario.getApellido() + "', '"+ usuario.getPais() + "'," + usuario.isAdmin() + ")");

            boolean insertOk = (cantInsert == 1);

            return insertOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Usuario login(String email, String clave) {
        try {

            Statement st = ConnectorDB.getSt();
            ResultSet rs = st
                    .executeQuery("SELECT * FROM usuarios WHERE email = '" + email + "' AND clave = '" + clave + "'");

            if (rs.next()) {

                Usuario usu = new Usuario(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("apellido"), rs.getString("email"), rs.getString("clave"),
                        new Date(rs.getDate("fechaNacimiento").getTime()) ,
                        rs.getString("pais"), rs.getBoolean("admin"));

                return usu;

            }else{
                return new Usuario();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

       public Boolean del(Usuario usuario) {
        try {
            Statement st=ConnectorDB.getSt();
            Integer cantDel=st.executeUpdate("DELETE FROM usuarios WHERE id="+usuario.getId());
            
            Boolean delOk=(cantDel==1);

            return delOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }



}
