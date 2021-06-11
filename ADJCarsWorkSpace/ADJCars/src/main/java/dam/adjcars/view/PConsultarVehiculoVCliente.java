package dam.adjcars.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dam.adjcars.control.AdjListener;
import dam.adjcars.model.Vehiculo;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PConsultarVehiculoVCliente extends JPanel {
	public static final String CLM_ID_VEHICULO = "ID";;
	public static final String CLM_MATRICULA_VEHICULO = "MATRÍCULA"; 
	public static final String CLM_NUM_BAST_VEHICULO = "NUM. BASTIDOR";
	public static final String CLM_MARCA_VEHICULO = "MARCA";
	public static final String CLM_MODELO_VEHICULO = "MODELO";
	public static final String CLM_MODELO_TIPO_MOTOR_VEHICULO = "TIPO MOTOR";
	public static final String CLM_MODELO_FECHA_FAB_VEHICULO = "FECHA FAB";
	public static final String CLM_MODELO_TIPO_VEHICULO = "TIPO VEHÍCULO";
	public static final String CLM_MODELO_COLOR_VEHICULO = "COLOR";
	public static final String CLM_MODELO_POTENCIA_VEHICULO = "POTENCIA";
	public static final String CLM_MODELO_PRECIO_VEHICULO = "PVP";
	public static final String BTN_CONSULTAR_VEHICULO_CLIENTE = "Consultar catálogo";
	public static final String OPT_TODAS = "TODAS";
	
	private JScrollPane scrpListaVehiculosCliente;
	private JTable tblVehiculosConsultaCliente;
	private DefaultTableModel tblModel;
	private JButton btnConsultarVehiculoCliente;
	private JComboBox cmbColorPconsultaCliente;
	private JComboBox cmbMarcaPconsultaCliente;
	private DefaultComboBoxModel<String> cmbModelMarca;
	private DefaultComboBoxModel<String> cmbModelColor;
	
	public PConsultarVehiculoVCliente() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		setSize(VEmpleado.ANCHO_VENTANA_PANELES - 30, VEmpleado.ALTO_VENTANA_PANELES - 70);
		
		
		JLabel lblNewLabel = new JLabel("Consultar vehículo");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblNewLabel.setBounds(47, 22, 344, 65);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		lblNewLabel_1.setBounds(47, 102, 61, 14);
		add(lblNewLabel_1);
		
		scrpListaVehiculosCliente = new JScrollPane();
		scrpListaVehiculosCliente.setBounds(47, 137, 808, 235);
		add(scrpListaVehiculosCliente);
		
		tblVehiculosConsultaCliente = new JTable();
		scrpListaVehiculosCliente.setViewportView(tblVehiculosConsultaCliente);
		
		btnConsultarVehiculoCliente = new JButton(BTN_CONSULTAR_VEHICULO_CLIENTE); 
		btnConsultarVehiculoCliente.setBounds(693, 98, 162, 23);
		add(btnConsultarVehiculoCliente);
		
		JLabel lblNewLabel_2 = new JLabel("Color");
		lblNewLabel_2.setBounds(265, 102, 46, 14);
		add(lblNewLabel_2);
		
		cmbColorPconsultaCliente = new JComboBox();
		cmbModelColor = new DefaultComboBoxModel<String>();
		cmbColorPconsultaCliente.setModel(cmbModelColor);
		
		cmbColorPconsultaCliente.setBounds(305, 98, 115, 22);
		add(cmbColorPconsultaCliente);
		
		cmbMarcaPconsultaCliente = new JComboBox();
		cmbModelMarca = new DefaultComboBoxModel<String>();
		cmbMarcaPconsultaCliente.setModel(cmbModelMarca);
		
		cmbMarcaPconsultaCliente.setBounds(93, 98, 115, 22);
		add(cmbMarcaPconsultaCliente);
		
		configurarTabla();
	}

	private void configurarTabla() {
		tblModel = new DefaultTableModel() {
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tblModel.addColumn(CLM_ID_VEHICULO);
		tblModel.addColumn(CLM_MATRICULA_VEHICULO);
		tblModel.addColumn(CLM_NUM_BAST_VEHICULO);
		tblModel.addColumn(CLM_MARCA_VEHICULO);
		tblModel.addColumn(CLM_MODELO_VEHICULO);
		tblModel.addColumn(CLM_MODELO_TIPO_MOTOR_VEHICULO);
		tblModel.addColumn(CLM_MODELO_FECHA_FAB_VEHICULO);
		tblModel.addColumn(CLM_MODELO_TIPO_VEHICULO);
		tblModel.addColumn(CLM_MODELO_COLOR_VEHICULO);
		tblModel.addColumn(CLM_MODELO_POTENCIA_VEHICULO);
		tblModel.addColumn(CLM_MODELO_PRECIO_VEHICULO);
		
		tblVehiculosConsultaCliente.setModel(tblModel);
		
		tblVehiculosConsultaCliente.getColumn(CLM_ID_VEHICULO).setPreferredWidth(30);
		tblVehiculosConsultaCliente.getColumn(CLM_MATRICULA_VEHICULO).setPreferredWidth(75);
		tblVehiculosConsultaCliente.getColumn(CLM_NUM_BAST_VEHICULO).setPreferredWidth(100);
		tblVehiculosConsultaCliente.getColumn(CLM_MARCA_VEHICULO).setPreferredWidth(100);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_VEHICULO).setPreferredWidth(100);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_TIPO_MOTOR_VEHICULO).setPreferredWidth(90);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_FECHA_FAB_VEHICULO).setPreferredWidth(75);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_TIPO_VEHICULO).setPreferredWidth(100);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_COLOR_VEHICULO).setPreferredWidth(75);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_POTENCIA_VEHICULO).setPreferredWidth(50);
		tblVehiculosConsultaCliente.getColumn(CLM_MODELO_PRECIO_VEHICULO).setPreferredWidth(75);
	
	}
	
	public void cargarTabla(ArrayList<Vehiculo> listaVehiculos) {
		tblModel.setRowCount(0);
		Object[] fila = new Object[11];
		
		for (Vehiculo vehiculo : listaVehiculos) {
			fila[0] = vehiculo.getIdVehiculo();
			fila[1] = vehiculo.getMatricula();
			fila[2] = vehiculo.getNumBastidor();
			fila[3] = vehiculo.getMarca();
			fila[4] = vehiculo.getModelo();
			fila[5] = vehiculo.getTipoMotor();
			fila[6] = vehiculo.getFechaFab();
			fila[7] = vehiculo.getTipoVehiculo();
			fila[8] = vehiculo.getColor();
			fila[9] = vehiculo.getPotencia();
			fila[10] = vehiculo.getPvp();
			
			tblModel.addRow(fila);
		}
	}
	
	public void setListener (AdjListener listener) {
		btnConsultarVehiculoCliente.addActionListener(listener);
	}
	
	public String getMarcaFiltro() {
		return (String) cmbModelMarca.getSelectedItem();
	}
	
	public void setMarca(ArrayList<String> listaMarcas) {
		cmbModelMarca.removeAllElements();
		cmbModelMarca.addElement(OPT_TODAS);
		for (String marca : listaMarcas) {
			cmbModelMarca.addElement(marca);
		}
	}
	
	public String getColorFiltro() {
		return (String) cmbModelColor.getSelectedItem();
	}
	
	public void setColor(ArrayList<String> listaColores) {
		cmbModelColor.removeAllElements();
		cmbModelColor.addElement(OPT_TODAS);
		for (String marca : listaColores) {
			cmbModelColor.addElement(marca);
		}
	}
	
}
