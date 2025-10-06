package controlador;

import vista.Consola;

import java.util.Arrays;

public class ControladorMenu {
    public static void iniciarMenu() {
        int opcion;
        do {
            opcion = Consola.mostrarMenu(
                    "Gestión de incidencias",
                    Arrays.asList("Introducir incidencia", "Buscar por fecha", "Buscar por usuario")
            );

            switch (opcion) {
                case 1 -> introducirIncidencia();
                case 2 -> Consola.mostrarMensaje("Buscando por fecha...");
                case 3 -> Consola.mostrarMensaje("Buscando por usuario...");
                case 0 -> Consola.mostrarMensaje("Saliendo del programa...");
            }
        } while (opcion != 0);
    }

    private static void introducirIncidencia() {
        String usuario = Consola.leerString("Introduce el usuario: ");
        String fallo = Consola.leerString("Describe la incidencia: ");
        Consola.mostrarMensaje("Incidencia registrada -> " + usuario + ": " + fallo);
    }
}
