package br.com.delta.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTesteLogin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//reinaldosouzajunior//Documents//Faculdades//Delta//2016-02//Teste de Software//Selenium//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/reinaldosouzajunior/Documents/Faculdades/Delta/2016-02/Teste%20de%20Software/Selenium/simple_login.html");
		WebElement campoUser = driver.findElement(By.name("user"));
		campoUser.sendKeys("rsjr");
		WebElement campoPassword = driver.findElement(By.name("password"));
		campoPassword.sendKeys("123456");		
	}	

}
