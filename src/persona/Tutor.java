package persona;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.openxava.annotations.View;
import org.openxava.annotations.Views;

@Entity
@Views({ @View(name = "Completa", members = "dni;cuil;direccion;nombreYApellido;foto"),
		@View(name = "Simple", members = "dni;nombreYApellido") })
public class Tutor extends Persona {

	@OneToMany
	private List<Alumno> alumnos;

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
