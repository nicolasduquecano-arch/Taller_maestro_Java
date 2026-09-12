package JefeFinal;

public class Personaje {
    private String nombre;
    protected int vida;
    protected int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public final String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int atacar() {
        return ataque;
    }

    public void recibirDanio(int danio) {
        vida = vida - danio;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
