package es.iesmz.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Monedero m1 = new Monedero();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Ver saldo");
            System.out.println("2.Depositar dinero");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Salir");
            System.out.println("Ingrese una opcion:");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    m1.verSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese el valor a depositar:");
                    double deposito = sc.nextDouble();
                    m1.ingreso(deposito);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a retirar:");
                    double retirar = sc.nextDouble();
                    m1.retirar(retirar);
                    break;
                case 4:
                    System.out.println("Salir");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }while(opcion!= 4);
        System.out.println("Cuanto dinero quieres ingresar?");
        double ingreso = sc.nextDouble();
        System.out.println();
    }
}
