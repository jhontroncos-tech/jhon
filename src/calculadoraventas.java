import java.util.Scanner;

public class calculadoraventas {

    public static void main(String [] args) {
        int cuotaVentas = 10;
        System.out.println("INGRESAR NUMERO DE VENTAS  DE LA SEMANA :");
        Scanner scanner = new Scanner(System.in);
        int ventas = scanner.nextInt();
        scanner.close();

        if (ventas >= cuotaVentas) {
            System.out.println("FELICITACIONES USTED LLEGO A LA META  :");


        }
        else {

            int ventasfaltantes = cuotaVentas - ventas ;
            System.out.println("LO SENTIMOS NO LLEGO A LA META :" +ventasfaltantes+" ventas" );
    }



    }
}


