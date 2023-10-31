package clases;

public class Negocio {
    private int idNegocio;
    private String nombreNegocio;
    private String tipoNegocio;
    private String direccionNegocio;
    private String horarioAtencion;
    private float puntuacion;
    private int numLugares;

    public Negocio() {
        
    }

    public Negocio(int idNegocio, String nombreNegocio, String tipoNegocio, String direccionNegocio, String horarioAtencion, float puntuacion, int numLugares) {
        this.idNegocio = idNegocio;
        this.nombreNegocio = nombreNegocio;
        this.tipoNegocio = tipoNegocio;
        this.direccionNegocio = direccionNegocio;
        this.horarioAtencion = horarioAtencion;
        this.puntuacion = puntuacion;
        this.numLugares = numLugares;
    }

    public Negocio(String nombreNegocio, String tipoNegocio, String direccionNegocio, String horarioAtencion,  int numLugares) {
        this.nombreNegocio = nombreNegocio;
        this.tipoNegocio = tipoNegocio;
        this.direccionNegocio = direccionNegocio;
        this.horarioAtencion = horarioAtencion;
        this.numLugares = numLugares;
    }

    public int getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(int idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }
    
    
    
    

    
    
}
