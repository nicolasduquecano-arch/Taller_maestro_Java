package Nivel3;

public class Sanador extends Personaje {
    private int hierbas;

    public Sanador(String n, int v, int a, int hierbas) {
        super(n, v, a);
        this.hierbas = hierbas;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("  Sanador con " + hierbas);
    }
}
