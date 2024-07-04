package com.codo.grupo4.model;


public class Articulo {

    private Integer id;
    private String nombre;
    private String categoria;
    private Double precio;
    private Integer stock;
    private Boolean tieneDescuento;
    private Integer descuento;
    private String imagen;

    
    // Constructores

    public Articulo(Integer id, String nombre, String categoria, Double precio, Integer stock, Boolean tieneDescuento,
            Integer descuento, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.tieneDescuento = tieneDescuento;
        this.descuento = descuento;
        this.imagen = imagen;
    }

    // Getters y setters

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


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Integer getStock() {
        return stock;
    }


    public void setStock(Integer stock) {
        this.stock = stock;
    }


    public Boolean getTieneDescuento() {
        return tieneDescuento;
    }


    public void setTieneDescuento(Boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }


    public Integer getDescuento() {
        return descuento;
    }


    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }


    public String getImagen() {
        return imagen;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    

}
