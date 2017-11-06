package componente;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.openxava.model.Identifiable;

@Entity
public class Modelo extends Identifiable {

	@ManyToOne
	private Marca marca;

	private String descripcion;

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
