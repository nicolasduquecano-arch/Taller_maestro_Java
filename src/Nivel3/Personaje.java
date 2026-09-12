package Nivel3;

public class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void presentarse() {
        System.out.println(nombre + " | vida " + vida + " | ataque " + ataque);
    }
}
