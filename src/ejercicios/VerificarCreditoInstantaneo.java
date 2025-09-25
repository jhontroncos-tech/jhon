package ejercicios;

import java.util.Scanner;

public class VerificarCreditoInstantaneo {
    //declarando variables
    static int salarioRequerido = 2500;
    static int scoreCrediticioRequerido= 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //obtener el salario(crear un metodo)
        // obtener score crediticio
        //verificar si el usuario califica (crear otro metodo)
        // notificar al usuario si califica o no

        double salario =getSalario();
        int scoreCrediticio = getScoreCrediticio();
        scanner.close();

        boolean esCalificado =esUsuarioCalificado(scoreCrediticio, salario);

        notificarUsuario(esCalificado);




       // scanner.close();




    }

    public static double getSalario() {
        System.out.println("Ingreses su salario:");
      // Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        return salario;


    }


    public static int getScoreCrediticio(){
        System.out.println("Ingreses su score crediticio :");
       //Scanner scanner = new Scanner(System.in);
        int scoreCrediticio = scanner.nextInt();
        return scoreCrediticio;


    }
    public static boolean  esUsuarioCalificado(int scoreCrediticio, double salario){
        if (scoreCrediticio>=scoreCrediticioRequerido&& salario>=salarioRequerido){
            return true;
        }
        else{
            return false;

        }


    }

    public static void  notificarUsuario(boolean esCalificado){
        if (esCalificado){
            System.out.println("Felicitaciones  su credito esta aprobado");
        }
        else {
            System.out.println("LO SENTIMOS SU CREDITO NO ESTA APROBADO");
        }
    }
}
