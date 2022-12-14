package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Opportunity extends BaseClass{

@Test
	public void runCreateOpportunity() throws InterruptedException {
		// TODO Auto-generated method stub
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	Thread.sleep(500);
	WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	
	driver.executeScript("arguments[0].click();", opp);
	
	driver.findElement(By.xpath("//a[@title='New']")).click();
	
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Preethi Mani");
	
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	
	driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
	
	driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
	
	driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	WebElement message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
	
	String text = message.getText();
	
	System.out.println(text);
	
	if(text.contains("Preethi")) {
		System.out.println("Contact Verified Successfully");
	}else
		System.out.println("Contact not added properly");	
	
	
	}

}
