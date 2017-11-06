package persona;

import org.openxava.model.Identifiable;

public class Persona extends Identifiable {

	private String nombreYApellido;

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

}
