package servicio;

import modelo.Incidencia;
import repositorio.Fichero;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ServicioFichero {
    //recive incidencia, pasa a string y devuelve a fichero
    public static void guardar(String usuario, String opcion, LocalDate fecha, LocalTime hora) throws IOException {
        Incidencia incidencia = new Incidencia(usuario,opcion,fecha,hora);
        Fichero fichero = new Fichero("datos/incidencias.txt");
        fichero.addDato(incidencia.toString());
    }

}
