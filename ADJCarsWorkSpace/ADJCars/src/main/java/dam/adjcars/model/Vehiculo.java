package dam.adjcars.model;

public class Vehiculo {
	
	private int idVehiculo;
	private String matricula;
	private String numBastidor;
	private String marca;
	private String modelo;
	private String tipoMotor;
	private String fechaFab;
	private String tipoVehiculo;
	private String color;
	private int potencia;
	private int pvp;
	
	public Vehiculo(int idVehiculo, String matricula, String numBastidor, String marca, String modelo, String tipoMotor,
			String fechaFab, String tipoVehiculo, String color, int potencia, int pvp) {
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
		this.numBastidor = numBastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoMotor = tipoMotor;
		this.fechaFab = fechaFab;
		this.tipoVehiculo = tipoVehiculo;
		this.color = color;
		this.potencia = potencia;
		this.pvp = pvp;
	}
	
	public Vehiculo(String marca, String modelo, int potencia, String tipoVeh, String tipoMotor, String color,
			String matricula, String numBastidor, String fecha_fab) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.tipoVehiculo = tipoVeh;
		this.tipoMotor = tipoMotor;
		this.color = color;
		this.matricula = matricula;
		this.numBastidor = numBastidor;
		this.fechaFab = fecha_fab;
	}
	
	public Vehiculo(int potencia, String tipoMotor, String color, String matricula) {
		this.potencia = potencia;
		this.tipoMotor = tipoMotor;
		this.color = color;
		this.matricula = matricula;
	}
	
	public Vehiculo(int potencia, String tipoMotor, String color) {
		this.potencia = potencia;
		this.tipoMotor = tipoMotor;
		this.color = color;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public String getFechaFab() {
		return fechaFab;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public String getColor() {
		return color;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getPvp() {
		return pvp;
	}
	
	
	
}
