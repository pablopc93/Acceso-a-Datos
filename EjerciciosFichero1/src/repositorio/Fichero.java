package repositorio;

import modelo.Incidencia;
import modelo.ListaIncidencias;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fichero {
    private String ruta;

    public Fichero(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "ruta='" + ruta + '\'' +
                '}';
    }
    /*
    entrada y salida
    metodos para el fichero
     */

    public void addDato(String dato) throws IOException {
        //Añadir la linea al fichero
        String cadena="";
        String text = "hola";
        FileWriter fichero = null;
        BufferedWriter escritor = null;

        try{
            fichero = new FileWriter("datos/incidencias.txt",true);
            escritor = new BufferedWriter(fichero);

            do {
                escritor.write(text);
                if (cadena != null){
                    System.out.println(cadena);
                    escritor.close();
                }
            }while (cadena != null);
        } catch (IOException e) {
            System.err.println("No encuentro el fichero");
        }finally {
            if (cadena!=null){
                fichero.close();
            }
        }

    }
    public String buscarDato(String dato) throws IOException {
        String cadena = "";

        FileReader fichero = null;
        BufferedReader lector = null;

        try{
            fichero = new FileReader("datos/incidencias.txt");
            lector = new BufferedReader(fichero);

            do {
                cadena = lector.readLine();
                if(cadena != null){
                    String [] datos = cadena.split(";");
                    System.out.println(datos);
                }
            }while (cadena!=null);

        } catch (FileNotFoundException e) {
            System.err.println("No encuentro el fichero");
        } catch (IOException e) {
            System.err.println("Error de lectura");
        } catch (Exception e) {
            System.err.println("Error de fichero");
        }finally {
            try{
                if (lector == null){
                    lector.close();
                }
                if (lector != null){
                    lector.close();
                }

            } catch (IOException e) {
                System.err.println("Error de lectura");
            }
        }
        return dato;
    }
    public String buscarDato(String dato,int columna){

        return "";
    }
    public String buscarFecha(LocalDate fecha_final){

        return "";
    }
    public ArrayList<String> leerFichero(String dato){

        return null;
    }
}