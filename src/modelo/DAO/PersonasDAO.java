package modelo.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {

    // Create (Insertar una Personas)
    public boolean insertarPersonas(PersonasVO Personas) {
        String sql = "INSERT INTO Personass (nombre, email) VALUES (?, ?)";
        try (Connection conexion = Conexion.getConnection();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, Personas.getNombre());
            ps.setString(2, Personas.getEmail());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar Personas: " + e.getMessage());
            return false;
        }
    }
    // Read (Obtener todos los Personass)
    public List<PersonasVO> obtenerPersonass() {
        List<PersonasVO> Personass = new ArrayList<>();
        String sql = "SELECT * FROM Personass";
        try (Connection conexion = Conexion.getConnection();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                PersonasVO Personas = new PersonasVO(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email")
                );
                Personass.add(Personas);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener Personass: " + e.getMessage());
        }
        return Personass;
    }
    // Update (Actualizar un Personas)
    public boolean actualizarPersonas(PersonasVO Personas) {
        String sql = "UPDATE Personass SET nombre = ?, email = ? WHERE id = ?";
        try (Connection conexion = Conexion.getConnection();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, Personas.getNombre());
            ps.setString(2, Personas.getEmail());

            Conexión a Bases de Datos con MySQL usando Java + Patrón DAO y VO 4

            ps.setInt(3, Personas.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar Personas: " + e.getMessage());
            return false;
        }
    }
    // Delete (Eliminar un Personas)
    public boolean eliminarPersonas(int id) {
        String sql = "DELETE FROM Personass WHERE id = ?";
        try (Connection conexion = Conexion.getConnection();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar Personas: " + e.getMessage());
            return false;
        }
    }
}
