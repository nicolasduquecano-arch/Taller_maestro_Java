package Nivel4;

public class Arquero extends Personaje {
    private int flechas;

    public Arquero(String nombre, int vida, int ataque, int flechas) {
        super(nombre, vida, ataque);
        this.flechas = flechas;
    }

    @Override
    public int atacar() {
        if (flechas > 0) {
            flechas = flechas - 1;
            return ataque * 3;
        }
        return 1;
    }
}
