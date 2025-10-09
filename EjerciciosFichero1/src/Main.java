import controlador.ControladorIncidencias;
import controlador.ControladorMenu;
import modelo.Incidencia;
import vista.Consola;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        try{
            ControladorIncidencias.iniciar();
            ControladorMenu.iniciarMenu();
        } catch (IOException e) {
            System.err.println("Error de aplicación");
        }
        
    }
}