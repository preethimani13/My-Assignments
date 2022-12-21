package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.ParentClass;

public class LoginPage extends ParentClass{
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;

	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		return this;
	}
	
	public HomePage loginClick() {
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver);
	}
	
}
