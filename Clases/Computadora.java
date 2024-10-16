

public class Computadora {
    private String marca;
    private String modelo;
    private String procesador;

    
    public Computadora(String marca, String modelo, String procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
    }

    
    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + "]";
    }
}
