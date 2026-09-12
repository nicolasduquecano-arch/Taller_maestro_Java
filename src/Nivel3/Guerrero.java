package Nivel3;

public class Guerrero extends Personaje {
    private int armadura;

    public Guerrero(String nombre, int vida, int ataque, int armadura) {
        super(nombre, vida, ataque);
        this.armadura = armadura;
    }

    public void defender() {
        System.out.println(nombre + " se defiende: +" + armadura);
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("  LosNullPointers al ataque! " + nombre + " resiste con " + armadura + " de armadura");
    }
}
