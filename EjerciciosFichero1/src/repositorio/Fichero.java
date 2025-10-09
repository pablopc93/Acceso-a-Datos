package repositorio;

import modelo.ListaIncidencias;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
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
        String text = "";
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
    public void buscarUsuario(String usuario) throws IOException {

        String linea;
        boolean encontrado = false;

        try (BufferedReader lector= new BufferedReader(new FileReader("datos/incidencias.txt"))) {

            while ((linea = lector.readLine()) != null) {
                if (linea.toLowerCase().contains(usuario.toLowerCase())) {
                    System.out.println(linea);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron incidencias para el usuario " + usuario);
            }

        } catch (FileNotFoundException e) {
            System.err.println("No encuentro el fichero");
        } catch (IOException e) {
            System.err.println("Error de lectura");
        }
    }

//    public static ArrayList<ListaIncidencias> buscarUsuarioArrayList(String usuario, ListaIncidencias datos){
//        ArrayList<ListaIncidencias> listaIncidencias = new ArrayList<>();
//        try{
//            for (int i=0;i<listaIncidencias.size();i++){
//                listaIncidencias.add(new ListaIncidencias())
//            }
//        }catch (Exception e){
//            e.getMessage();
//        }
//        return listaIncidencias;
//    }

    public String buscarFecha(LocalDate fecha, LocalTime hora){
        //Buscar en el fichero datos q esten entre 2 fechas.

        return "";
    }
    public ArrayList<String> leerIncidencias(String ruta) {
        ArrayList<String> incidencias = new ArrayList<>();
        BufferedReader br = null;
        String linea = null;

        try {
            br = new BufferedReader(new FileReader(ruta));
            while ((linea = br.readLine()) != null) {
                incidencias.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de incidencias: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }

        return incidencias;
    }

}