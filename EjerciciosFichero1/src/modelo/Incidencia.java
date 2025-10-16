package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Incidencia {
    private int ID;
    private String excepcion;
    private String usuario;
    private LocalDate fecha;
    private LocalTime hora;


    public Incidencia(String usuario,String excepcion,LocalDate fecha,LocalTime hora){
        this.usuario = usuario;
        this.excepcion = excepcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return fecha + ";" + hora.format(formatter) + ";" + excepcion + ";" + usuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
