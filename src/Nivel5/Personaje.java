package Nivel5;

public class Personaje {
    private final String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = Math.min(vida, Reglas.VIDA_MAXIMA);
    }

    public final String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDanio(int danio) {
        vida = vida - danio;
    }
}
