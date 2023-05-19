package es.iesmz.test;

public class CuentaDestino extends Monedero {
    double cantidad;

    public CuentaDestino(double ingresos, double retirada, double saldo, double cantidad) {
        super(ingresos, retirada, saldo);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
