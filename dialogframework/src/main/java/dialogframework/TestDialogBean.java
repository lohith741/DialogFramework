package dialogframework;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
public class TestDialogBean {
	public void viewDialog() {
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("contentWidth", "auto");

		PrimeFaces.current().dialog().openDynamic("dialog", options, null);

	}
	public void showGrowl() {
		FacesMessage msg = new FacesMessage("Successful", "growl working ");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	public void close() {
		PrimeFaces.current().dialog().closeDynamic(null);
	}
	
	public void message() {
//		RequestContext context = RequestContext.getCurrentInstance();
//        context.closeDialog(null);
		PrimeFaces.current().dialog().closeDynamic(null);
		FacesMessage msg = new FacesMessage("Successful", "growl working ");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}
}
