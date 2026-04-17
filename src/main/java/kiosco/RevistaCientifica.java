package kiosco;

public class RevistaCientifica extends Documento {
    private String areaTematica;

    public RevistaCientifica(String titulo, int anio, String areaTematica) {
        super(titulo, anio);
        this.areaTematica = areaTematica;
    }
}