package persona;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.openxava.annotations.ReferenceView;
import org.openxava.annotations.Tab;
import org.openxava.annotations.Tabs;
import org.openxava.annotations.View;
import org.openxava.annotations.Views;

@Entity
@Tabs({ @Tab(properties = "dni,cuil,nombreYApellido,foto,tutor.dni,tutor.nombreYApellido") })
@Views({ @View(members = "Alumno[dni;cuil;nombreYApellido;direccion;foto];tutor") })
public class Alumno extends Persona {

	@ManyToOne
	@ReferenceView(value = "Simple")
	private Tutor tutor;

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

}
