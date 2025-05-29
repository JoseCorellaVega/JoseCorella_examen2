public class Cuenta {
    protected double saldo;
    protected int numDepositos;
    protected int numRetiros;

    public Cuenta() {
        saldo = 0;
        numDepositos = 0;
        numRetiros = 0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            numDepositos++;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            numRetiros++;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumDepositos() {
        return numDepositos;
    }

    public int getNumRetiros() {
        return numRetiros;
    }
}