package controlador;

import servicio.ServicioFichero;
import vista.Consola;

import java.io.IOException;
import java.util.Arrays;

public class ControladorMenu {
    public static void iniciarMenu() throws IOException {
        int opcion;
        ServicioFichero servicioFichero = new ServicioFichero(); //llamamos al servicio para que en las opciones pueda llamar a los metodos
        do {
            opcion = Consola.mostrarMenu("Gestión de incidencias",
                    Arrays.asList("Introducir incidencia", "Buscar por fecha", "Buscar por usuario","Mostrar Incidencias")
            );
            switch (opcion) {
                case 1:
                    servicioFichero.guardar();
                    break;
                case 2:
                    servicioFichero.buscarFecha();
                    break;
                case 3:
                    servicioFichero.buscarUsuario();
                    break;
                case 4:
                    servicioFichero.mostrarIncidencias();
                    break;
                case 0:
                    Consola.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    System.out.println("");
            }
        } while (opcion != 0); //mientras que no sea 0 sigue funcionando
    }
}
