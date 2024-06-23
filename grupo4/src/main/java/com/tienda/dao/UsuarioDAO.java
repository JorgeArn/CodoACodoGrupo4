package com.tienda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tienda.db.ConnectorDB;

/**
 * Esta clase agrupa todas las consultas a la tabla ususarios
 * consultas, insert, update, delete
 */

public class UsuarioDAO {

    public void listar(){
        try {
            Statement st= ConnectorDB.getSt(); // statement es el conector entre java y sql. que ya lo tengo en connectorDB
            ResultSet rs= st.executeQuery("SELECT * FROM usuarios");// ejecucion de la consulta. en resulset tengo todos los artículos
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getString("apellido"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("admin"));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
