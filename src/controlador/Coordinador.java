package controlador;
import vista.*;

public class Coordinador {

    private VentanaPrincipal miVentanaPrincipal;

    public void mostrarVentanaPrincipal(){
        miVentanaPrincipal.setVisible(true);
    }

    public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }

    public VentanaPrincipal getMiVentanaPrincipal() {
        return miVentanaPrincipal;
    }
}
