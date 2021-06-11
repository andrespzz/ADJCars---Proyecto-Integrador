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

public class VEmpleado extends JFrame {
	public static final int ANCHO_VENTANA_PANELES = 930;
	public static final int ALTO_VENTANA_PANELES = 500;
	public static final String MNTM_REGISTRAR_VEHICULO = "Registrar vehículo";
	public static final String MNTM_CONSULTAR_VEHICULO_VEMPLE = "Consultar catálogo de vehículos";
	public static final String MNTM_MODIFICAR_VEHICULO = "Modificar vehículo";
	public static final String MNTM_SALIR_AREA_EMPLEADO = "Salir área empleado";

	private JScrollPane scrpContenedorEmpleado;
	private JMenuItem mntmModificarVehiculo;
	private JMenuItem mntmRegistrarVehiculo;
	private JMenuItem mntmSalirAreaEmpleado;
	private JMenuItem mntmConsultarVehiculoVEmple;

	public VEmpleado() {
		super("Área empleados");

		initComponents();

		crearMenu();
	}

	private void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Gestión vehículos");
		menuBar.add(mnNewMenu);

		mntmRegistrarVehiculo = new JMenuItem(MNTM_REGISTRAR_VEHICULO);
		mnNewMenu.add(mntmRegistrarVehiculo);
		
		mntmConsultarVehiculoVEmple = new JMenuItem(MNTM_CONSULTAR_VEHICULO_VEMPLE);
		mnNewMenu.add(mntmConsultarVehiculoVEmple);

		mntmModificarVehiculo = new JMenuItem(MNTM_MODIFICAR_VEHICULO);
		mnNewMenu.add(mntmModificarVehiculo);

		mntmSalirAreaEmpleado = new JMenuItem(MNTM_SALIR_AREA_EMPLEADO);
		menuBar.add(mntmSalirAreaEmpleado);
	}

	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(ANCHO_VENTANA_PANELES, ALTO_VENTANA_PANELES);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(ANCHO_VENTANA_PANELES, ALTO_VENTANA_PANELES);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

		scrpContenedorEmpleado = new JScrollPane();
		getContentPane().add(scrpContenedorEmpleado, BorderLayout.CENTER);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void cargarPanel(JPanel panel) {
		scrpContenedorEmpleado.setViewportView(panel);
	}

	public void setListener(AdjListener listener) {
		mntmRegistrarVehiculo.addActionListener(listener);
		mntmConsultarVehiculoVEmple.addActionListener(listener);
		mntmModificarVehiculo.addActionListener(listener);
		mntmSalirAreaEmpleado.addActionListener(listener);
	}

}
