package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.AbrirNavegador;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "tests",
		tags = "@iniciarTeste", 
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "json:target/report.json"},
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
		)

public class Executa extends AbrirNavegador {
	
	/**
	 * Metodo para abrir navegador chrome
	 * @param url
	 */
	public static void abrirNavegador () {
		
		String url = "https://mantis-prova.base2.com.br/";
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			System.out.println("------------Iniciando teste-------------");

		} catch (Exception e) {
			System.out.println("========== Erro ao abrir navegador ===========" + e.getMessage());
			System.out.println("========= Causa do erro =========" + e.getCause());
		}

	}
				
}
	
	
