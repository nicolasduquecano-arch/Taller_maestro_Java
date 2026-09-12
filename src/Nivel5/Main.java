package Nivel5;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo base 9 y 10: agregacion y sellado final (Personaje, Escuadron, Reglas) ===");
        Personaje brako = new Personaje("Brako", 9999);
        Personaje lira = new Personaje("Lira", 70);

        Escuadron alfa = new Escuadron("Alfa");
        alfa.agregar(brako);
        alfa.agregar(lira);
        alfa.mostrar();
        System.out.println("Vida maxima permitida: " + Reglas.VIDA_MAXIMA);

        alfa = null;
        System.out.println(brako.getNombre() + " sigue con " + brako.getVida());

        System.out.println();
        System.out.println("=== Reto 5.1: La mochila del Cronista ===");
        Mochila mochila = new Mochila(1000);
        Objeto cuaderno = new Objeto("Cuaderno", 300);
        Objeto lapicero = new Objeto("Lapicero", 20);
        Objeto celular = new Objeto("Celular", 180);
        Objeto botella = new Objeto("Botella de agua", 600);

        System.out.println("Guardar " + cuaderno.getNombre() + ": " + mochila.guardar(cuaderno));
        System.out.println("Guardar " + lapicero.getNombre() + ": " + mochila.guardar(lapicero));
        System.out.println("Guardar " + celular.getNombre() + ": " + mochila.guardar(celular));
        System.out.println("Guardar " + botella.getNombre() + ": " + mochila.guardar(botella));
        System.out.println("Peso total en la mochila: " + mochila.pesoTotal());
        System.out.println(botella.getNombre() + " sigue existiendo con " + botella.getGramos()
                + " gramos, aunque quedo fuera de la mochila");

        System.out.println();
        System.out.println("=== Reto 5.3 (Extra): Lider del escuadron ===");
        Escuadron beta = new Escuadron("Beta");
        Personaje lider = beta.masFuerte();
        System.out.println("Lider con escuadron vacio: " + lider);

        beta.agregar(new Personaje("Kael", 90));
        beta.agregar(new Personaje("Sora", 140));
        beta.agregar(new Personaje("Rin", 60));
        lider = beta.masFuerte();
        System.out.println("Lider del escuadron Beta: " + lider.getNombre() + " con " + lider.getVida() + " de vida");

        System.out.println();
        System.out.println("=== Cazabugs Nivel 5 corregido (Escuadron.agregar) ===");
        Escuadron gremio = new Escuadron("Gremio");
        System.out.println(gremio.agregar(new Personaje("A", 10)));
        System.out.println(gremio.agregar(new Personaje("B", 10)));
        System.out.println(gremio.agregar(new Personaje("C", 10)));
        System.out.println(gremio.agregar(new Personaje("D", 10)));
    }
}
