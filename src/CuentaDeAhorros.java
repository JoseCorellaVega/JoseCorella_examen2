public class CuentaDeAhorros extends Cuenta {
    private boolean activa;

    public CuentaDeAhorros(float saldoInicial, float tasa) {
        super(saldoInicial, tasa);
        if (saldo >= 100) {
            activa = true;
        } else {
            activa = false;
        }
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            if (!activa && (saldo + cantidad) >= 100) {
                activa = true;
            }
            saldo += cantidad;
            numeroDepositos++;
        }
    }

    public void retirar(float cantidad) {
        if (activa && cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
            if (saldo < 100) {
                activa = false;
            }
        }
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de depósitos: " + numeroDepositos);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        if (activa) {
            System.out.println("Cuenta activa: Sí");
        } else {
            System.out.println("Cuenta activa: No");
        }
    }
}