package eComerce;

/**
 * Clases que representa al usuario admin, hijo de usuarios.
 * permite agregar, modificar y borrar articulos.
 * 
 * @author Grupo 4 comisión 24119 codo a codo 2024
 * @since 20/6/24
 */

public class UsuarioAdmin extends Usuarios {

    private boolean admin = true;

    // Constructores
    public UsuarioAdmin(int usuarioID, String nombre, String apellido, String email, String clave,
            int fechaDeNacimiento, String pais, boolean admin) {
        super(usuarioID, nombre, apellido, email, clave, fechaDeNacimiento, pais);
        this.admin = admin;
    }

    // Getters y Setters
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    // Metodos del admin
   // este metodo no es necesario, si se puede modificar desde modificarArticulo
    public void sumarStock(int cantidad) {
        stock += cantidad;
    }

    // Modificar un articulo y stock
    public void modificarArticulo(int idArticulo, String nombreActualizado, String descripcionActualizada,
            double precioActualizado) {
        // Obtener el artículo a modificar
        Articulo articuloAModificar = recuperarArticulo(idArticulo);

        // Validar permisos de administrador
        if (admin) {
            // Verificar si el nombre ha cambiado
            if (!articuloAModificar.getNombreProducto().equals(nombreActualizado)) {
                articuloAModificar.setNombreProducto(nombreActualizado);
                System.out.println("Nombre del artículo actualizado: " + nombreActualizado);
            }

            // ... (Modificar otras propiedades del artículo)

            // Actualizar el artículo en la base de datos
            actualizarArticulo(articuloAModificar);
        } else {
            System.out.println("Error: Permisos insuficientes para modificar el artículo.");
        }
    }

    // Agregar articulo
    public void agregarArticulo(String nombre, String descripcion, double precio, int stock) {
        // Implementar la lógica para agregar un nuevo artículo a la venta
        // En este ejemplo, se simula la creación de un nuevo artículo en memoria
        System.out.println("Artículo agregado: " + nombre + " - Descripción: " + descripcion + ", Precio: " + precio
                + ", Stock: " + stock);
    }

    // Elimina articulos
    public void eliminarArticulo(int idArticulo) {
        // Implementar la lógica para eliminar un artículo de la venta
        // En este ejemplo, se simula la eliminación de un artículo almacenado en
        // memoria
        System.out.println("Artículo eliminado: " + idArticulo);
    }

}
