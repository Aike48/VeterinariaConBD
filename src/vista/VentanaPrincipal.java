package vista;
import javax.swing.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import controlador.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton btnGestionarPersonas;
    private JButton btnGestionarMascotas;
    private Coordinador miCoordinador;

    public void setCoordinador(Coordinador coordinador) {
        this.miCoordinador = coordinador;
    }

    public VentanaPrincipal() {
        setSize(691, 626);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciar();
    }

    public void iniciar() {
        contentPane = new JPanelImagen();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelPrincipal.setBounds(0, 0, 477, 379);
        contentPane.add(panelPrincipal);

        btnGestionarPersonas = new JButton("Gestionar Personas");
        btnGestionarPersonas.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnGestionarPersonas.setBounds(100, 478, 224, 31);
        btnGestionarPersonas.addActionListener(this); // Registrando el ActionListener
        panelPrincipal.add(btnGestionarPersonas);

        btnGestionarMascotas = new JButton("Gestionar Mascotas");
        btnGestionarMascotas.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnGestionarMascotas.setBounds(363, 478, 224, 31);
        btnGestionarMascotas.addActionListener(this); // Registrando el ActionListener
        panelPrincipal.add(btnGestionarMascotas);

        miCoordinador = new Coordinador();
    }

    private void gestionarPersonas() {
        VentanaGestionarPersonas ventana = new VentanaGestionarPersonas();
        ventana.setVisible(true);
    }

    private void gestionarMascotas() {
        VentanaGestionarMascotas ventana = new VentanaGestionarMascotas();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGestionarPersonas) {
            gestionarPersonas();
        } else if (e.getSource() == btnGestionarMascotas) {
            gestionarMascotas();
        }
    }

    // Clase interna para manejar el fondo de la ventana
    class JPanelImagen extends JPanel {
        private Image imagen;

        public JPanelImagen() {
            URL imgUrl = getClass().getResource("/vista/imagen/gato2.jpg");
            if (imgUrl == null){
                System.out.println ("Error con la imagen");
            } else {
                //imagen = new ImageIcon(imgUrl).getImage();
                System.out.println("Si carga");
                imagen = new ImageIcon(getClass().getResource("/vista/imagen/gato2.jpg")).getImage();
            }
        }


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagen != null) {
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}