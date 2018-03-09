package asignacion;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import componente.*;
import persona.*;

@Entity
public class Asignacion extends Identifiable {

	// @ManyToOne
	@Transient
	private Persona persona;

	@ManyToOne
	@ReferenceView("Simple")
	private Componente componente;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

}
