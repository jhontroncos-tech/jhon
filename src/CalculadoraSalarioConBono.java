import java.util.Scanner;

public class CalculadoraSalarioConBono {


    public static void main(String[] args) {
        int salario = 1000;
        int bono = 250;
        int cuotaVentas = 10;
        System.out.println("CUANTAS VENTAS HIZO EN LA SEMANA :");
        Scanner scanner = new Scanner(System.in);
        int ventas = scanner.nextInt();
        scanner.close();

        if (ventas > cuotaVentas) {
            salario = salario + bono;


        }
        else {
            System.out.println(" el pago es  sin bono 1:" + salario);
        }
        System.out.println(" el pago es :" + salario);
    }
}

