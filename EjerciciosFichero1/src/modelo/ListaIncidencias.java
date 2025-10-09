package modelo;

import repositorio.Fichero;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaIncidencias {
    private List lista;


    public void setLista(List lista) {
        this.lista = lista;
    }

    public static ArrayList<String> leerArchivo(Fichero ruta) {
        ArrayList<String> lineas = new ArrayList<>();
        String linea = "";

        try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(ruta)))){

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
            return lineas;
    }
}
