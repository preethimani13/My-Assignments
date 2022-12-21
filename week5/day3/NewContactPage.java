package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.ParentClass;

public class NewContactPage extends ParentClass{
	
	public NewContactPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public NewContactPage inputSalutation() {
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		
		driver.findElement(By.xpath("//span[@title='Mrs.']")).click();
		
		return this;
	}

	public NewContactPage inputFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Prathik");
		return this;
	}

	public NewContactPage inputLastName() {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raj");
		return this;
	}

	public NewContactPage inputPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='MobilePhone']")).sendKeys("9876541236");
		return this;
	}

	public NewContactPage inputEmail() {
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abccdd@gmail.com");
		return this;
	}

	public VerifyContactPage save() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		return new VerifyContactPage(driver);
}
}
