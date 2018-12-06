package co.com.eafit.steps;

import co.com.eafit.pageobject.ContactenosPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ContactenosEafitSteps {

	ContactenosPage contactenosPage;

	@Step
	public void abrirPagina() {
		contactenosPage.open();
		
	}
	
	@Step
	public void diligenciarComentario(DataTable dtDatos) {
		contactenosPage.nuevoComentario ( dtDatos );
	}

	@Step
	public void comentarioExitoso(String mensaje) {
		contactenosPage.comentarioEnviado(mensaje);
	}
	
}
