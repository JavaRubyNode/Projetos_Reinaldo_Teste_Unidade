package br.com.delta.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTeste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//reinaldosouzajunior//Documents//Faculdades//Delta//2016-02//Teste de Software//Selenium//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com.br/");
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("Faculdade Delta");
		campoDeTexto.submit();
	}

}
