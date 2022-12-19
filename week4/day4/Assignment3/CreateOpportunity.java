package week4.day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOpportunity extends ParentClass{
	
	@DataProvider(name="fetch")
	
	public String[][] fectchData() throws IOException {
		String[][] data = ReadDataByExcel.runRead();
		return data;
	}

	@Test(dataProvider="fetch")
	
	public void runCreateOpportunity(String name,String amt) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		Thread.sleep(500);	
		
		
		driver.findElement(By.linkText("View All Key Deals")).click();
		
		Thread.sleep(500);	
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='New Customer']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
		
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Partner Referral']")).click();
		
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amt);
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		driver.findElement(By.xpath("//button[@title='Next Month']")).click();
		
		driver.findElement(By.xpath("//span[text()='20']//parent::td")).click();
		
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Campaigns...']")).click();
		
		driver.findElement(By.xpath("//li[contains(@class,'slds-listbox__item')]")).click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String text = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		
		System.out.println(text);
		
		if(text.contains(name)) {
			System.out.println("Opportunity Added successfully");
		}else
			
			System.out.println("Opportunity not Added successfully");
		
		
		
		
	}

}
