package ejercicios;
import java.util.Scanner;


public class calificadordeprestamo1 {
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

        if ( (salario >= 3000)&&( tiempoRequerido>= 2))
        {
            System.out.println("APROBADO :");
        }
        else {
            System.out.println("DESAPROBADO");
        }



    }
}


