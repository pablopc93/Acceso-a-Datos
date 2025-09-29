package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Incidencia {
    private int ID;
    private String excepcion;
    private LocalTime fecha;
    private String usuario;

    public Incidencia(String usuario, String opcion) {
    }

    public Incidencia(int ID, String excepcion, LocalTime fecha, String usuario) {
        this.ID = ID;
        this.excepcion = excepcion;
        this.fecha = fecha;
        this.usuario = usuario;
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

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
