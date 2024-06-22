import eComerce.Articulos;
import eComerce.Carrito;
import eComerce.Usuarios;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // OBTENER LOS DATOS DE LA BD
        Articulos art1 = new Articulos(0, "pantalon cargo", "pantalon", 1500, 15, false, 0, "http://www.pics.com");

        System.out.println("El id del producto es: " + art1.getArticuloID());
        System.out.println("El nombre del producto es: " + art1.getNombreProducto());
        System.out.println("La categoría del producto es: " + art1.getCategoria());
        System.out.println("El precio del producto es: $" + art1.getPrecio());
        System.out.println("El stock del producto es: " + art1.getStock());
        System.out.println("¿Tiene descuento?: " + art1.isTieneDescuento());
        System.out.println("El descuento es de: " + art1.getDescuento() + "%");
        System.out.println("La URL de la foto del producto es: " + art1.getFoto());

        art1.mostrarArticulo();

        // carrito
        // obtener los datos de la bd
        Carrito carrito1 = new Carrito(0, null, 0, null);

        

        //usuario
        Usuarios usu1 = new Usuarios(153, "merlin", "medina", "merlin@gmail.com", "1234", 153, "Argentina");


        // esto lo ejecuta el cliente desde la pagina web
        carrito1.agregarAlCarrito(usu1, art1, 4);

    }
}