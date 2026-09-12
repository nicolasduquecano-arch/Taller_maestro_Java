package Nivel3;

public class Arquero extends Personaje {
    private int flechas;

    public Arquero(String nombre, int vida, int ataque, int flechas) {
        super(nombre, vida, ataque);
        this.flechas = flechas;
    }

    public void disparar() {
        if (flechas > 0) {
            flechas = flechas - 1;
            System.out.println(nombre + " dispara. Flechas restantes: " + flechas);
        } else {
            System.out.println(nombre + " no tiene flechas");
        }
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("  LosNullPointers apuntan! " + nombre + " conserva " + flechas + " flechas");
    }
}
