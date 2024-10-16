public class SistemaOperativo {
    private String nombre;
    private String version;
    private String desarrollador;


    public SistemaOperativo(String nombre, String version, String desarrollador) {
        this.nombre = nombre;
        this.version = version;
        this.desarrollador = desarrollador;
    }

    //tostring
    @Override
    public String toString() {
        return "SistemaOperativo [nombre=" + nombre + ", version=" + version + ", desarrollador=" + desarrollador + "]";
    }
}
