package Nivel4;

public class Mago extends Personaje {
    public Mago(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public int atacar() {
        return ataque * 2;
    }

    public int atacar(boolean critico) {
        if (critico) {
            return atacar() * 2;
        }
        return atacar();
    }

    public int atacar(int bonus) {
        return ataque * 2 + bonus;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un rayo");
    }
}
