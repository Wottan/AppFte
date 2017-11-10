package persona.control;

import java.util.Map;

import org.openxava.actions.SearchByViewKeyAction;
import org.openxava.model.MapFacade;

public class ModificarTutor extends SearchByViewKeyAction {

	public void execute() throws Exception {
		super.execute();
		Map keys = getKeyValuesFromView();
		Map values = MapFacade.getValues(getModelName(), keys, getMemberNames());
		getView().setViewName("Completa");
		getView().setKeyEditable(false);
		setValuesToView(values);

	}
}
