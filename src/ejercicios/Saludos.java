package ejercicios;

import java.util.Scanner;

public class Saludos {

    public static void main(String[] args) {
        System.out.println("Ingreses su nombre :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        saludarUsuario(name);
        String mensaje =obtenerMensaje(name);
        System.out.println(mensaje);


    }

    public static void saludarUsuario(String name ){
        System.out.println("hola," +name + "¿Como estas ?");

    }

    public static String obtenerMensaje(String name ){
        String mensaje ="Biembenido,"+ name;
        return mensaje;

    }

}
