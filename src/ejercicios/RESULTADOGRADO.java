package ejercicios;

import java.util.Scanner;

//IF - ELSE -IF
//MOSTRAR EL GRADO DE UN ESTUDIANTE EN FUNCION   A SU PUNTAJE EN LA PRUEBA
//si el puntaje  es menor a 60 mostramos E
//+++++++++++++++++++++++ 70+++++++++++D
//                       80+++++++++++++C
//                       90+++++++++++++B
//SI NO SE CUMPLE NINGUNA CONDICION  +++++ A
public class RESULTADOGRADO {
    public static void main (String [] args){
        // obtener resultado por la pantalla

        System.out.println("Ingresar el puntaje de la prueba ");
        Scanner scanner = new Scanner ( System.in);
        double puntaje = scanner.nextDouble();
        scanner.close();
        //determinar el grado

        String  grado;
         if( puntaje<60){
             grado = "ENANO";


         }
         else if(puntaje<70 ){

             grado = "DEDO";

         }
         else if(puntaje<80){
             grado="CASA";
         }
         else if (puntaje<90){

             grado ="BUENO";

         }
         else
        {
            grado = "AVION";

        }

       System.out.println(" EL GRADO ES :"+ grado);






    }

}
