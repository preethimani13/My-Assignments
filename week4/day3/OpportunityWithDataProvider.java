package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpportunityWithDataProvider extends BasicClass{
@DataProvider(name="add1")
public String[][] data() {
String[][] data = new String[2][3];
data[0][0] = "Salesforce Automation by Preethi Mani";
data[0][1] = "2ABCD";
data[0][2] = "XYZ";
data[1][0] = "Salesforce Automation by Arthi Mani";
data[1][1] = "QWERT2";
data[1][2] = "ABBC";
return data;

}
@Test(dataProvider="add1")
	public void runCreateOpportunity(String name,String order,String com) throws InterruptedException {
		
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	Thread.sleep(500);
	WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	
	driver.executeScript("arguments[0].click();", opp);
	
	driver.findElement(By.xpath("//a[@title='New']")).click();
	
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	
	driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
	
	driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
	
	driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
	
	driver.findElement(By.xpath("//input[@name='OrderNumber__c']")).sendKeys(order);
	
	driver.findElement(By.xpath("//input[@name='MainCompetitors__c']")).sendKeys(com);
	
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
