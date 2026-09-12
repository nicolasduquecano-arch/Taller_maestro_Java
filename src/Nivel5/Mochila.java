package Nivel5;

import java.util.ArrayList;

public class Mochila {
    private final int capacidad;
    private ArrayList<Objeto> contenido = new ArrayList<>();

    public Mochila(int capacidad) {
        this.capacidad = capacidad;
    }

    public int pesoTotal() {
        int total = 0;
        for (Objeto o : contenido) {
            total = total + o.getGramos();
        }
        return total;
    }

    public boolean guardar(Objeto o) {
        if (pesoTotal() + o.getGramos() > capacidad) {
            return false;
        }
        contenido.add(o);
        return true;
    }
}
