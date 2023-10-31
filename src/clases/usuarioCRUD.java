
package clases;

public interface usuarioCRUD {
    public boolean registrar(Usuario user);
    public boolean buscar(Usuario user);
    public boolean modificar(Usuario user);
    public boolean eliminar(Usuario user);
}
