package Nivel2;

public class CuentaGremio {
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
