package modelo;

import repositorio.Fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaIncidencias {
    private ArrayList<Incidencia> incidencias;
    private ArrayList<String> incidenciasString;

    public ListaIncidencias(){
        incidenciasString = new ArrayList<>(); //creamos el array list de Strings
        incidencias = new ArrayList<>(); // arraylist de Incidencia
        leerArchivo("datos/incidencias.txt"); //leo el archivo
    }

    public void leerArchivo(String ruta){
        //metodo para leer el archivo
        BufferedReader br = null;
        String linea = null;

        try{
            br = new BufferedReader(new FileReader(ruta));


            while ((linea = br.readLine()) != null){
                incidenciasString.add(linea.trim());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo");
            }
        }
    }

    public ArrayList<String> getIncidenciasString() {
        return incidenciasString;
    }
    public ArrayList<Incidencia> getIncidencia(){
        return incidencias; //devuelvo el arrayList de Incidencias para la busqueda de fecha
    }
    public void mostrarArchivos(){
        //bucle para leer el arrayList que contiene el fichero
        for (String x : incidenciasString ){
            System.out.println(x);
        }
    }

}
