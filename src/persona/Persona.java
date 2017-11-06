package persona;

import javax.persistence.MappedSuperclass;

import org.openxava.model.Identifiable;

@MappedSuperclass
public class Persona extends Identifiable {

	private String nombreYApellido;

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

}
