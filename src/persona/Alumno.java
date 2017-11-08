package persona;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Alumno extends Persona {

	@ManyToMany
	private List<Tutor> tutores;

	public List<Tutor> getTutores() {
		return tutores;
	}

	public void setTutores(List<Tutor> tutores) {
		this.tutores = tutores;
	}

}
