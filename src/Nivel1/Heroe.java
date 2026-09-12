package Nivel1;

public class Heroe {
    String nombre;
    int vida;
    int ataque;

    void saludar() {
        System.out.println("Hola, soy " + nombre + ", vida: " + vida + ", ataque: " + ataque);
    }

    void recibirDanio(int danio) {
        vida = vida - danio;
    }

    boolean estaVivo() {
        return vida > 0;
    }

    int golpeCritico() {
        return ataque * 2;
    }

    void curar(int puntos) {
        vida = vida + puntos;
    }

    int golpesParaVencer(int vidaEnemigo) {
        int golpes = 0;
        int vidaRestante = vidaEnemigo;
        while (vidaRestante > 0) {
            vidaRestante = vidaRestante - ataque;
            golpes++;
        }
        return golpes;
    }

    Heroe clonar() {
        Heroe clon = new Heroe();
        clon.nombre = nombre + " (clon)";
        clon.vida = vida;
        clon.ataque = ataque;
        return clon;
    }
}
