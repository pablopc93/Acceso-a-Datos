package servicio;

import modelo.Incidencia;
import modelo.ListaIncidencias;
import repositorio.Fichero;
import vista.Consola;
import vista.Escaner;

import repositorio.Fichero;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ForkJoinPool;

public class ServicioFichero {

    private Fichero fichero = new Fichero("datos/incidencias.txt");
    //recibe incidencia, pasa a string y devuelve a fichero

    //metodo para guardar la incidencia, doy datos a la clase incidencia
    public void guardar() throws IOException {
        String usuario = Consola.leerString("Introduce el usuario: ");
        String excepcion = Consola.leerString("¿Que exception ha ocurrido?: ");
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        Incidencia incidencia = new Incidencia(usuario,excepcion,fecha,hora);
        fichero.addDato(incidencia.toString()); //añado la incidencia a la lista
    }

    public void buscarUsuario() throws IOException {
        String usuario = Consola.leerString("Introduce usuario: "); //escribo el usuario
        fichero.buscarUsuario(usuario); //llamo metodo para buscar el usuario

    }
    public void buscarFecha(){
        //pedimos el rango de la fecha al usuario
        LocalDate fechaInicio = LocalDate.parse(Consola.leerString("Introduce la fecha de inicio (yyyy-MM-dd): "));
        LocalDate fechaFinal = LocalDate.parse(Consola.leerString("Introduce la fecha final (yyyy-MM-dd): "));
        //LocalDate se tiene q parsear para que se guarden como string

        fichero.buscarFecha(fechaInicio,fechaFinal); //mando las fechas al metodo para recibir incidencia por fecha
    }
    public void mostrarIncidencias(){
        //fichero.leerIncidencias(String.valueOf(fichero));
        ListaIncidencias listaIncidencias = new ListaIncidencias();
        listaIncidencias.mostrarArchivos(); //simplemente llamamos al metodo para mostrar lo que contiene el fichero
    }
}
