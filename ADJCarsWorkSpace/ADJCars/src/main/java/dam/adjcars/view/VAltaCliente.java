package dam.adjcars.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.adjcars.control.AdjListener;
import dam.adjcars.model.Cliente;

import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VAltaCliente extends JFrame {
	public static final String MNTM_SALIR_ALTA_CLIENTE = "Salir";
	public static final String BTN_DAR_ALTA_CLIENTE = "Dar de alta";
	private JMenuItem mntmSalirAltaNuevoCliente;
	private JTextField txtNombreAltaCliente;
	private JPasswordField psdContraseña;
	private JTextField txtEmail;
	private JButton btnAlta;
	private JLabel lblNewLabel_4;
	private JTextField txtFecha;
	private JTextField txtTelefono;

	public VAltaCliente() {
		super("Alta nuevo cliente");
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(VPrincipal.ANCHO + 200, VPrincipal.ALTO + 200);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(VPrincipal.ANCHO + 200, VPrincipal.ALTO + 200);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
		getContentPane().setLayout(null);

		JLabel lblAltaNuevoCliente = new JLabel("Alta nuevo cliente");
		lblAltaNuevoCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblAltaNuevoCliente.setBounds(44, 25, 277, 73);
		getContentPane().add(lblAltaNuevoCliente);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(44, 109, 46, 14);
		getContentPane().add(lblNewLabel);

		txtNombreAltaCliente = new JTextField();
		txtNombreAltaCliente.setBounds(126, 106, 205, 20);
		getContentPane().add(txtNombreAltaCliente);
		txtNombreAltaCliente.setColumns(10);

		psdContraseña = new JPasswordField();
		psdContraseña.setBounds(440, 103, 205, 20);
		getContentPane().add(psdContraseña);

		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(358, 106, 56, 14);
		getContentPane().add(lblNewLabel_1);

		txtEmail = new JTextField();
		txtEmail.setBounds(126, 148, 205, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(44, 151, 46, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Teléfono");
		lblNewLabel_3.setBounds(358, 151, 46, 14);
		getContentPane().add(lblNewLabel_3);

		btnAlta = new JButton(BTN_DAR_ALTA_CLIENTE);
		btnAlta.setBounds(415, 194, 181, 23);
		getContentPane().add(btnAlta);

		lblNewLabel_4 = new JLabel("Fecha");
		lblNewLabel_4.setBounds(44, 198, 46, 14);
		getContentPane().add(lblNewLabel_4);

		txtFecha = new JTextField();
		txtFecha.setBounds(126, 195, 205, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(440, 148, 205, 20);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmSalirAltaNuevoCliente = new JMenuItem(MNTM_SALIR_ALTA_CLIENTE);
		menuBar.add(mntmSalirAltaNuevoCliente);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void setListener(AdjListener listener) {
		mntmSalirAltaNuevoCliente.addActionListener(listener);
		btnAlta.addActionListener(listener);
	}

	public Cliente getDatos() {
		Cliente cliente = null;

		String nombre = txtNombreAltaCliente.getText().trim();
		String contraseña = psdContraseña.getText().trim();
		String email = txtEmail.getText().trim();
		String telefono = txtTelefono.getText().trim();
		String fecha = txtFecha.getText();
		if (nombre.isEmpty() || contraseña.isEmpty() || email.isEmpty() || telefono.isEmpty() || fecha.isEmpty()) {
			mostrarError("Debe introducir todos los campos del cliente");
		} else {
			nombre = txtNombreAltaCliente.getText();
			contraseña = psdContraseña.getText();
			email = txtEmail.getText();
			telefono = txtTelefono.getText();
			fecha = txtFecha.getText();

			cliente = new Cliente(contraseña, nombre, email, telefono, fecha);
		}

		return cliente;
	}

	public void mostrarError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);
	}
}
