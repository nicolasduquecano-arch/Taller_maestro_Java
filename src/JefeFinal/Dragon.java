package JefeFinal;

public final class Dragon extends Personaje {
    public Dragon() {
        super("Dragon Null", 330, 35);
    }

    public int atacar(int ronda) {
        if (ronda % 3 == 0) {
            return ataque * 2;
        }
        return ataque;
    }
}
