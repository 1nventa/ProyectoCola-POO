public class SistemaOperativo {
    private String nombre;
    private String version;
    private String desarrollador;

    // Constructor
    public SistemaOperativo(String nombre, String version, String desarrollador) {
        this.nombre = nombre;
        this.version = version;
        this.desarrollador = desarrollador;
    }

    // Método toString
    @Override
    public String toString() {
        return "SistemaOperativo [nombre=" + nombre + ", version=" + version + ", desarrollador=" + desarrollador + "]";
    }
}
