public class Computadora {
    private String marca;
    private String modelo;
    private String procesador;

    // Constructor
    public Computadora(String marca, String modelo, String procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
    }

    // Método toString
    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + "]";
    }
}
