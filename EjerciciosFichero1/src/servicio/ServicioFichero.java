package servicio;

import modelo.Incidencia;
import repositorio.Fichero;

import java.io.IOException;

public class ServicioFichero {

    public static void guardar(String usuario, String opcion) throws IOException {
        Incidencia incidencia = new Incidencia(usuario,opcion);
        Fichero fichero = new Fichero("datos/incidencias.txt");
        fichero.addDato(incidencia.toString());
    }

}
