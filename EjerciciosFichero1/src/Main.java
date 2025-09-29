import controlador.ControladorIncidencias;
import modelo.Incidencia;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ControladorIncidencias.iniciar();


        String cadena = "2025/09/16;14:02:00;excepción test1;usuario1";
        String[] datos = null;
        datos = new String[4];
        datos = cadena.split(";");
        System.out.println(Arrays.toString(datos));

        Incidencia fallo = new Incidencia();
    }
}