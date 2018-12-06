package co.com.eafit.pageobject;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class ContactenosPage extends PageObject {

	
	@FindBy( id = "Field1" )
	public WebElementFacade txtNombre;

	@FindBy( id = "Field3" )
	public WebElementFacade txtEmail;
	
	@FindBy( id = "Field4" )
	public WebElementFacade txtTelefono;
	
	@FindBy( id = "Field5" )
	public WebElementFacade txtCiudad;

	@FindBy( id = "Field6" )
	public WebElementFacade txtComentario;
	
	@FindBy( id = "saveForm" )
	public WebElementFacade btnEnviar;

	
	public void nuevoComentario(DataTable dtDatos) {
		
		if ( dtDatos instanceof DataTable ) {
			List< List<String > > data = dtDatos.raw();
			getDriver().switchTo().frame(0);
			
			txtNombre.sendKeys( data.get(1).get(0) );
			txtEmail.sendKeys( data.get(1).get(1) );
			txtTelefono.sendKeys( data.get(1).get(2) );
			txtCiudad.sendKeys( data.get(1).get(3) );
			txtComentario.sendKeys( data.get(1).get(4) );
			btnEnviar.click();
			
		}
		
		
	}


	public void comentarioEnviado(String mensaje) {
		//colocar lo mismo como se hizo con LoginPage
	}

}
