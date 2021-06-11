package dam.adjcars.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;

import dam.adjcars.control.AdjListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VLoginEmpleado extends JFrame {
	public static final String MNTM_ATRAS_VLOGIN_EMPLEADO = "Volver a inicio";
	public static final String BTN_ENTRAR_VLOGIN_EMPLEADO = "Entrar área empleado";

	private JMenuItem mntmAtrasVLoginEmpleado;
	private JTextField txtUsuarioEmpleado;
	private JPasswordField pswdEmpleado;
	private JButton btnEntrarAreaEmpleado;

	public VLoginEmpleado() {
		super("Login empleado");
		initComponents();

		crearMenu();
	}

	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(VPrincipal.ANCHO, VPrincipal.ALTO);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(VPrincipal.ANCHO, VPrincipal.ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

		getContentPane().setLayout(null);

		Label lblAreaEmpleado = new Label("Área Empleado");
		lblAreaEmpleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblAreaEmpleado.setBounds(138, 41, 260, 50);
		getContentPane().add(lblAreaEmpleado);

		Label lblUsuarioEmpleado = new Label("Usuario");
		lblUsuarioEmpleado.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblUsuarioEmpleado.setBounds(115, 97, 60, 21);
		getContentPane().add(lblUsuarioEmpleado);

		txtUsuarioEmpleado = new JTextField();
		txtUsuarioEmpleado.setBounds(207, 99, 160, 20);
		getContentPane().add(txtUsuarioEmpleado);
		txtUsuarioEmpleado.setColumns(10);

		Label lblPswdEmpleado = new Label("Contraseña");
		lblPswdEmpleado.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblPswdEmpleado.setBounds(115, 129, 90, 21);
		getContentPane().add(lblPswdEmpleado);

		pswdEmpleado = new JPasswordField();
		pswdEmpleado.setBounds(207, 130, 160, 20);
		getContentPane().add(pswdEmpleado);

		btnEntrarAreaEmpleado = new JButton(BTN_ENTRAR_VLOGIN_EMPLEADO);
		btnEntrarAreaEmpleado.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnEntrarAreaEmpleado.setBounds(154, 175, 165, 23);
		getContentPane().add(btnEntrarAreaEmpleado);
	}

	private void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmAtrasVLoginEmpleado = new JMenuItem(MNTM_ATRAS_VLOGIN_EMPLEADO);
		menuBar.add(mntmAtrasVLoginEmpleado);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void setListener(AdjListener listener) {
		btnEntrarAreaEmpleado.addActionListener(listener);
		mntmAtrasVLoginEmpleado.addActionListener(listener);

	}

	public String getNombreEmpleado() {
		String nombreEmpleado = "";
		
		nombreEmpleado = txtUsuarioEmpleado.getText();
		
		if (nombreEmpleado.isEmpty()) {
			mostrarMsjInfo("Debe introducir un nombre de usuario");
		}
		return nombreEmpleado;
	}

	public String getContrasenaEmpleado() {
		String contrasenaEmpleado = "";
		
		contrasenaEmpleado = pswdEmpleado.getText();
		
		if (contrasenaEmpleado.isEmpty()) {
			mostrarMsjInfo("Debe introducir una contraseña");
		}
		return contrasenaEmpleado;
	}

	private void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public void mostrarMsjError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error de operación", JOptionPane.ERROR_MESSAGE);
		
	}
}
