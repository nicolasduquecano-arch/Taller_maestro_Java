package Nivel5;

public class Objeto {
    private final String nombre;
    private final int gramos;

    public Objeto(String nombre, int gramos) {
        this.nombre = nombre;
        this.gramos = gramos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGramos() {
        return gramos;
    }
}
