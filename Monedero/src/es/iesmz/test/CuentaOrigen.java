package es.iesmz.test;

public class CuentaOrigen extends Monedero {
    double cantidad;


    public CuentaOrigen(double ingresos, double retirada, double saldo, double cantidad) {
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
