import vista.*;
/**import modelo.*; **/
import controlador.*;

public class Main {

    private VentanaGestionarPersonas miVentanaGestionarPersonas;
    private VentanaGestionarMascotas miVentanaGestionarMascotas;
    private VentanaPrincipal miVentanaPrincipal;
/**    private ModeloDatos miModeloDatos;**/
    private Coordinador miCoordinador;

    public static void main(String[] args) {
        Main miPrincipal = new Main();
        miPrincipal.iniciar();
    }

    public void iniciar() {
        miVentanaGestionarPersonas = new VentanaGestionarPersonas();
        miVentanaGestionarMascotas = new VentanaGestionarMascotas();
        miVentanaPrincipal = new VentanaPrincipal();
/**        miVentanaPrincipal = new VentanaOperaciones();
        miModeloDatos = new ModeloDatos(); **/
        miCoordinador = new Coordinador();
/**
        // Asignar el coordinador a las ventanas
        miVentanaConsulta.setCoordinador(miCoordinador);
        miVentanaConsultaGeneral.setCoordinador(miCoordinador);
        miVentanaConsultaPersonas.setCoordinador(miCoordinador);  **/
        miVentanaPrincipal.setCoordinador(miCoordinador); /**

        // Asignar ventanas al coordinador
        miCoordinador.setVentanaConsulta(miVentanaConsulta);
        miCoordinador.setVentanaConsultaGeneral(miVentanaConsultaGeneral);
        miCoordinador.setVentanaConsultaPersonas(miVentanaConsultaPersonas);**/
        miCoordinador.setVentanaPrincipal(miVentanaPrincipal);

        // Mostrar ventana principal
        miCoordinador.mostrarVentanaPrincipal();
    }

}
