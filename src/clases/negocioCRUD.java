package clases;

public interface negocioCRUD {
    public boolean registrar(Negocio neg);
    public boolean buscar(Negocio neg);
    public boolean modificar(Negocio neg);
    public boolean eliminar(Negocio neg);
}
