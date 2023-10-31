
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GestionNegocio implements negocioCRUD{
    public Connection conexion;
    public PreparedStatement sentencia_preparada;
    public ResultSet resultado;

    public GestionNegocio() {
        conexion = SQLconexion.conectar();
    }

        public boolean nombreNegocioExiste(String nombre) {
            String sql = "SELECT COUNT(*) FROM negocio WHERE nombreNegocio = ?";
    
            try {
                conexion = SQLconexion.conectar();
                sentencia_preparada = conexion.prepareStatement(sql);
                sentencia_preparada.setString(1, nombre);
                resultado = sentencia_preparada.executeQuery();

                if (resultado.next()) {
                    int count = resultado.getInt(1);
                    return count > 0;
                }
            } catch (SQLException e) {
                System.err.println("Error al verificar la identificacion existente: " + e.getMessage());
            } finally {
                // Cierre de recursos
                // ...
            }
            return false;
        }
    
    public void agregarReseña(int id, int idUsuario, int idNegocio, String usuario, float puntuacion, String comentario) {
    try {
        conexion = SQLconexion.conectar();
        String verificaQuery = "SELECT COUNT(*) FROM reseñas WHERE idusuario = ? AND idnegocio = ?";
        PreparedStatement verificaSentencia = conexion.prepareStatement(verificaQuery);
        verificaSentencia.setInt(1, idUsuario);
        verificaSentencia.setInt(2, idNegocio);
        ResultSet resultadoVerifica = verificaSentencia.executeQuery();
        
        if (resultadoVerifica.next()) {
            int cantidadReseñas = resultadoVerifica.getInt(1);
            if (cantidadReseñas > 0) {
                String updateQuery = "UPDATE reseñas SET idusuario = ?, idnegocio = ?, usuario = ?, puntuacion = ?, fecha = ?, comentario = ? WHERE id = ?";
                PreparedStatement updateSentencia = conexion.prepareStatement(updateQuery);
                updateSentencia.setInt(1, idUsuario);
                updateSentencia.setInt(2, idNegocio);
                updateSentencia.setString(3, usuario);
                updateSentencia.setFloat(4, puntuacion);
                java.util.Date fecha = new java.util.Date();
                java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
                updateSentencia.setDate(5, fechaSQL);
                updateSentencia.setString(6, comentario);
                updateSentencia.setInt(7, id);
                updateSentencia.executeUpdate();
            } else {
                String insertQuery = "INSERT INTO reseñas (idusuario, idnegocio, usuario, puntuacion, fecha, comentario) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement insertSentencia = conexion.prepareStatement(insertQuery);
                insertSentencia.setInt(1, idUsuario);
                insertSentencia.setInt(2, idNegocio);
                insertSentencia.setString(3, usuario);
                insertSentencia.setFloat(4, puntuacion);
                java.util.Date fecha = new java.util.Date();
                java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
                insertSentencia.setDate(5, fechaSQL);
                insertSentencia.setString(6, comentario);
                insertSentencia.executeUpdate();
            }
        }

        conexion.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



    public float calcularPuntuacion(int negocioId) {
        try {
            String query = "SELECT AVG(puntuacion) AS promedio FROM reseñas WHERE idnegocio = ?";
            conexion = SQLconexion.conectar();
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setInt(1, negocioId);
            ResultSet resultado = sentencia.executeQuery();

            if (resultado.next()) {
                return resultado.getFloat("promedio");
            }

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0f;
    }
    
    //Manejo del CRUD de los negocios
    @Override
    public boolean registrar(Negocio neg) {
        if (nombreNegocioExiste(neg.getNombreNegocio())) {
            JOptionPane.showMessageDialog(null, "El nombre del lugar ya está registrado.");
            return false;
        }
    
        String sql = "INSERT INTO negocio (nombreNegocio, tipoNegocio, direccionNegocio, horario_Atencion) VALUES (?, ?, ?, ?)";

        try (Connection conexion = SQLconexion.conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, neg.getNombreNegocio());
            sentencia.setString(2, neg.getTipoNegocio());
            sentencia.setString(3, neg.getDireccionNegocio());
            sentencia.setString(4, neg.getHorarioAtencion());

            int registrosInsertados = sentencia.executeUpdate();
            return registrosInsertados > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al registrar lugar: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean buscar(Negocio neg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Negocio neg) {
        try {
        conexion = SQLconexion.conectar();
        String verificarQuery = "SELECT COUNT(*) FROM negocio WHERE idnegocio = ?";
        sentencia_preparada = conexion.prepareStatement(verificarQuery);
        sentencia_preparada.setInt(1, neg.getIdNegocio());
        ResultSet resultadoVerificacion = sentencia_preparada.executeQuery();

        resultadoVerificacion.next();
        int existencia = resultadoVerificacion.getInt(1);

            if (existencia == 0) {
                return false;
            }
            
        String updateQuery = "UPDATE negocio SET nombreNegocio=?, tipoNegocio=?, direccionNegocio=?, horario_Atencion=?, puntuacion=? WHERE idnegocio = ?";
        sentencia_preparada = conexion.prepareStatement(updateQuery);
        sentencia_preparada.setString(1, neg.getNombreNegocio());
        sentencia_preparada.setString(2, neg.getTipoNegocio());
        sentencia_preparada.setString(3, neg.getDireccionNegocio());
        sentencia_preparada.setString(4, neg.getHorarioAtencion());
        sentencia_preparada.setFloat(5, neg.getPuntuacion());
        sentencia_preparada.setInt(6, neg.getIdNegocio());

        int registrosActualizados = sentencia_preparada.executeUpdate();
        return registrosActualizados > 0;
        
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(Negocio neg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

