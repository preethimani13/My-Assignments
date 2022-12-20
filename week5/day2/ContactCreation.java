package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactCreation extends BeginnerClass{
	
	@BeforeTest
	public void dataRead() {
		fileName = "CreateContact";
	}
	
	@Test(dataProvider="read")

	public void runCreateContact(String fname,String lname,String mno,String mail) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("contacts");
		
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		
		driver.findElement(By.xpath("//span[@title='Mrs.']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		
		driver.findElement(By.xpath("//input[@name='MobilePhone']")).sendKeys(mno);
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(mail);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();
		
		if(text.contains(fname)) {
			System.out.println("Contact Added successfully");
		}else
			System.out.println("Contact not Added successfully");
		
		System.out.println("Contact Name saved as: "+text);
		

	}

}
