package entidades;

/**
 * Clases que representa a usuarios
 * 
 * @author Grupo 4 comisión 24119 codo a codo 2024
 * @since 20/6/24
 */

public class Usuario {

    // Atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;
    private String fechaDeNacimiento; // Falta poner el tipo
    private String pais;
    private Boolean admin;



    public Usuario() {
    }

    // Constructores
    public Usuario(Integer id, String nombre, String apellido, String email, String clave, String fechaDeNacimiento,
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
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
