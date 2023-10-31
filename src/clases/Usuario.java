
package clases;

public class Usuario{
    private int id;
    private String nombreUsuario;
    private String apellidoUsuario;
    private int identificacionUsuario;
    private int edadUsuario;
    private String usuario;
    private String contraseña;
    private String tipoUser;

    public Usuario() {
        this.nombreUsuario = "";
        this.apellidoUsuario = "";
        this.identificacionUsuario = 0;
        this.edadUsuario = 0;
        this.usuario = "";
        this.contraseña = "";
        this.tipoUser = "";
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, int identificacionUsuario, int edadUsuario, String usuario, String contraseña, String tipoUser) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.identificacionUsuario = identificacionUsuario;
        this.edadUsuario = edadUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoUser = tipoUser;
    }

    public Usuario(int id, String nombreUsuario, String apellidoUsuario, int identificacionUsuario, int edadUsuario, String usuario, String contraseña) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.identificacionUsuario = identificacionUsuario;
        this.edadUsuario = edadUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(int id) {
        this.id = id;
    }
    
    

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
           
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
