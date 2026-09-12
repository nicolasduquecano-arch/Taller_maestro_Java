package Nivel4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo base 7 y 8: polimorfismo, instanceof y sobrecarga ===");
        Guerrero brako = new Guerrero("Brako", 120, 15);
        Mago lira = new Mago("Lira", 70, 12);
        Personaje aldeano = new Personaje("Aldeano", 40, 3);

        Personaje[] arena = { brako, lira, aldeano };
        int total = 0;
        for (Personaje p : arena) {
            int danio = p.atacar();
            System.out.println(p.getNombre() + " hace " + danio + " de danio");
            total = total + danio;
        }
        System.out.println("Danio total: " + total);

        for (Personaje p : arena) {
            if (p instanceof Mago) {
                Mago m = (Mago) p;
                m.lanzarHechizo();
            }
        }

        System.out.println();
        System.out.println("=== Reto 4.3: Furia sobrecargada ===");
        System.out.println("brako.atacar(10) = " + brako.atacar(10));
        System.out.println("lira.atacar(true) = " + lira.atacar(true));

        System.out.println();
        System.out.println("=== Reto 4.1: El Arquero entra a la arena ===");
        Arquero aria = new Arquero("Navegante", 90, 8, 1);
        Personaje[] arenaConArquero = { brako, lira, aldeano, aria };

        for (int ronda = 1; ronda <= 2; ronda++) {
            int totalRonda = 0;
            for (Personaje p : arenaConArquero) {
                totalRonda = totalRonda + p.atacar();
            }
            System.out.println("Ronda " + ronda + ": danio total " + totalRonda);
        }

        System.out.println();
        System.out.println("=== Reto 4.2: Figuras de tu mesa ===");
        Figura[] figuras = {
                new Circulo(4.5),
                new Rectangulo(20, 13),
                new Triangulo(10, 6)
        };
        double areaTotal = 0;
        for (Figura f : figuras) {
            areaTotal = areaTotal + f.area();
        }
        System.out.println("Area total: " + areaTotal);

        System.out.println();
        System.out.println("=== Cazabugs Nivel 4 corregido ===");
        Personaje[] arenaCazabugs = new Personaje[3];
        arenaCazabugs[0] = new Mago("Lira", 70, 12);
        arenaCazabugs[1] = new Guerrero("Brako", 120, 15);
        arenaCazabugs[2] = new Personaje("Aldeano", 40, 3);

        for (Personaje p : arenaCazabugs) {
            System.out.println(p.getNombre() + ": " + p.atacar());
        }

        Mago elegido = (Mago) arenaCazabugs[0];
        elegido.lanzarHechizo();
    }
}
