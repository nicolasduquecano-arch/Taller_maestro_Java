package Nivel1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo base 1: el molde y sus objetos (Heroe) ===");
        Heroe kira = new Heroe();
        kira.nombre = "Kira";
        kira.vida = 100;
        kira.ataque = 12;

        Heroe taro = new Heroe();
        taro.nombre = "Taro";
        taro.vida = 100;
        taro.ataque = 10;

        kira.saludar();
        taro.saludar();

        System.out.println();
        System.out.println("=== Ejemplo base 2: metodos void y con return ===");
        kira.recibirDanio(30);
        System.out.println("Vida de Kira tras recibir 30 de danio: " + kira.vida);
        System.out.println("Golpe critico de Kira: " + kira.golpeCritico());
        System.out.println("Kira esta viva: " + kira.estaVivo());

        kira.curar(50);
        System.out.println("Vida de Kira tras curar 50: " + kira.vida);

        System.out.println();
        System.out.println("=== Reto 1.1: Mascota digital ===");
        Mascota mascota = new Mascota();
        mascota.nombre = "Pixel";
        mascota.energia = 60;
        mascota.jugar();
        mascota.jugar();
        mascota.comer(20);
        System.out.println("Estado de " + mascota.nombre + ": " + mascota.estado());

        System.out.println();
        System.out.println("=== Reto 1.2: Tu heroe, tus datos ===");
        String nombrePiloto = "Piloto";
        Heroe heroeEquipo = new Heroe();
        heroeEquipo.nombre = "LNP";
        heroeEquipo.vida = 43;
        heroeEquipo.ataque = nombrePiloto.length();
        System.out.println("vida = " + heroeEquipo.vida + ", ataque = " + heroeEquipo.ataque);
        System.out.println("golpes contra 100 = " + heroeEquipo.golpesParaVencer(100));
        System.out.println("golpes contra 250 = " + heroeEquipo.golpesParaVencer(250));

        System.out.println();
        System.out.println("=== Reto 1.3: El clon honesto ===");
        Heroe original = new Heroe();
        original.nombre = "Brako";
        original.vida = 120;
        original.ataque = 15;

        Heroe clon = original.clonar();
        clon.recibirDanio(50);
        System.out.println(original.nombre + " (original) vida: " + original.vida);
        System.out.println(clon.nombre + " vida: " + clon.vida);

        System.out.println();
        System.out.println("=== Cazabugs Nivel 1 corregido (HeroeCazabugs) ===");
        HeroeCazabugs luna = new HeroeCazabugs();
        luna.nombre = "Luna";
        System.out.println(luna.saludar());
    }
}

class HeroeCazabugs {
    String nombre;

    String saludar() {
        return "Hola, soy " + nombre;
    }
}
