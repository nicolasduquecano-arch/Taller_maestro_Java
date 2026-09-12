package Nivel2;

public class Usuario {
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
