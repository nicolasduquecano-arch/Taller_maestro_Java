package Nivel2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo base: constructores y encapsulamiento (Heroe) ===");
        Heroe kira = new Heroe("Kira", 9999, 12);
        kira.saludar();
        System.out.println("Vida de Kira (se ajusto a 150): " + kira.getVida());

        Heroe pip = new Heroe("Pip");
        pip.saludar();

        kira.recibirDanio(200);
        System.out.println("Vida de Kira tras recibir 200 de danio (nunca negativa): " + kira.getVida());

        System.out.println();
        System.out.println("=== Reto 2.1: La boveda del gremio (CuentaGremio) ===");
        CuentaGremio cuenta = new CuentaGremio("LosNullPointers");
        cuenta.depositar(500);
        cuenta.depositar(-100);
        boolean retiro1 = cuenta.retirar(800);
        boolean retiro2 = cuenta.retirar(200);
        System.out.println(retiro1);
        System.out.println(retiro2);
        System.out.println("saldo " + cuenta.getSaldo());

        System.out.println();
        System.out.println("=== Reto 2.2: Contrasena blindada (Usuario) ===");
        Usuario usuario = new Usuario("Cronista", "nullpointers4");
        System.out.println("Cambio con clave actual incorrecta: " + usuario.cambiarClave("claveMala", "otraClaveNueva"));
        System.out.println("Cambio con clave nueva corta: " + usuario.cambiarClave("nullpointers4", "corta"));
        System.out.println("Cambio valido: " + usuario.cambiarClave("nullpointers4", "claveNuevaSegura"));
        System.out.println("Verificar clave nueva: " + usuario.verificar("claveNuevaSegura"));

        System.out.println();
        System.out.println("=== Reto 2.3: Tres formas de nacer (Pocion) ===");
        Pocion basica = new Pocion();
        Pocion personalizada = new Pocion(35);
        Pocion completa = new Pocion("Elixir de gremio", 50);
        System.out.println(basica.describir());
        System.out.println(personalizada.describir());
        System.out.println(completa.describir());

        System.out.println();
        System.out.println("=== Cazabugs Nivel 2 corregido (Arma) ===");
        Arma espada = new Arma("Espada", 25);
        System.out.println(espada.getNombre() + ": " + espada.getDanio());
    }
}
