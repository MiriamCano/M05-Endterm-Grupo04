package kiosco;

public class Ebook extends Libro implements Consultable {
    private String formato; // ej: PDF, EPUB, MOBI

    public Ebook(String titulo, int anio, int numPaginas, String autor, String editorial, String resumen, String formato) {
        super(titulo, anio, numPaginas, autor, editorial, resumen);
        this.formato = formato;
    }

    @Override
    public String getAbstract(int inicio, int fin) {
        if (resumen != null && inicio >= 0 && fin <= resumen.length() && inicio < fin) {
            return resumen.substring(inicio, fin);
        }
        return "Rango de consulta no válido o resumen inexistente.";
    }
}