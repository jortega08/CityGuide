
package clases;

public class Preferencia {
    private int id;
    private String preferencia;

    public Preferencia() {
    }

    public Preferencia(int id, String preferencia) {
        this.id = id;
        this.preferencia = preferencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
    
    
}
