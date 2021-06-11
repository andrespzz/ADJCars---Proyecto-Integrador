package dam.adjcars.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import dam.adjcars.control.AdjListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class VCliente extends JFrame {
	public static final int ANCHO_VENTANA_PANELES = 930;
	public static final int ALTO_VENTANA_PANELES = 500;
	public static final String MNTM_CONSULTAR_VEHICULO = "Consultar vehículo";
	public static final String MNTM_APARTADO_CONTACTO = "Apartado de contacto";
	public static final String MNTM_SALIR_AREA_CLIENTE = "Salir área cliente";
	private JScrollPane scrpContenedorCliente;
	private JMenuItem mntmSalirAreaCliente;
	private JMenuItem mntmConsultarVehiculo;
	private JMenuItem mntmApartadoContacto;

	public VCliente() {
		super("Área clientes");

		initComponents();

		crearMenu();
	}

	private void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Consultar");
		menuBar.add(mnNewMenu);

		mntmConsultarVehiculo = new JMenuItem(MNTM_CONSULTAR_VEHICULO);
		mnNewMenu.add(mntmConsultarVehiculo);
		
		mntmApartadoContacto = new JMenuItem(MNTM_APARTADO_CONTACTO);
		mnNewMenu.add(mntmApartadoContacto);

		mntmSalirAreaCliente = new JMenuItem(MNTM_SALIR_AREA_CLIENTE);
		menuBar.add(mntmSalirAreaCliente);
	}

	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(ANCHO_VENTANA_PANELES, ALTO_VENTANA_PANELES);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(VPrincipal.ANCHO + 200, VPrincipal.ALTO + 200);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

		scrpContenedorCliente = new JScrollPane();
		getContentPane().add(scrpContenedorCliente, BorderLayout.CENTER);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void cargarPanel(JPanel panel) {
		scrpContenedorCliente.setViewportView(panel);
	}

	public void setListener(AdjListener listener) {
		mntmConsultarVehiculo.addActionListener(listener);
		mntmApartadoContacto.addActionListener(listener);
		mntmSalirAreaCliente.addActionListener(listener);

	}

}
