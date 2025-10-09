package controlador;

import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Consola;
import vista.Escaner;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ControladorIncidencias {

    public static void iniciar() throws IOException {

        Fichero miFichero = new Fichero("datos/incidencias.txt");

        ControladorMenu.iniciarMenu();
        ServicioFichero servicioFichero = new ServicioFichero();
        servicioFichero.guardar();
        System.out.println("Incidencia guardada correctamente");
        servicioFichero.buscarUsuario();
        servicioFichero.buscarFecha();
        servicioFichero.mostrarIncidencias();
    }


}
