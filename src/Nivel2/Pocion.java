package Nivel2;

public class Pocion {
    private String nombre;
    private int curacion;

    public Pocion() {
        this("Pocion basica", 20);
    }

    public Pocion(int curacion) {
        this("Pocion personalizada", curacion);
    }

    public Pocion(String nombre, int curacion) {
        this.nombre = nombre;
        this.curacion = curacion;
    }

    public String describir() {
        return nombre + " cura " + curacion;
    }
}
