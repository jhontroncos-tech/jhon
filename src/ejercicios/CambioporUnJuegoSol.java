package ejercicios;

import java.util.Scanner;

public class CambioporUnJuegoSol {
    public static void main(String[]args) {
        double unCentimo = 0.01;
        double cincoCentimo = 0.05;
        double diezCentimo = 0.10;
        double veinteCincoCentimo = 0.25;
        int sol = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido 'cambio por un sol' :" +
                        "Su meta es  ingresar suficiente cambio para hacer exactamente s/1.00");

                System.out.println("Ingrese sus monedas de un centimo  :");
        int numMonedasUnCentimo = scanner.nextInt();

        System.out.println("Ingrese sus monedas de cinco centimos  :");
        int numMonedasCincoCentimo = scanner.nextInt();

        System.out.println("Ingrese sus monedas de diez centimos  :");
        int numMonedasDiezntimo = scanner.nextInt();

        System.out.println("Ingrese sus monedas de 25 centimos  :");
        int numMonedasVeinteCincoCentimo = scanner.nextInt();

        scanner.close();
        double total = numMonedasUnCentimo + numMonedasCincoCentimo +
                numMonedasDiezntimo + numMonedasVeinteCincoCentimo;

        if (total < sol) {

            double montoFaltante = sol - total;
            System.out.println("Lo sienbto perdiste te falta " + String.format("%.2f", montoFaltante) +
                    "centimos");
        }
        else if (total > sol){

            double montoExcedido = total - sol;
            System.out.println("Lo siento perdiste te excediste " + String.format("%.2f", montoExcedido) +
                    " centimos ");
        }
else {

                System.out.println("muy bien es exactamente un sol !!!GANASTE !!!");
            }






    }
}
