package Nivel5;

import java.util.ArrayList;

public class Escuadron {
    private String nombre;
    private ArrayList<Personaje> miembros = new ArrayList<>();

    public Escuadron(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregar(Personaje p) {
        if (miembros.size() >= Reglas.MAX_MIEMBROS) {
            return false;
        }
        miembros.add(p);
        return true;
    }

    public int vidaTotal() {
        int total = 0;
        for (Personaje p : miembros) {
            total = total + p.getVida();
        }
        return total;
    }

    public void mostrar() {
        System.out.println("Escuadron " + nombre + ": " + miembros.size()
                + " miembros, vida " + vidaTotal());
        for (Personaje p : miembros) {
            System.out.println(" - " + p.getNombre());
        }
    }

    public Personaje masFuerte() {
        if (miembros.isEmpty()) {
            return null;
        }
        Personaje lider = miembros.get(0);
        for (Personaje p : miembros) {
            if (p.getVida() > lider.getVida()) {
                lider = p;
            }
        }
        return lider;
    }
}
