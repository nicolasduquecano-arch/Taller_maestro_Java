package Nivel1;

public class Main {
    public static void main(String[] args) {;
        Heroe kira = new Heroe();
        kira.nombre = "kira";
        kira.vida = 100;
        kira.ataque = 12;

        Heroe taro = new Heroe();
        taro.nombre = "taro";
        taro.vida = 100;
        taro.ataque = 10;

    }
    class heroe {
        String nombre;
        int vida;
        int ataque;

        void saludar() {
            System.out.println("Hola, soy " + nombre + ", vida: " + vida + ", ataque: " + ataque);
        }
    }
}
