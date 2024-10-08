package controlador;

import modelo.VO.MascotasVO; // Assuming you have a VO class for pets
import modelo.DAO.MascotasDAO; // Import your DAO
import vista.VentanaPrincipal;
import vista.VentanaGestionarMascotas;

import javax.swing.*;

public class Coordinador {
    private MascotasDAO miMascotaDao;
    private VentanaPrincipal miVentanaPrincipal;
    private VentanaGestionarMascotas miVentanaGestionarMascotas; // Add this reference

    public Coordinador() {
        miMascotaDao = new MascotasDAO(); // Initialize your DAO
    }

    public void mostrarVentanaPrincipal() {
        miVentanaPrincipal.setVisible(true);
    }

    public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }

    public VentanaPrincipal getMiVentanaPrincipal() {
        return miVentanaPrincipal;
    }

    public void setVentanaGestionarMascotas(VentanaGestionarMascotas ventana) {
        this.miVentanaGestionarMascotas = ventana;
    }

    public void registrarMascota(int idPropietario, String nombreAnimal, String razaAnimal, String sexoAnimal) {
        MascotasVO nuevaMascota = new MascotasVO(); // Create a new pet VO instance
        nuevaMascota.setNombre(nombreAnimal);
        nuevaMascota.setRaza(razaAnimal);
        nuevaMascota.setSexo(sexoAnimal);
        // Call the DAO to register the pet
        boolean exito = miMascotaDao.registrar(nuevaMascota);
        if (exito) {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Mascota registrada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Error al registrar la mascota.");
        }
    }

    public void consultarMascota(int id) {
        MascotasVO mascota = miMascotaDao.consultar(id);
        if (mascota != null) {
            // Update the UI with the pet's information (assuming you have a method for that)
            miVentanaGestionarMascotas.mostrarMascota(mascota);
        } else {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Mascota no encontrada.");
        }
    }

    public void actualizarMascota(int id, String nombre, String raza, String sexo) {
        MascotasVO mascota = new MascotasVO();
        mascota.setId(id);
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setSexo(sexo);
        boolean exito = miMascotaDao.actualizar(mascota);
        if (exito) {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Mascota actualizada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Error al actualizar la mascota.");
        }
    }

    public void eliminarMascota(int id) {
        boolean exito = miMascotaDao.eliminar(id);
        if (exito) {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Mascota eliminada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(miVentanaGestionarMascotas, "Error al eliminar la mascota.");
        }
    }

    public void consultarListaMascotas() {
        String lista = miMascotaDao.consultarLista(); // Assuming this returns a String with all pets
        miVentanaGestionarMascotas.mostrarListaMascotas(lista); // Method to update the UI
    }
}
