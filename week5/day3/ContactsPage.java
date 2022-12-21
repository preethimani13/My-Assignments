package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.ParentClass;

public class ContactsPage extends ParentClass{
	
	public ContactsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public NewContactPage clickNew() {

		driver.findElement(By.xpath("//div[text()='New']")).click();
		return new NewContactPage(driver);
	}

}
