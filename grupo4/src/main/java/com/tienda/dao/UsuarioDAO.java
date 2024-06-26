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

    private Statement st;

    // Constructor
    public UsuarioDAO() {
        // creo el objeto connector para luego llamar a sus metodos
        ConnectorDB connector = new ConnectorDB();
        // me conecto a la bd devuelve un statement que me permite hacerle consultas
        // asigno el statement al atributo st de esta clase
        st = connector.conectarDB();
    }


       // Metodos de la clase para los usuarios:
    // Crear cuenta
    public void crearCuenta(String nombre, String correoElectronico, String contraseña) {
        // Implementar la lógica para crear la cuenta del usuario
        nombre.setNombre("Nombre");
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        System.out.println("Cuenta creada exitosamente para: " + this.nombre);
    }

    // Iniciar sesion
    public boolean iniciarSesion(String correoElectronico, String contraseña) {
        // Implementar la lógica para iniciar sesión del usuario
        // En este ejemplo, se simula la validación de credenciales almacenadas en
        // memoria
        if (this.email.equals(correoElectronico) && this.clave.equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso para: " + this.nombre);
            return true;
        } else {
            System.out.println("Credenciales incorrectas");
            return false;
        }
    }

    // Cerrar sesion
    public void cerrarSesion() {
        System.out.println("Sesión cerrada para: " + this.nombre);
    }

    // Modificar datos
    public void modificarDatosPersonales(String nombreActualizado, String correoElectronicoActualizado) {
        // Implementar la lógica para modificar los datos personales del usuario
        // En este ejemplo, se simula la actualización de los datos almacenados en
        // memoria
        this.nombre = nombreActualizado;
        this.email = correoElectronicoActualizado;
        System.out.println("Datos personales actualizados para: " + this.nombre);
    }
}
