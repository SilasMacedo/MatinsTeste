package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By userName = By.id("username");
	private By entrarNome = By.xpath("//input[contains(@type,'submit')]");
	private By senha = By.id("password");
	private By entrarSenha = By.xpath("//input[contains(@type,'submit')]");	
	private By criarTarefa = By.xpath("//i[contains(@class,'menu-icon fa fa-edit')]");

	
	
	public By getUserName() {
		return userName;
	}
	public void setUserName(By userName) {
		this.userName = userName;
	}
	public By getEntrarNome() {
		return entrarNome;
	}
	public void setEntrarNome(By entrarNome) {
		this.entrarNome = entrarNome;
	}
	public By getSenha() {
		return senha;
	}
	public void setSenha(By senha) {
		this.senha = senha;
	}
	public By getEntrarSenha() {
		return entrarSenha;
	}
	public void setEntrarSenha(By entrarSenha) {
		this.entrarSenha = entrarSenha;
	}
	public By getCriarTarefa() {
		return criarTarefa;
	}
	public void setCriarTarefa(By criarTarefa) {
		this.criarTarefa = criarTarefa;
	}
	
	
}
