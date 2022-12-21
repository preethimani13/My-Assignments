package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.ParentClass;

public class AppLauncherPage extends ParentClass{
	
	public AppLauncherPage(ChromeDriver driver) {
		this.driver=driver;
		
	}

	public ContactsPage clickContacts() {
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("contacts");
		
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		
		return new ContactsPage(driver);
	}
}
