package model;

public class Usuario {
    private String nombre;
    private char estado;

    public char getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(char estado) {
        this.estado = estado; // this funciona como el self en python
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
