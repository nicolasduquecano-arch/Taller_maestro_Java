package Nivel3;

public class Montura {
    protected int velocidad;

    public Montura(int velocidad) {
        this.velocidad = velocidad;
    }

    public void mostrar() {
        System.out.println("Velocidad: " + velocidad);
    }
}
