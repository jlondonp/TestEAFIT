package co.com.eafit.steps;

import co.com.eafit.pageobject.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

	LoginPage loginPage;
	
	//los pasos deben hacer referncia a los objetos que creo dentro de mi clase pageobject.
	@Step
	public void abrirPagina() {
		loginPage.open();
		
	}
	
	@Step
	public void ingresarCredenciales( String user, String pass ) {
		loginPage.realizarLogin(user, pass);
		
		
	}

	
	@Step
	public void verificarTitulo(String tituloPagina) {
		loginPage.accesoExitoso( tituloPagina);
		
	}
	
	

}
