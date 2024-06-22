package eComerce;

/**
 * Clases que representa un artículo de indumentaria para la venta
 * 
 * @author Grupo 4 comisión 24119 codo a codo 2024
 * @since 20/6/24
 */

public class Articulos {

    // Atributos
    private int articuloID;
    private String nombreProducto;
    private String categoria;
    private float precio;
    private int stock;
    private boolean tieneDescuento;
    private int descuento;
    private String foto;

    // Constructores
    public Articulos(int articuloID, String nombreProducto, String categoria, float precio, int stock,
            boolean tieneDescuento, int descuento, String foto) {
        this.articuloID = articuloID; // este lo va a generar la bd no ponerlo
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.tieneDescuento = tieneDescuento;
        this.descuento = descuento;
        this.foto = foto;
    }

    // Getters y Setters
    public int getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(int articuloID) {
        this.articuloID = articuloID;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        // AGREGAR CONTROL DE PERFIL ADMIN
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    // Metodos de articulos
    // Metodo mostrar infomrmacion del articulo
    public void mostrarArticulo() {
        System.out.println("El id del producto es: " + articuloID);
        System.out.println("El nombre del producto es: " + nombreProducto);
        System.out.println("La categoría del producto es: " + categoria);
        System.out.println("El precio del producto es: $" + precio);
        System.out.println("El stock del producto es: " + stock);
        System.out.println("¿Tiene descuento?: " + tieneDescuento);
        System.out.println("El descuento es de: " + descuento + "%");
        System.out.println("La URL de la foto del producto es: " + foto);

    }

    // Metodos para restar stock con una venta
    public static void restarStock(Articulos art) {
        // reviso que haya stock
        if (art.getStock() > 0) {

            // Quito uno del stock
            Integer artAgregado = art.getStock();
            art.setStock(artAgregado -1 );

        } else {
            System.out.println("No hay suficiente stock del producto");
        }
    }

}