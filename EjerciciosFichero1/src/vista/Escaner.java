package vista;

import java.util.Scanner;

public class Escaner {
    //escaner hecho con IA para poder escanear diferentes tipos de entrada de datos
    private static final Scanner sc = new Scanner(System.in);

    public static String leerLinea() {
        return sc.nextLine();
    }

    public static int leerInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }

    public static double leerDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número decimal válido.");
            }
        }
    }
}
