package kiosco;

public class Video extends Documento {
    private String director;
    private int duracion; // en minutos

    public Video(String titulo, int anio, String director, int duracion) {
        super(titulo, anio);
        this.director = director;
        this.duracion = duracion;
    }
}