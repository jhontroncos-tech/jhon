package ejercicios;

import java.util.Scanner;

public class CALIFICADORDEPRESTAMO {

    public static void main (String [] args){
       // INICIALIZAR VALORES  POR DEFECTO  3000 Y 2 AÑOS
        //  LEER POR PANTALLA EL SALARIO
        //  LEER EL NUM DE AÑOS TRABAJADOS
        // TOMAR  LA DECISION APLICANDO CONDICIONAL Y MOSTRAR SI CALIFICA O NO

       int salarioRequerido = 3000 ;
       int tiempoRequerido = 2;
        System.out.println("INGRESAR SALARIO :");
        Scanner scanner = new Scanner(System.in);
        int salario  = scanner.nextInt();

        System.out.println("INGRESAR AÑOS DE TRABAJO  :");
        int tiempo = scanner.nextInt();

        scanner.close();

        if ( (salario >= salarioRequerido)&&( tiempo >= tiempoRequerido))
        {
            System.out.println("RECOJE EL MONEY :");
        }
        else {
            System.out.println("PRESTALE A LOS CHAMOS MEJOR"
            );
        }



    }
}
