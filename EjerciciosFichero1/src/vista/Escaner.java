package vista;

import java.io.IOException;
import java.util.Scanner;

public class Escaner {
    private static Scanner sc = new Scanner(System.in);

    public static String  pedirString(String dato) throws IOException {

        Consola.leerString(dato);
        dato=sc.nextLine();

        return dato;
    }

    public static int pedirInt(int dato) throws IOException {
        Consola.leerInt(String.valueOf(dato));
        int valor = -1;
        try{

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        dato=sc.nextInt();

        return dato;

    }
}
