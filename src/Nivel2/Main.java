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

class Heroe {
    private String nombre;
    private int vida;
    private int ataque;

    public Heroe(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        setVida(vida);
        this.ataque = ataque;
    }

    public Heroe(String nombre) {
        this(nombre, 100, 10);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 150) {
            this.vida = 150;
        } else {
            this.vida = vida;
        }
    }

    public void recibirDanio(int danio) {
        setVida(vida - danio);
    }

    public void saludar() {
        System.out.println(nombre + ": vida " + vida + ", ataque " + ataque);
    }
}

class CuentaGremio {
    private String titular;
    private int saldo;

    public CuentaGremio(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public boolean depositar(int monto) {
        if (monto <= 0) {
            return false;
        }
        saldo = saldo + monto;
        return true;
    }

    public boolean retirar(int monto) {
        if (monto <= 0 || monto > saldo) {
            return false;
        }
        saldo = saldo - monto;
        return true;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

class Usuario {
    private String nombre;
    private String clave;

    public Usuario(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public boolean verificar(String intento) {
        return clave.equals(intento);
    }

    public boolean cambiarClave(String actual, String nueva) {
        if (!verificar(actual)) {
            return false;
        }
        if (nueva.length() < 8) {
            return false;
        }
        clave = nueva;
        return true;
    }
}

class Pocion {
    private String nombre;
    private int curacion;

    public Pocion() {
        this("Pocion basica", 20);
    }

    public Pocion(int curacion) {
        this("Pocion personalizada", curacion);
    }

    public Pocion(String nombre, int curacion) {
        this.nombre = nombre;
        this.curacion = curacion;
    }

    public String describir() {
        return nombre + " cura " + curacion;
    }
}

class Arma {
    private String nombre;
    private int danio;

    public Arma(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }
}
