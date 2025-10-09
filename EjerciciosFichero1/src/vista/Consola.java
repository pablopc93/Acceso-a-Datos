package vista;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Consola {
    private static final Scanner sc = new Scanner(System.in);

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }


    public static int leerInt(String mensaje) {
        int valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        double valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número decimal válido.");
            }
        }
    }

    public static boolean leerBoolean(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (s/n): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("s") || input.equals("si")) return true;
            if (input.equals("n") || input.equals("no")) return false;
            System.out.println("Error: responde 's' o 'n'.");
        }
    }

    public static int mostrarMenu(String titulo, List<String> opciones) {
        System.out.println("\n=== " + titulo + " ===");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
        System.out.println("0. Salir");

        int opcion;
        while (true) {
            opcion = leerInt("Elige una opción: ");
            if (opcion >= 0 && opcion <= opciones.size()) {
                return opcion;
            }
            System.out.println("Opción inválida, intenta de nuevo.");
        }
    }

    public static LocalDate leerFecha(String texto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            return LocalDate.parse(texto.trim(), formato);
        } catch (DateTimeParseException e) {
            System.out.println("Error: formato de fecha inválido. Usa yyyy-MM-dd (ejemplo: 2025-10-07).");
            return null;
        }
    }

    public static LocalTime leerHora(String texto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        try {
            return LocalTime.parse(texto.trim(), formato);
        } catch (DateTimeParseException e) {
            System.out.println("Error: formato de hora inválido. Usa HH:mm (ejemplo: 14:30).");
            return null;
        }
    }
}


