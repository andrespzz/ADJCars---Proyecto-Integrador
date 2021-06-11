package dam.adjcars.model;

public class Cliente {
	private String passwordCliente;
	private String nombreCliente;
	private String email;
	private String telefonoCliente;
	private String fechaAlta;

	public Cliente() {
	}

	public Cliente(String passwordCliente, String nombreCliente) {
		this.passwordCliente = passwordCliente;
		this.nombreCliente = nombreCliente;
	}

	public Cliente(String passwordCliente, String nombreCliente, String email, String telefonoCliente, String fechaAlta) {
		this.passwordCliente = passwordCliente;
		this.nombreCliente = nombreCliente;
		this.telefonoCliente = telefonoCliente;
		this.email = email;
		this.fechaAlta = fechaAlta;
	}

	public String getPasswordCliente() {
		return passwordCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}
	
	

}
