package kiosco;

public class Audio extends Documento {
    private String artista;
    private int duracion;

    public Audio(String titulo, int anio, String artista, int duracion) {
        super(titulo, anio);
        this.artista = artista;
        this.duracion = duracion;
    }
}