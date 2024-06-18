package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends AbrirNavegador {

	/**
	 * Metodo para escrever
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("========== Erro ao digitar ============" + e.getCause());
		}
	}

	/**
	 * Metodo para clicar no elemento
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******** Erro ao clicar ********" + e.getCause());
		}
	}
	
	/**
	 * Metodo para esperar elemento
	 * @param t
	 * @param elemento
	 */
	public void aguardarElemento(Duration t, By elemento) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, t);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		}catch (Exception e) {
			System.err.println("----------erro ao pausar ----------" + e.getMessage());
			System.out.println("----------causa do erro -----------" + e.getCause());
		}
	}

	/**
	 *metodo printscreen
	 * @param nome
	 * @throws IOException
	 */
	
	public void screenShot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE); 
		File destFile = new File ("./src/evidencias/"+nome+".png"); 
		FileUtils.copyFile(srcFile, destFile);
	}
	
	/**
	 * Metodo para fechar navegador
	 */
	public void fecharNavegador() {
		driver.close();
	}
}
	
