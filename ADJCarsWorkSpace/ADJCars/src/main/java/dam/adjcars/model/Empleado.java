package dam.adjcars.model;

public class Empleado {
	private String passwordEmpleado;
	private String nombre;
	private String direccion;
	private String telefono;
	private String cargo;

	public Empleado() {
	}

	public Empleado(String passwordEmpleado, String nombre) {
		this.passwordEmpleado = passwordEmpleado;
		this.nombre = nombre;
	}

	public Empleado(String passwordEmpleado, String nombre, String direccion, String telefono, String cargo) {
		this.passwordEmpleado = passwordEmpleado;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cargo = cargo;
	}

	public String getPasswordEmpleado() {
		return passwordEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCargo() {
		return cargo;
	}

}
