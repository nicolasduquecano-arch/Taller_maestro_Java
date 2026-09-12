package JefeFinal;

public class Guerrero extends Personaje {
    private int armadura;

    public Guerrero(String nombre, int vida, int ataque, int armadura) {
        super(nombre, vida, ataque);
        this.armadura = armadura;
    }

    @Override
    public int atacar() {
        return ataque + 5;
    }

    @Override
    public void recibirDanio(int danio) {
        int danioReducido = danio - armadura;
        if (danioReducido < 0) {
            danioReducido = 0;
        }
        super.recibirDanio(danioReducido);
    }
}
