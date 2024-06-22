package eComerce;

import java.sql.Timestamp;
// import java.util.List;

/**
 * Clases que representa un carrito del ecomerce
 * 
 * @author Grupo 4 comisión 24119 codo a codo 2024
 * @since 20/6/24
 */

public class Carrito {

    // Atributos
    private int carritoID;
    private Usuarios usuariosID;
    private int cantidad;
    // private List <Articulos> listArticulos;
    private Timestamp fecha = new Timestamp(System.currentTimeMillis());

    // private String nombreProducto;
    // private int cantidad;
    // private float precio;
    // private boolean tieneDescuento;
    // private int descuento;
    // private double total;

    // Constructores
    public Carrito(int carritoID, Usuarios usuariosID, int cantidad, Timestamp fecha) {
        this.carritoID = carritoID;
        this.usuariosID = usuariosID;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    // Getter y setters
    public int getCarritoID() {
        return carritoID;
    }

    public void setCarritoID(int carritoID) {
        this.carritoID = carritoID;
    }

    public Usuarios getUsuariosID() {
        return usuariosID;
    }

    public void setUsuariosID(Usuarios usuariosID) {
        this.usuariosID = usuariosID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    // Metodo para agregar un articulo al carrito
    public void agregarAlCarrito(Usuarios usu, Articulos art, int cantidad) {
        System.out.println(
                "El usuario " + usu.getNombre() + " " + usu.getApellido() + " Compro " + cantidad + " del articulo "
                        + art.getNombreProducto() + " y el numero de orden es " + carritoID + ", quedan un total de "
                        + art.getStock() + " articulos a la venta.");

        // reviso que haya stock
        Articulos.restarStock(art);

        System.out.println("Ahora quedan " + art.getStock() + " articulos a la venta");

    }

    // Metodo para calcular el total del carrito
    // calcularPrecioTotal(int cantidad): Este método podría ir en la clase Articulo
    // o en la clase Carrito. Si lo implementas en Articulo, debería recibir como
    // parámetro la cantidad deseada y devolver el precio total del artículo
    // multiplicado por la cantidad. Si lo implementas en Carrito, debería recibir
    // el objeto Articulo y la cantidad deseada, y devolver el precio total del
    // artículo multiplicado por la cantidad.
    public double calcularTotal() {
        
       // TODO return total;
    }

    // Metodo para quitar un producto del carrito
    public void quitarDelCarrito() {

    }

    // Metodo para vaciar el carrito
    public void vaciarCarrito() {
        // articulos.clear();
    }

}
