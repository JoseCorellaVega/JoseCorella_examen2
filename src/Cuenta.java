public class Cuenta {
    protected float saldo;
    protected int numeroDepositos = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;

    public Cuenta(float saldoInicial, float tasa) {
        saldo = saldoInicial;
        tasaAnual = tasa;
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }
}