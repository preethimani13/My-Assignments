package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.ParentClass;

public class VerifyContactPage extends ParentClass{
	
	public VerifyContactPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public VerifyContactPage verifyContact() {
		String text = driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();
		
		if(text.contains("Prathik")) {
			System.out.println("Contact Added successfully");
		}else
			System.out.println("Contact not Added successfully");
		
		System.out.println("Contact Name saved as: "+text);
	
	return this;
	
}

}
