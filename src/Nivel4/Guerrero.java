package Nivel4;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public int atacar() {
        return ataque + 5;
    }

    public int atacar(int furia) {
        return atacar() + furia;
    }
}
