package es.iesmz.test;

public class Monedero {
    double ingresos;
    double retirada;
    double saldo = 0;

    public Monedero() {
    }

    public Monedero(double ingresos, double retirada, double saldo) {
        this.ingresos = ingresos;
        this.retirada = retirada;
        this.saldo = saldo;
    }

    public double getIngresos() {
        return ingresos;
    }

    public double getRetirada() {
        return retirada;
    }

    public double getSaldo() {
        return saldo;
    }
    public void verSaldo(){
        this.saldo = saldo;
        System.out.println(saldo);
    }

    public  void ingreso(double ingresos){
        if (ingresos < 0){
            System.out.println("Error no puedes ingresar negativos");
        }else if(saldo + ingresos > 6000){
            System.out.println("Error no puedes ingresar más de 6000" + (7000 - saldo));
            saldo = 0;
        } else if(ingresos <= 6000){
            saldo += ingresos;
        }
    }
    public void retirar(double retirada){
        if(retirada > saldo){
            System.out.println("Error no puedes retirar más de saldo");
        }else if(retirada <= 0){
            System.out.println("Error no puedes retirar negativos");
        }else if(retirada + saldo > 6000){
            System.out.println("Error no puedes retirar más de 6000" + (6000 - saldo));
            saldo -= retirada ;
        }else {
            saldo -= retirada;
            System.out.println(saldo);
        }
    }


}
