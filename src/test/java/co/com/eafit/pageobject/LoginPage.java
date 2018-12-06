package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://colorlib.com/polygon/metis/login.html")
public class LoginPage extends PageObject {

	@FindBy( xpath = "//*[@id=\"login\"]/form/input[1]" )
	public WebElementFacade txtUsuario;
	
	
	@FindBy( xpath = "//*[@id=\"login\"]/form/input[2]" )
	public WebElementFacade txtPassword;
	
	@FindBy( xpath = "//*[@id=\"login\"]/form/button" )
	public WebElementFacade btnSignIn;
	
	@FindBy( id = "bootstrap-admin-template" )
	public WebElementFacade lblTitulo;

	
	public void realizarLogin(String user, String pass) {
		// TODO Auto-generated method stub
		txtUsuario.sendKeys(user);
		txtPassword.sendKeys(pass);
		btnSignIn.click();
		
	}

	public void accesoExitoso(String tituloPagina) {

		String strMensaje =  lblTitulo.getText();
		assertThat( strMensaje, containsString( tituloPagina )  );
	}
	
}
