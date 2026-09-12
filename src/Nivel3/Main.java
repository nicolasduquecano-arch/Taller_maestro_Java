package Nivel3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo base 5 y 6 + Reto 3.3: herencia y @Override (Personaje, Guerrero, Mago) ===");
        Guerrero brako = new Guerrero("Brako", 120, 15, 8);
        Mago lira = new Mago("Lira", 70, 10, 50);

        brako.presentarse();
        brako.defender();
        lira.presentarse();
        lira.lanzarHechizo();

        System.out.println();
        System.out.println("=== Reto 3.1 y 3.3: Nace el Arquero ===");
        Arquero aria = new Arquero("Aria", 90, 8, 2);
        aria.presentarse();
        aria.disparar();
        aria.disparar();
        aria.disparar();

        System.out.println();
        System.out.println("=== Rompecabezas del linaje: Sanador ===");
        new Sanador("Mira", 80, 6, 3).presentarse();

        System.out.println();
        System.out.println("=== Cazabugs Nivel 3 corregido (Montura/Grifo) ===");
        Grifo g = new Grifo(40);
        g.mostrar();
    }
}
