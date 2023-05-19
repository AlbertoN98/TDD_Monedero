package es.iesmz.test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAlCrearCuentaElSaldoEsCero {

    @Test
    public void test() {
        Monedero m = new Monedero();
        assertEquals(0, m.getSaldo());
    }
    @Test
    public void testIngresar100EnCuentaVacia() {
        Monedero m = new Monedero();
        m.ingreso(100);
        assertEquals(100, m.getSaldo());
    }
    @Test
    public void testIngresar3000EnCuentaVacia() {
        Monedero m = new Monedero();
        m.ingreso(3000);
        assertEquals(3000, m.getSaldo());
    }
    @Test
    public void testIngresar100EnCuentaCon3000() {
        Monedero m = new Monedero();
        m.ingreso(100);
        m.ingreso(3000);
        assertEquals(3100, m.getSaldo());
    }
    @Test
    public void testNoSePuedeIngresarCantidadNegativa() {
        Monedero m = new Monedero();
        m.ingreso(-100);
        assertEquals(0, m.getSaldo());
    }
    @Test
    public void testRetirar100En500() {
        Monedero m = new Monedero();
        m.ingreso(500);
        m.retirar(100);
        assertEquals(400, m.getSaldo());
    }
    @Test
    public void testRetirar500EnCuenta200() {
        Monedero m = new Monedero();
        m.ingreso(200);
        m.retirar(500);
        assertEquals(200, m.getSaldo());
    }
    @Test
    public void testRetirarCantidadesNegativas() {
        Monedero m = new Monedero();
        m.ingreso(500);
        m.retirar(-100);
        assertEquals(500, m.getSaldo());
    }
    @Test
    public void testRetirar6000() {
        Monedero m = new Monedero();
        m.ingreso(6000);
        m.retirar(5000);
        assertEquals(1000, m.getSaldo());
    }
    @Test
    public void Transferencia() {
        Monedero m = new Monedero();
        m.ingreso(6000);
        m.retirar(5000);
        assertEquals(1000, m.getSaldo());
    }
}