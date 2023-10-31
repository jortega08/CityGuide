package clases;

import cityguide.Principal;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionUsuario implements usuarioCRUD{
    public Connection conexion;
    public PreparedStatement sentencia_preparada;
    public ResultSet resultado;

    public GestionUsuario() {
        conexion = SQLconexion.conectar();
    }

    public int buscarIdUsuario(String usuario, String passw) {
    int idUsuario = -1;
    Connection conexion = null;
    PreparedStatement sentencia_preparada = null;
    ResultSet result = null;

    try {
        conexion = SQLconexion.conectar();
        String query = "SELECT id FROM usuarios_registro WHERE usuario = ? AND passw = ?";
        sentencia_preparada = conexion.prepareStatement(query);
        sentencia_preparada.setString(1, usuario);
        sentencia_preparada.setString(2, passw);
        result = sentencia_preparada.executeQuery();

        if (result.next()) {
            idUsuario = result.getInt("id");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (result != null) {
                result.close();
            }
            if (sentencia_preparada != null) {
                sentencia_preparada.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return idUsuario;
}
    
    //Verificacion si la identificacion (numero de cedula) ya existe en la base de datos
    public boolean idExistente(int identificacion) {
            String sql = "SELECT COUNT(*) FROM usuarios_registro WHERE cedula = ?";
    
            try {
                conexion = SQLconexion.conectar();
                sentencia_preparada = conexion.prepareStatement(sql);
                sentencia_preparada.setInt(1, identificacion);
                resultado = sentencia_preparada.executeQuery();

                if (resultado.next()) {
                    int count = resultado.getInt(1);
                    return count > 0;
                }
            } catch (SQLException e) {
                System.err.println("Error al verificar la identificacion existente: " + e.getMessage());
            } finally {
                
            }
            return false;
    }    
    
        //Verificacion si existe el usuario en la base de datos
        public boolean usuarioExistente(String usuario) {
            String sql = "SELECT COUNT(*) FROM usuarios_registro WHERE usuario = ?";
    
            try {
                conexion = SQLconexion.conectar();
                sentencia_preparada = conexion.prepareStatement(sql);
                sentencia_preparada.setString(1, usuario);
                resultado = sentencia_preparada.executeQuery();

                if (resultado.next()) {
                    int count = resultado.getInt(1);
                    return count > 0;
                }
            } catch (SQLException e) {
                System.err.println("Error al verificar la identificacion existente: " + e.getMessage());
            } finally {
                
            }
            return false;
        }
    
    public Usuario obtenerDatosUsuario(int idUsuario) {
        Usuario datosUsuario = null;
        try {
            conexion = SQLconexion.conectar();
            String query = "SELECT id, nombre, apellido, cedula, edad, usuario, passw FROM usuarios_registro WHERE id = ?";
            sentencia_preparada = conexion.prepareStatement(query);
            sentencia_preparada.setInt(1, idUsuario);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                datosUsuario = new Usuario();
                datosUsuario.setNombreUsuario(resultado.getString("nombre"));
                datosUsuario.setApellidoUsuario(resultado.getString("apellido"));
                datosUsuario.setIdentificacionUsuario(resultado.getInt("cedula"));
                datosUsuario.setEdadUsuario(resultado.getInt("edad"));
                datosUsuario.setUsuario(resultado.getString("usuario"));
                datosUsuario.setContraseña(resultado.getString("passw"));
                datosUsuario.setId(resultado.getInt("id"));
            }

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosUsuario;
    }

    //Manejo del CRUD de los usuarios
    @Override
    public boolean registrar(Usuario user) {
        if (idExistente(user.getIdentificacionUsuario())) {
            JOptionPane.showMessageDialog(null, "La identificación ya está registrada.");
            return false;
        } else if (usuarioExistente(user.getUsuario())) {
            JOptionPane.showMessageDialog(null, "El usuario ya está registrado.");
            return false;
        }

        String sql = "INSERT INTO usuarios_registro (nombre, apellido, cedula, edad, usuario, passw, tipoUsuario) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement sentencia_preparada = conexion.prepareStatement(sql)) {
            sentencia_preparada.setString(1, user.getNombreUsuario());
            sentencia_preparada.setString(2, user.getApellidoUsuario());
            sentencia_preparada.setInt(3, user.getIdentificacionUsuario());
            sentencia_preparada.setInt(4, user.getEdadUsuario());
            sentencia_preparada.setString(5, user.getUsuario());
            sentencia_preparada.setString(6, user.getContraseña());
            sentencia_preparada.setString(7, user.getTipoUser());

            int registrosInsertados = sentencia_preparada.executeUpdate();

            return registrosInsertados > 0;
        } catch (SQLException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean buscar(Usuario user) {
        String sql = "SELECT usuario, passw FROM usuarios_registro WHERE usuario = ? AND passw = ?";
        boolean autenticacionExitosa = false;

        try (Connection conexion = SQLconexion.conectar();
             PreparedStatement sentencia_preparada = conexion.prepareStatement(sql)) {

            sentencia_preparada.setString(1, user.getUsuario());
            sentencia_preparada.setString(2, user.getContraseña());

            try (ResultSet resultado = sentencia_preparada.executeQuery()) {
                if (resultado.next()) {
                    autenticacionExitosa = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autenticacionExitosa;
    }

    @Override
    public boolean modificar(Usuario user) {
        try {
            conexion = SQLconexion.conectar();
            String verificarQuery = "SELECT COUNT(*) FROM usuarios_registro WHERE id = ?";
            sentencia_preparada = conexion.prepareStatement(verificarQuery);
            sentencia_preparada.setInt(1, user.getId());
            ResultSet resultadoVerificacion = sentencia_preparada.executeQuery();

            resultadoVerificacion.next();
            int existencia = resultadoVerificacion.getInt(1);

                if (existencia == 0) {
                    return false;
                }
                
            String updateQuery = "UPDATE usuarios_registro SET nombre=?, apellido=?, cedula=?, edad=?, usuario=?, passw=? WHERE id = ?";
            sentencia_preparada = conexion.prepareStatement(updateQuery);
            sentencia_preparada.setString(1, user.getNombreUsuario());
            sentencia_preparada.setString(2, user.getApellidoUsuario());
            sentencia_preparada.setInt(3, user.getIdentificacionUsuario());
            sentencia_preparada.setInt(4, user.getEdadUsuario());
            sentencia_preparada.setString(5, user.getUsuario());
            sentencia_preparada.setString(6, user.getContraseña());
            sentencia_preparada.setInt(7, user.getId());

            int registrosActualizados = sentencia_preparada.executeUpdate();
            return registrosActualizados > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(Usuario user) {
        String sql = "DELETE FROM usuarios_registro WHERE id = ?";
        conexion = SQLconexion.conectar();
    
        try (PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setInt(1, user.getId());
            int registrosEliminados = sentencia.executeUpdate();
            return registrosEliminados > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }  
}
