package ejercicios;

import java.util.Scanner;

public class ValidacionEntradaPagoBruto {
    public static void main(String[] args) {

        int horas = 1000;
        int pagoxh = 15;
        Scanner scanner = new Scanner(System.in);


        // int  =sc.nextInt();
        System.out.println("¿Cuantas  horas trabajadas en la semana ?:");
        int hts = scanner.nextInt();

        int salario = 0;
        while  (hts > horas)
        {
            System.out.println("Error, ingrese numero de horas validas: ");
           hts= scanner.nextInt();


        }
        scanner.close();

        salario = hts * pagoxh;
        System.out.println(" el salario es :" + salario);

    }
}


