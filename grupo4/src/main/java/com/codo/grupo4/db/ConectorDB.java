package com.codo.grupo4.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConectorDB {

    private static Connection conn;
    private static Statement st;

    static {
        // Conexión a la base de datos
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_de_ropa", "root", "");

            // Creación de un statement para ejecutar consultas
            st = conn.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConn() {
        return conn;
    }

    public static Statement getSt() {
        return st;
    }

}
