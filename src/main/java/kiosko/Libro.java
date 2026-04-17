package kiosco;

public class Libro extends Documento {
    protected int numPaginas;
    protected String autor;
    protected String editorial;
    protected String resumen;

    public Libro(String titulo, int anio, int numPaginas, String autor, String editorial, String resumen) {
        super(titulo, anio); // Envía los datos básicos a la clase Documento
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.editorial = editorial;
        this.resumen = resumen;
    }
}