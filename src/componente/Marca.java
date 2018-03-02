package componente;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

@Entity
@Views({ @View(name = "MuySimple", members = "descripcion") })
public class Marca extends Identifiable {

	private String descripcion;

	@OneToMany(mappedBy = "marca")
	private List<Modelo> modelos;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

}
