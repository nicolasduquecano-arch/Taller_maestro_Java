package JefeFinal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Fase 4: la batalla, con el orden original del escuadron ===");
        Escuadron escuadronOriginal = new Escuadron();
        escuadronOriginal.agregar(new Mago("Lira", 70, 12));
        escuadronOriginal.agregar(new Arquero("Aria", 90, 14, 6));
        escuadronOriginal.agregar(new Guerrero("Brako", 120, 10, 10));
        batallar(escuadronOriginal);

        System.out.println();
        System.out.println("=== Fase 5: estrategia demostrada (se cambia solo el orden de agregar) ===");
        Escuadron escuadronEstrategia = new Escuadron();
        escuadronEstrategia.agregar(new Guerrero("Brako", 120, 10, 10));
        escuadronEstrategia.agregar(new Mago("Lira", 70, 12));
        escuadronEstrategia.agregar(new Arquero("Aria", 90, 14, 6));
        batallar(escuadronEstrategia);
    }

    private static void batallar(Escuadron escuadron) {
        Dragon dragon = new Dragon();
        int ronda = 0;

        while (dragon.estaVivo() && escuadron.hayVivos() && ronda < Reglas.MAX_RONDAS) {
            ronda++;
            int danio = escuadron.atacarTodos();
            dragon.recibirDanio(danio);
            System.out.println("Ronda " + ronda + ": danio " + danio
                    + ". Dragon: " + dragon.getVida());

            if (dragon.estaVivo()) {
                Personaje objetivo = escuadron.primeroVivo();
                int golpe = dragon.atacar(ronda);
                objetivo.recibirDanio(golpe);
                System.out.println("  Golpe de " + golpe + " a " + objetivo.getNombre()
                        + ". Vida: " + objetivo.getVida());
            }
        }

        if (!dragon.estaVivo()) {
            System.out.println("VICTORIA en la ronda " + ronda);
        } else if (!escuadron.hayVivos()) {
            System.out.println("GAME OVER en la ronda " + ronda);
        } else {
            System.out.println("El dragon escapa al amanecer");
        }
    }
}
