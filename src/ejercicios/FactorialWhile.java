package ejercicios;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        System.out.println("ingrese el numero a calcular:");

        Scanner sc = new Scanner(System.in);
        int numero =sc.nextInt();

        int factorial = 1;
        int i= 1;
        while (i<= numero)
        {
            factorial = factorial *i;
            i=i+1;

        }
        System.out.println("El factorial de "+numero +" es " +factorial);
    }
}
