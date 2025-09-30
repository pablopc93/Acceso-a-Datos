package controlador;

import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Escaner;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ControladorIncidencias {

    public static void iniciar() throws IOException {

        Fichero miFichero = new Fichero("datos/incidencias.txt");

        miFichero.addDato("2025/09/16;14:02:00;excepción test1;usuario1");

        String usuario = Escaner.pedirString("Introduce el usuario: ");

        String opcion = Escaner.pedirString("Introduce el opcion: ");

        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        ServicioFichero.guardar(usuario,opcion,fecha,hora);
        System.out.println("Incidencia guardada correctamente");

    }
}
