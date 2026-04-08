package models;

public class Carrera {

    private String nombre;
    private int duración;

    public Carrera() {
    }

    public Carrera(String nombre, int duración) {
        this.nombre = nombre;
        this.duración = duración;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", duración=" + duración +
                '}';
    }
}
