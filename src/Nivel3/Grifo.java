package Nivel3;

public class Grifo extends Montura {
    public Grifo(int velocidad) {
        super(velocidad);
        System.out.println("Nace un grifo");
    }

    @Override
    public void mostrar() {
        velocidad = velocidad + 10;
        super.mostrar();
    }
}
