package mx.gob.galeana.model;

/**
 * Created by Uriel on 22/05/2017.
 */

public class IdiomaAdicional {
    private int idIdiomaAdicional;
    private String nombre;

    public IdiomaAdicional(int idIdiomaAdicional, String nombre) {
        this.idIdiomaAdicional = idIdiomaAdicional;
        this.nombre = nombre;
    }

     public int getIdIdiomaAdicional() {
        return idIdiomaAdicional;
    }

    public void setIdIdiomaAdicional(int idIdiomaAdicional) {
        this.idIdiomaAdicional = idIdiomaAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
