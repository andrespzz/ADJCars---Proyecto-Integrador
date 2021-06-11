package dam.adjcars.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PApartadoContacto extends JPanel {
	public PApartadoContacto() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		setSize(VEmpleado.ANCHO_VENTANA_PANELES - 30, VEmpleado.ALTO_VENTANA_PANELES - 70);
		
		JLabel lblNewLabel = new JLabel("APARTADO DE CONTACTO");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(48, 29, 294, 62);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Web: www.ADJCars.es");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(58, 119, 224, 17);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono: +34 653 679 321");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(58, 165, 184, 33);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Instagram: @ADJCars");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(58, 218, 199, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion: Calle Navacerrada, 7, Alcobendas, Madrid");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(57, 269, 342, 33);
		add(lblNewLabel_4);
	}
}
