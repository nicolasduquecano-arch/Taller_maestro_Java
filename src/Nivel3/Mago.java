package Nivel3;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int ataque, int mana) {
        super(nombre, vida, ataque);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        mana = mana - 20;
        System.out.println(nombre + " hechiza. Mana: " + mana);
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("  LosNullPointers arden! " + nombre + " reserva " + mana + " de mana");
    }
}
