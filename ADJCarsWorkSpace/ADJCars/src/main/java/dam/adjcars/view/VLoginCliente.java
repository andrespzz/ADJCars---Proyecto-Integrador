package dam.adjcars.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;

import dam.adjcars.control.AdjListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VLoginCliente extends JFrame {
	public static final String MNTM_ATRAS_VLOGIN_CLIENTE = "Atrás";

	public static final String BTN_ENTRAR_VLOGIN_CLIENTE = "Entrar área cliente";
	public static final String BTN_ALTA_NUEVO_CLIENTE = "Alta nuevo cliente";

	private JMenuItem mntmAtrasVLoginCliente;
	private JTextField txtUsuarioCliente;
	private JPasswordField pswdCliente;
	private JButton btnEntrarAreaCliente;
	private JButton btnAltaCliente;

	public VLoginCliente() {
		super("Login cliente");
		initComponents();

		crearMenu();
	}

	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().setLayout(null);

		setSize(VPrincipal.ANCHO, VPrincipal.ALTO);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(VPrincipal.ANCHO, VPrincipal.ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

		JLabel lblAreaCliente = new JLabel("Área Cliente");
		lblAreaCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblAreaCliente.setBounds(165, 25, 239, 46);
		getContentPane().add(lblAreaCliente);

		JLabel lblUsuarioCliente = new JLabel("Usuario");
		lblUsuarioCliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblUsuarioCliente.setBounds(130, 82, 53, 14);
		getContentPane().add(lblUsuarioCliente);

		JLabel lblPswdCliente = new JLabel("Contraseña");
		lblPswdCliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblPswdCliente.setBounds(130, 114, 66, 14);
		getContentPane().add(lblPswdCliente);

		txtUsuarioCliente = new JTextField();
		txtUsuarioCliente.setBounds(204, 80, 139, 20);
		getContentPane().add(txtUsuarioCliente);
		txtUsuarioCliente.setColumns(10);

		pswdCliente = new JPasswordField();
		pswdCliente.setBounds(206, 112, 137, 20);
		getContentPane().add(pswdCliente);

		btnEntrarAreaCliente = new JButton(BTN_ENTRAR_VLOGIN_CLIENTE);
		btnEntrarAreaCliente.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnEntrarAreaCliente.setBounds(165, 152, 161, 23);
		getContentPane().add(btnEntrarAreaCliente);

		btnAltaCliente = new JButton(BTN_ALTA_NUEVO_CLIENTE);
		btnAltaCliente.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnAltaCliente.setBounds(165, 186, 161, 23);
		getContentPane().add(btnAltaCliente);
	}

	private void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmAtrasVLoginCliente = new JMenuItem(MNTM_ATRAS_VLOGIN_CLIENTE);
		menuBar.add(mntmAtrasVLoginCliente);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void setListener(AdjListener listener) {
		btnEntrarAreaCliente.addActionListener(listener);
		btnAltaCliente.addActionListener(listener);
		mntmAtrasVLoginCliente.addActionListener(listener);

	}

	public String getNombreCliente() {
		String nombreCliente = "";

		nombreCliente = txtUsuarioCliente.getText();

		if (nombreCliente.isEmpty()) {
			mostrarMsjInfo("Debe introducir un nombre de usuario");
		}
		return nombreCliente;
	}

	public String getContrasenaCliente() {
		String contrasenaCliente = "";

		contrasenaCliente = pswdCliente.getText();

		if (contrasenaCliente.isEmpty()) {
			mostrarMsjInfo("Debe introducir una contraseña");
		}
		return contrasenaCliente;
	}
	
	private void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);

	}

}
