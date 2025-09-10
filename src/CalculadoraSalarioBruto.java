import java.util.Scanner;

public class CalculadoraSalarioBruto {

    public static void main(String[] args){

        System.out.println("Ingresar numero de horas que el muchachon a trabajado :");
         //  System.out.println("S2 =  9);
        //  System.out.printf(" ");
       // System.out.printf("suma" = "S1 + S2");
       // System.out.printf("muchachon");
        Scanner scanner = new Scanner(System.in);
        int  horas = scanner.nextInt();

        System.out.println("Ingresar tarifa de pago por hora :");
        double   tarifa = scanner.nextDouble();

        scanner.close();
        double salarioBruto = horas * tarifa ;
        System.out.println("El Salario bruto es  :" + salarioBruto);






    }
}
