package Nivel2;

public class Heroe {
    private String nombre;
    private int vida;
    private int ataque;

    public Heroe(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        setVida(vida);
        this.ataque = ataque;
    }

    public Heroe(String nombre) {
        this(nombre, 100, 10);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 150) {
            this.vida = 150;
        } else {
            this.vida = vida;
        }
    }

    public void recibirDanio(int danio) {
        setVida(vida - danio);
    }

    public void saludar() {
        System.out.println(nombre + ": vida " + vida + ", ataque " + ataque);
    }
}
