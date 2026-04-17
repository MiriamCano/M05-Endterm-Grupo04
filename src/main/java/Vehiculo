public class Vehiculo {

    // Atributos encapsulados (private para seguridad)
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;

    // Constructor: Inicializa el objeto
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0; // Regla de negocio: Siempre nace en 0
    }

    // Getters para leer los datos
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidadMaxima() { return velocidadMaxima; }
    public int getVelocidadActual() { return velocidadActual; }

    // Comportamiento: Acelerar
    public void acelerar(int incremento) {
        if (incremento < 0) {
            throw new IllegalArgumentException("No se puede acelerar en negativo.");
        }

        this.velocidadActual += incremento;

        // Límite físico
        if (this.velocidadActual > this.velocidadMaxima) {
            this.velocidadActual = this.velocidadMaxima;
        }
    }

    // Comportamiento: Frenar
    public void frenar(int decremento) {
        if (decremento < 0) {
            throw new IllegalArgumentException("No se puede frenar en negativo.");
        }

        this.velocidadActual -= decremento;

        // Límite físico
        if (this.velocidadActual < 0) {
            this.velocidadActual = 0;
        }
    }
}