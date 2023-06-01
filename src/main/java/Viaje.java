public class Viaje {
	private String origen;
	private String destino;
	private String horaSalida;
	private String  horaLlegada;

	public Viaje() {
		this.origen = null;
		this.destino = null;
		this.horaSalida = null;
		this.horaLlegada = null;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
}