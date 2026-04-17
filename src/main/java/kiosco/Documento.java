package kiosco;

public abstract class Documento {
    protected String referencia;
    protected String titulo;
    protected int anio;
    protected boolean disponible;

    public Documento(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = true;
        // Genera una referencia única basada en el tiempo de sistema
        this.referencia = "REF-" + System.nanoTime();
    }

    public String getReferencia() { return referencia; }
    public String getTitulo() { return titulo; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}