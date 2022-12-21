package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.ParentClass;

public class HomePage extends ParentClass{
	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public HomePage clickapplauncher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;

	}
	
	public AppLauncherPage clickViewAll() {
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		return new AppLauncherPage(driver);
	}
}
