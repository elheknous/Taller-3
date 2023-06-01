public class Conductor {
	private String nombre;
	private String apellido;
	private int telefono;
	private String tipolicencia;


	public Conductor() {
		this.nombre = null;
		this.apellido = null;
		this.telefono = 0;
		this.tipolicencia = null;
	}

	public Conductor(String nombre, String apellido, int telefono, String tipolicencia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.tipolicencia = tipolicencia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setTipolicencia(String tipolicencia) {
		this.tipolicencia = tipolicencia;
	}

	@Override
	public String toString() {
		return "Conductor{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", telefono=" + telefono +
				", tipolicencia='" + tipolicencia + '\'' +
				'}';
	}
}