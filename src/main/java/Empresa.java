import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {
	private String rut;
	private String direccion;
	private String redesSociales;
	private ArrayList<Bus> buses;

	public Empresa() {
		this.rut = null;
		this.direccion = null;
		this.redesSociales = null;
		this.buses = null;
	}

	public void agregarBuses() {
		Bus b = new Bus();
		b.setPatente("jdsf343");
		b.setMarca("AUDI");
		b.setModelo("Nuevo");
		b.setConductor(agregarConductor("Jose","Matus",12345678,"A5"));

		this.buses.add(b);

	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public void setBuses(ArrayList<Bus> buses) {
		this.buses = buses;
	}

	public void busesMismoDestino() {
	}

	public void descontinuarBus(String p) {
	}

	public Conductor agregarConductor(String nombre, String apellido, int num, String lice) {
		Conductor c1 = new Conductor();
		c1.setNombre(nombre);
		c1.setApellido(apellido);
		c1.setTelefono(num);
		c1.setTipolicencia(lice);

		return c1;
	}

	public void asociarViaje() {
		String origen = "Temuco";
		String destino = "Santiago";
		String horaSalida = "12:00";
		String horaLlegada = "13:00";
		Viaje v = crearViaje(origen,destino,horaSalida,horaLlegada);

		for (int i = 0; i < this.buses.size(); i++) {
			System.out.println("A que bus quiere asociar este viaje: ");
			System.out.println((1 + i) + "- " + this.buses.get(i).toString());

		}
		int opcion = validarOpcion(this.buses.size());
		this.buses.get(opcion-1).setViaje(v);
	}

	private int validarOpcion(int n) {
			boolean error;
			int u = 0;
			do {
				try {
					error = false;
					Scanner sc = new Scanner(System.in);
					System.out.println("Ingrese un numero: ");
					u = sc.nextInt();
					if (u < 1 || u > n){
						System.err.println("Error, intente de nuevo");
						error = true;
					}
				}catch (InputMismatchException e){
					System.err.println("Error, intente de nuevo");
					error = true;
				}
			}while (error);
			return u;

		}


	private Viaje crearViaje(String origen, String destino, String horaSalida, String horaLlegada) {
		return null;
	}
}