package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateOpportunityWithoutMandatoryFields extends BaseClass {

	@Test
	public void runCreateOpportunityWithError() throws InterruptedException {
		// TODO Auto-generated method stub
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	Thread.sleep(500);
	WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	
	driver.executeScript("arguments[0].click();", opp);
	
	driver.findElement(By.xpath("//a[@title='New']")).click();
	
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	
	driver.findElement(By.xpath("//td[@class='slds-is-today']/following-sibling::td/span")).click();
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	driver.findElement(By.xpath("//button[@title='Close error dialog']")).click();

	List<WebElement> names = driver.findElements(By.xpath("//div[text()='Complete this field.']/preceding-sibling::label"));

	List<String> val = new ArrayList<String>();
	for (WebElement string : names) {
		val.add(string.getText());
		System.out.println(val);
	}
	
	if (val.contains("*Opportunity Name")) {
		System.out.println("Alert message is shown correctly");
	}else
		System.out.println("Alert message not shown correctly");

	}
}
