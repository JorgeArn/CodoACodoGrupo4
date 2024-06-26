package com.tienda.model;

/**
 * Clases que representa un artículo de indumentaria para la venta
 * 
 * @author Grupo 4 comisión 24119 codo a codo 2024
 * @since 20/6/24
 */

public class Articulo {

    // Atributos
    private Integer id;
    private String nombre;
    private String categoria;
    private Float precio;
    private Integer stock;
    private Boolean tieneDescuento;
    private Integer descuento;
    private String foto;

    // Constructores
    public Articulo() {
    }

    public Articulo(Integer id, String nombre, String categoria, Float precio, Integer stock,
            Boolean tieneDescuento, Integer descuento, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.tieneDescuento = tieneDescuento;
        this.descuento = descuento;
        this.foto = foto;
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

    public void setNombreProducto(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString(){
        return "Articulo {" + "id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + ", tieneDescuento=" +  tieneDescuento + ", descuento=" + descuento + ", foto=" + foto + '}';
    }

}