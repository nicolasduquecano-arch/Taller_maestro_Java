package Nivel1;

public class Mascota {
    String nombre;
    int energia;

    void jugar() {
        energia = energia - 15;
    }

    void comer(int porcion) {
        energia = energia + porcion;
    }

    String estado() {
        if (energia >= 50) {
            return "Feliz";
        } else {
            return "Cansada";
        }
    }
}
