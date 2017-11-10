package persona.control;

import org.openxava.actions.NewAction;

public class CrearNuevoTutor extends NewAction {

	public void execute() throws Exception {
		getView().setViewName("Completa");
		super.execute();

	}

}
