package co.com.eafit.definitions;

import co.com.eafit.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

	@Steps
	LoginStep loginStep;
	
	@Given("^que Yeison quiere acceder a Metis$")
	public void queYeisonQuiereAccederAMetis() throws Exception {
		
		loginStep.abrirPagina();
		
	}


	@When("^en escribe el usuario (.*) y la clave (.*)$")
	public void enEscribeElUsuarioDemo(  String user, String pass ) throws Exception {
		loginStep.ingresarCredenciales( user, pass);
	}

	@Then("^el ve el mensaje de (.*)$")
	public void elVeElMensajeDeBootstrapAdminTemplate(String tituloPagina) throws Exception {
		loginStep.verificarTitulo(tituloPagina);
	}

	
	
}
