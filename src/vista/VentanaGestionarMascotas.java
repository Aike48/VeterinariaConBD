package vista;

import controlador.Coordinador;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class VentanaGestionarMascotas extends JFrame implements ActionListener {
    private JPanel contentPane;
    private Coordinador miCoordinador;
    JLabel lblTitulo;
    JLabel lblDuenoID;
    JLabel lblRaza;
    JLabel lblNombre;
    JLabel lblSexo;
    JButton btnRegistrar;
    JButton btnConsultar;
    JButton btnActualizar;
    JButton btnEliminar;
    JButton btnConsultarLista;
    JTextField txtDuenoID;
    JTextField txtRaza;
    JTextField txtNombre;
    JTextField txtSexo;
    JSeparator separador;
    JTextArea listaTxt;
    JScrollPane listaScroll;


    public void setCoordinador(Coordinador coordinador) {
        this.miCoordinador = coordinador;
    }

    public VentanaGestionarMascotas() {
        setSize(491, 576);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciar();
    }

    public void iniciar() {
        contentPane = new VentanaGestionarMascotas.JPanelImagen();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelPrincipal.setBounds(0, 0, 477, 379);
        getContentPane().add(panelPrincipal);

        lblTitulo = new JLabel();
        lblDuenoID = new JLabel();
        lblRaza = new JLabel();
        lblNombre = new JLabel();
        lblSexo = new JLabel();
        btnRegistrar = new JButton();
        btnConsultar = new JButton();
        btnActualizar = new JButton();
        btnEliminar = new JButton();
        btnConsultarLista = new JButton();
        txtDuenoID = new JTextField();
        txtRaza = new JTextField();
        txtNombre = new JTextField();
        txtSexo = new JTextField();
        separador = new JSeparator();
        listaTxt = new JTextArea();
        listaScroll = new JScrollPane(listaTxt);

        panelPrincipal.setLayout(null);
        panelPrincipal.setBounds(0, 0, 500, 450);
        getContentPane().add(panelPrincipal);

        lblTitulo.setText("GESTIONAR MASCOTAS");
        lblTitulo.setBounds(0, 16, 450, 25);
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPrincipal.add(lblTitulo);

        lblDuenoID.setText("id dueño:");
        lblDuenoID.setBounds(24, 54, 70, 25);
        panelPrincipal.add(lblDuenoID);

        txtDuenoID.setBounds(80, 53, 110, 27);
        panelPrincipal.add(txtDuenoID);

        lblRaza.setText("Raza:");
        lblRaza.setBounds(250, 54, 60, 25);
        panelPrincipal.add(lblRaza);

        lblSexo.setText("Sexo:");
        lblSexo.setBounds(250, 90, 60, 25);
        panelPrincipal.add(lblSexo);

        txtRaza.setBounds(300, 53, 110, 27);
        panelPrincipal.add(txtRaza);

        txtNombre.setBounds(80, 90, 110, 27);
        panelPrincipal.add(txtNombre);

        txtSexo.setBounds(300, 90, 110, 27);
        panelPrincipal.add(txtSexo);

        lblNombre.setText("Nombre:");
        lblNombre.setBounds(28, 88, 70, 25);
        panelPrincipal.add(lblNombre);

        separador.setOrientation(SwingConstants.HORIZONTAL);
        separador.setBounds(36, 140, 370, 25);
        panelPrincipal.add(separador);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setBounds(36, 150, 180, 35);
        btnRegistrar.addActionListener(this);
        panelPrincipal.add(btnRegistrar);

        btnConsultar.setText("Consultar");
        btnConsultar.setBounds(225, 150, 180, 35);
        btnConsultar.addActionListener(this);
        panelPrincipal.add(btnConsultar);

        btnActualizar.setText("Actualizar");
        btnActualizar.setBounds(36, 190, 180, 35);
        btnActualizar.addActionListener(this);
        panelPrincipal.add(btnActualizar);

        btnEliminar.setText("Eliminar");
        btnEliminar.setBounds(225, 190, 180, 35);
        btnEliminar.addActionListener(this);
        panelPrincipal.add(btnEliminar);

        btnConsultarLista.setText("Consultar lista");
        btnConsultarLista.setBounds(36, 232, 370, 35);
        btnConsultarLista.addActionListener(this);
        panelPrincipal.add(btnConsultarLista);

        listaScroll.setBounds(36, 280, 370, 220);
        panelPrincipal.add(listaScroll);

        miCoordinador = new Coordinador();
    }

    private void registrar() {
        // Lógica para gestionar personas
    }

    private void consultar() {
        // Lógica para gestionar mascotas
    }

    private void actualizar() {
        // Lógica para gestionar personas
    }

    private void eliminar() {
        // Lógica para gestionar mascotas
    }
    private void consultarLista() {
        // Lógica para gestionar personas
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            registrar();
        } else if (e.getSource() == btnConsultar) {
            consultar();
        } else if (e.getSource() == btnActualizar){
            actualizar();
        } else if (e.getSource() == btnEliminar){
            eliminar();
        } else if (e.getSource() == btnConsultarLista){
            consultarLista();
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
