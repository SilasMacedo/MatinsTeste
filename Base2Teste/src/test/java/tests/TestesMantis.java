package tests;

import java.io.IOException;
import java.time.Duration;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;
import runner.Executa;


public class TestesMantis {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que esteja na pagina")
	public void queEstejaNaPagina() {
	    Executa.abrirNavegador();
	}
	@Given("Preencher o User name")
	public void preencherOUserName() {
	    met.escrever(el.getUserName(), "Silas_Macedo");
	}
	@Given("Clicar em EntrarName")
	public void clicarEmEntrarName() {
	    met.clicar(el.getEntrarNome());
	}
	@When("Preencher a senha")
	public void preencherASenha() {
	    met.escrever(el.getSenha(), "Qa123");
	}
	@When("Clicar em EntrarSenha")
	public void clicarEmEntrarSenha() {
		 met.clicar(el.getEntrarSenha());
		 met.aguardarElemento(Duration.ofSeconds(7), el.getCriarTarefa());
	}
	@Then("Acessar a pagina secreta")
	public void acessarAPaginaSecreta() throws IOException {
		met.screenShot("loginSucesso");
		met.fecharNavegador();
	}


}