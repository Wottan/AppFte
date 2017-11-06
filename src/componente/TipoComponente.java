package componente;

import javax.persistence.Entity;

import org.openxava.model.Identifiable;

@Entity
public class TipoComponente extends Identifiable {

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
