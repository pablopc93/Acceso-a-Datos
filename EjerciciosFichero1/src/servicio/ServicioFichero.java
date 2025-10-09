package servicio;

import modelo.Incidencia;
import modelo.ListaIncidencias;
import repositorio.Fichero;
import vista.Consola;
import vista.Escaner;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ForkJoinPool;

public class ServicioFichero {
    Fichero fichero = new Fichero("datos/incidencias.txt");
    //recibe incidencia, pasa a string y devuelve a fichero
    public void guardar() throws IOException {
        String usuario = Escaner.pedirString("Introduce el usuario: ");
        String excepcion = Escaner.pedirString("¿Que exception ha ocurrido?: ");
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        Incidencia incidencia = new Incidencia(usuario,excepcion,fecha,hora);
        fichero.addDato(incidencia.toString());
    }

    public void buscarUsuario() throws IOException {
        String usuario = Consola.leerString("Introduce usuario: ");

        fichero.buscarUsuario(usuario);

    }
    public void buscarFecha(){
        LocalDate fecha = Consola.leerFecha("Introduce la fecha: ");
        LocalTime hora = Consola.leerHora("Introduce la hora");

        fichero.buscarFecha(fecha,hora);
    }
    public void mostrarIncidencias(){
        fichero.leerIncidencias(String.valueOf(fichero));

    }
}
