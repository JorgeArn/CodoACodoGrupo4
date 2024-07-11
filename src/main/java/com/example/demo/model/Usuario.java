package com.example.demo.model;

import java.util.Date;

public class Usuario {

    // Atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;
    private Date fechaDeNacimiento;
    private String pais;
    private Boolean admin;

    public Usuario() {
    }

    // Constructores
    public Usuario(Integer id, String nombre, String apellido, String email, String clave, Date fechaDeNacimiento,
            String pais, Boolean admin) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.pais = pais;
        this.admin = admin;
    }

    public Usuario(String nombre, String apellido, String email, String clave, Date fechaDeNacimiento,
            String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.pais = pais;
        this.admin = false;
    }

    public Usuario(Integer id) {
        this.id = id;
    }


    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Boolean isAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

}
