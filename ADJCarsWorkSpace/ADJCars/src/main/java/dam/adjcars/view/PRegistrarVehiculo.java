package dam.adjcars.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import dam.adjcars.control.AdjListener;
import dam.adjcars.model.Vehiculo;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class PRegistrarVehiculo extends JPanel {
	private static final long serialVersionUID = 1L;

	// Constantes
	public static final String BTN_GUARDAR_REG = "Guardar datos";
	public static final String BTN_CANCELAR_REG = "Cancelar";
	public static final String BTN_LIMPIAR_REG = "Limpiar Datos";

	// Variables
	private JTextField txtMarcaVehiculoReg;
	private JTextField txtModeloVehiculoReg;
	private JComboBox<String> cmbTiposVehiculosReg;
	private JComboBox<String> cmbTipoMotorVehiculoReg;
	private JTextField txtColorVehiculoReg;
	private JTextField txtMatriculaVehiculoReg;
	private JTextField txtNumBastidorVehiculoReg;
	private JTextField txtFechaFabVehiculoReg;
	private JSpinner spnPotencia;
	private JButton btncancelarReg;
	private JButton btnLimpiarDatosReg;
	private JButton btnGuardarVehiculoReg;

	public PRegistrarVehiculo() {
		initComponents();
	}

	private void initComponents() {
		setSize(VEmpleado.ANCHO_VENTANA_PANELES - 30, VEmpleado.ALTO_VENTANA_PANELES - 70);
		setLayout(null);

		JLabel lblRegistroNuevoVehiculo = new JLabel("Registrar nuevo vehículo");
		lblRegistroNuevoVehiculo.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblRegistroNuevoVehiculo.setBounds(47, 23, 344, 65);
		add(lblRegistroNuevoVehiculo);

		JLabel lblMarcaVehiculoReg = new JLabel("Marca");
		lblMarcaVehiculoReg.setBounds(57, 93, 46, 14);
		add(lblMarcaVehiculoReg);

		JLabel lblModeloVehiculoReg = new JLabel("Modelo");
		lblModeloVehiculoReg.setBounds(247, 93, 46, 14);
		add(lblModeloVehiculoReg);

		JLabel lblTipoVehiculoReg = new JLabel("Tipo de vehículo");
		lblTipoVehiculoReg.setBounds(57, 141, 114, 14);
		add(lblTipoVehiculoReg);

		JLabel lblColorVehiculoReg = new JLabel("Color");
		lblColorVehiculoReg.setBounds(57, 191, 46, 14);
		add(lblColorVehiculoReg);

		JLabel lblMatriculaVehiculoReg = new JLabel("Matrícula");
		lblMatriculaVehiculoReg.setBounds(247, 191, 63, 14);
		add(lblMatriculaVehiculoReg);

		JLabel lblPotenciaVehiculoReg = new JLabel("Potencia");
		lblPotenciaVehiculoReg.setBounds(451, 93, 69, 14);
		add(lblPotenciaVehiculoReg);

		JLabel lblTipoMotorVehiculoReg = new JLabel("Tipo de motor");
		lblTipoMotorVehiculoReg.setBounds(331, 141, 102, 14);
		add(lblTipoMotorVehiculoReg);

		JLabel lblNumBastidorVehiculoReg = new JLabel("Num. bastidor");
		lblNumBastidorVehiculoReg.setBounds(57, 245, 93, 14);
		add(lblNumBastidorVehiculoReg);

		JLabel lblFechaFabVehiculoReg = new JLabel("Fecha de fabricación");
		lblFechaFabVehiculoReg.setBounds(317, 245, 138, 14);
		add(lblFechaFabVehiculoReg);

		txtMarcaVehiculoReg = new JTextField();
		txtMarcaVehiculoReg.setBounds(99, 90, 138, 20);
		add(txtMarcaVehiculoReg);
		txtMarcaVehiculoReg.setColumns(10);

		txtModeloVehiculoReg = new JTextField();
		txtModeloVehiculoReg.setBounds(293, 90, 138, 20);
		add(txtModeloVehiculoReg);
		txtModeloVehiculoReg.setColumns(10);

		cmbTiposVehiculosReg = new JComboBox<String>();
		cmbTiposVehiculosReg
				.setModel(new DefaultComboBoxModel(new String[] { "- ELEGIR -", "BERLINA", "COMPACTO", "DEPORTIVO",
						"FAMILIAR", "FAMILIAR DEPORTIVO", "HATCHBACK", "HATCHBACK DEPORTIVO", "SUV", "TODOTERRENO" }));
		cmbTiposVehiculosReg.setBounds(172, 137, 138, 22);
		add(cmbTiposVehiculosReg);

		cmbTipoMotorVehiculoReg = new JComboBox<String>();
		cmbTipoMotorVehiculoReg.setModel(
				new DefaultComboBoxModel(new String[] { "- ELEGIR -", "ECOBOOST TDI", "TDI", "TFSI", "TGI", "TSI" }));
		cmbTipoMotorVehiculoReg.setBounds(439, 137, 139, 22);
		add(cmbTipoMotorVehiculoReg);

		spnPotencia = new JSpinner();
		spnPotencia.setModel(new SpinnerNumberModel(65, 0, 720, 1));
		spnPotencia.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		spnPotencia.setBounds(527, 89, 71, 20);
		add(spnPotencia);

		txtColorVehiculoReg = new JTextField();
		txtColorVehiculoReg.setBounds(99, 188, 130, 20);
		add(txtColorVehiculoReg);
		txtColorVehiculoReg.setColumns(10);

		txtMatriculaVehiculoReg = new JTextField();
		txtMatriculaVehiculoReg.setBounds(317, 188, 114, 20);
		add(txtMatriculaVehiculoReg);
		txtMatriculaVehiculoReg.setColumns(10);

		txtNumBastidorVehiculoReg = new JTextField();
		txtNumBastidorVehiculoReg.setBounds(155, 245, 130, 20);
		add(txtNumBastidorVehiculoReg);
		txtNumBastidorVehiculoReg.setColumns(10);

		txtFechaFabVehiculoReg = new JTextField();
		txtFechaFabVehiculoReg.setBounds(460, 243, 138, 20);
		add(txtFechaFabVehiculoReg);
		txtFechaFabVehiculoReg.setColumns(10);

		btnGuardarVehiculoReg = new JButton(BTN_GUARDAR_REG);
		btnGuardarVehiculoReg.setBounds(180, 297, 170, 23);
		add(btnGuardarVehiculoReg);

		btncancelarReg = new JButton(BTN_CANCELAR_REG);
		btncancelarReg.setBounds(497, 373, 130, 23);
		add(btncancelarReg);

		btnLimpiarDatosReg = new JButton(BTN_LIMPIAR_REG);
		btnLimpiarDatosReg.setBounds(401, 297, 160, 23);
		add(btnLimpiarDatosReg);
	}

	public void setVisibleBtnLimpiar(boolean b) {
		btnLimpiarDatosReg.setVisible(b);
	}

	public void setListener(AdjListener listener) {
		btnGuardarVehiculoReg.addActionListener(listener);
		btnLimpiarDatosReg.addActionListener(listener);
		btncancelarReg.addActionListener(listener);
	}

	public Vehiculo getDatos() {
		Vehiculo vehReg = null;

		String marca = txtMarcaVehiculoReg.getText().trim();

		if (marca.isEmpty()) {
			mostrarMsjError("Debe introducir la marca");
		} else {
			String modelo = txtModeloVehiculoReg.getText().trim();

			int potencia = (int) spnPotencia.getValue();

			if (potencia == 0) {
				mostrarMsjError("Debe introducir la potencia");
			} else {
				String tipoVeh = (String) cmbTiposVehiculosReg.getSelectedItem();

				String tipoMotor = (String) cmbTipoMotorVehiculoReg.getSelectedItem();

				String color = txtColorVehiculoReg.getText().trim();

				String matricula = txtMatriculaVehiculoReg.getText().trim();

				if (matricula.isEmpty()) {
					mostrarMsjError("Debe introducir la matrícula");
				} else {
					String numBast = txtNumBastidorVehiculoReg.getText().trim();

					if (numBast.isEmpty()) {
						mostrarMsjError("Debe introducir el número del bastidor");
					} else {
						String fecha_Fab = txtFechaFabVehiculoReg.getText().trim();
						if (fecha_Fab.isEmpty()) {
							mostrarMsjError("Debe introducir fecha de fabricación");
						} else {
							vehReg = new Vehiculo(marca, modelo, potencia, tipoVeh, tipoMotor, color, matricula,
									numBast, fecha_Fab);
						}
					}

				}
			}
		}

		return vehReg;
	}

	public void mostrarMsjError(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Error", JOptionPane.ERROR_MESSAGE);

	}

	public void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Información de operación", JOptionPane.INFORMATION_MESSAGE);

	}

	public void limpiarComponentes() {
		txtMarcaVehiculoReg.setText("");
		txtModeloVehiculoReg.setText("");
		cmbTipoMotorVehiculoReg.setSelectedIndex(0);
		cmbTiposVehiculosReg.setSelectedIndex(0);
		txtColorVehiculoReg.setText("");
		txtMatriculaVehiculoReg.setText("");
		txtNumBastidorVehiculoReg.setText("");
		txtFechaFabVehiculoReg.setText("");
		spnPotencia.setValue(65);

	}

}
