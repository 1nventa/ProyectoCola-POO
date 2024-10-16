public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;

    
    public usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", correo=" + correo + "]";
    }
}
