package Modelos;

public class Cliente {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String email;
    private String ciudad;


    public Cliente() {
    }

    public Cliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email, String ciudad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
    }

    
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void registro(String cedula, String nombres, String apellidos, String telefono, String direccion, String email, String ciudad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
        System.out.println("Registro exitoso del cliente.");
    }

    // Método para actualizar los datos del cliente
    public void actualizar(String telefono, String direccion, String email) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        System.out.println("Actualización exitosa del cliente.");
    }

    // Método para eliminar los datos del cliente
    public void eliminar() {
        this.cedula = null;
        this.nombres = null;
        this.apellidos = null;
        this.telefono = null;
        this.direccion = null;
        this.email = null;
        this.ciudad = null;
        System.out.println("Eliminación exitosa del cliente.");
    }

    // Método para consultar y mostrar los datos del cliente
    public void consultar() {
        System.out.println("Datos del cliente:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Email: " + email);
        System.out.println("Ciudad: " + ciudad);
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }



}
