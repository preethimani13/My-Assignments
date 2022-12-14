package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class CreateAccount extends BaseClass{
@Test

	public void runCreateAccount() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		Thread.sleep(500);
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		
		driver.executeScript("arguments[0].click();", opp);
		
		Thread.sleep(500);
		
		WebElement acc = driver.findElement(By.xpath("//span[text()='Accounts']"));
		
		driver.executeScript("arguments[0].click();", acc);
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Prawasthi Parthi");
		
		WebElement ownerCombo = driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']"));
		
		ownerCombo.click();
		
		ownerCombo.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
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
