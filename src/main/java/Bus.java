public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Conductor conductor;

	private Viaje viaje;

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public Bus() {
		this.patente = null;
		this.marca = null;
		this.modelo = null;
		this.conductor = null;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
}