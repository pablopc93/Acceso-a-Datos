package repositorio;

import modelo.Incidencia;
import modelo.ListaIncidencias;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Fichero {
    private String ruta;
    private ListaIncidencias listaIncidencias;

    public Fichero(String ruta) {
        this.ruta = ruta;
        this.listaIncidencias = new ListaIncidencias();
    }


    /*
    entrada y salida
    metodos para el fichero
     */

    public void addDato(String dato) throws IOException {

        listaIncidencias.getIncidenciasString().add(dato);
        //instanciamos variables
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter escritor = null;

        try{

            file = new File(ruta);
            //por si no hubiese carpeta datos la crea
            file.getParentFile().mkdir();

            //para escribir en el archivo,
            fileWriter = new FileWriter(file,true);
            escritor = new BufferedWriter(fileWriter);

            escritor.newLine(); //linea nueva
            escritor.write(dato);
            System.out.println("Dato añadido correctamente");
            System.out.println(dato);

        } catch (IOException e) {
            System.err.println("No encuentro el fichero");
        }finally {
            //tengo que cerrar el buffer y file
            try{
                if (escritor != null){
                    escritor.close();
                }
                if (fileWriter != null){
                    fileWriter.close();
                }
            } catch (Exception e) {
                System.err.println("Error al cerrar el fichero");
            }
        }
    }
    public void buscarUsuario(String usuario) throws IOException {
        ArrayList<String> incidencias = listaIncidencias.getIncidenciasString(); //llamo al arrayList
        boolean usuarioEncontrado = false;
        //bucle que lee el arrayList en busca del usuario
        for (String x:incidencias){
            if (x.toLowerCase().contains(usuario)){ //contains para ver si contiene el usuario
                System.out.println(x);
                usuarioEncontrado = true;
            }
        }
        if (!usuarioEncontrado){
            System.out.println("No se encontraron incidencias con el usuario: "+usuario);
        }
    }


    public ArrayList<Incidencia> buscarFecha(LocalDate fechaInicio, LocalDate fechaFinal){
        //Buscar en el fichero datos q esten entre 2 fechas.

        ArrayList<Incidencia> resultados = new ArrayList<>(); //creo el arrayList

        try {

            for (Incidencia x : listaIncidencias.getIncidencia()) { //accedo al arrayList Incidencia para leer el fichero
                LocalDate fechaIncidencia = x.getFecha();

                // condicional para encontrar las lineas que esten >= q la fecha de inicio o <= que la fecha final
                if ((fechaIncidencia.isEqual(fechaInicio) || fechaIncidencia.isAfter(fechaInicio))
                        && (fechaIncidencia.isEqual(fechaFinal) || fechaIncidencia.isBefore(fechaFinal))) {
                    resultados.add(x);
                }
            }
        } catch (Exception e) {
            System.err.println("Error al buscar entre fechas");
        }
        return resultados;
    }


}