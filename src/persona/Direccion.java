package persona;

import javax.persistence.Embeddable;

@Embeddable
public class Direccion {

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
