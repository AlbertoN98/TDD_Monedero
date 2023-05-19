package es.iesmz.test;

    public class Transferencia {
        private CuentaOrigen origen;
        private CuentaDestino destino;
        private double cantidad;

        public Transferencia(CuentaOrigen origen, CuentaDestino destino, double cantidad) {
            this.origen = origen;
            this.destino = destino;
            this.cantidad = cantidad;
        }

        public void transferir() {
            if (cantidad <= 0) {
                System.out.println("Error, la cantidad debe ser mayor que cero.");
                return;
            }

            if (cantidad > 3000) {
                System.out.println("Error, la cantidad máxima que se puede transferir es 3000.");
                return;
            }

            if (origen.getSaldo() < cantidad) {
                System.out.println("Error, la cuenta de origen no tiene suficiente saldo.");
                return;
            }

            origen.retirar(cantidad);
            destino.ingreso(cantidad);

            System.out.println("Transferencia realizada con éxito.");
        }
    }

