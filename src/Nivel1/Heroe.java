package Nivel1;

public class Heroe {
    String nombre;
    int vida;
    int ataque;

    void recibirDanio(int danio) {
        vida = vida - danio;
    }

    boolean estaVivo() {
        return vida > 0;
    }

    int golpeCritico() {
        return ataque * 2;
    }
}
