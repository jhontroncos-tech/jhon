package ejercicios;

import java.util.Scanner;

public class DoWhileSumarNumeros {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                boolean continuar;
       do {

           System.out.println("Ingrese numero 1: ");
           double num1 = scanner.nextDouble();

           System.out.println("Ingrese numero 2: ");
           double num2 = scanner.nextDouble();

           double sum = num1 + num2;

           System.out.println("la suma es :" + sum);

           System.out.println("Desea  continuar");
           continuar = scanner.nextBoolean();
       }
       while (continuar);
       scanner.close();


    }
}
