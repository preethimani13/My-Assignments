package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	@Test
	public void runCreateContact() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		Thread.sleep(500);
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		
		driver.executeScript("arguments[0].click();", opp);
		Thread.sleep(1000);
		
		WebElement acc = driver.findElement(By.xpath("//span[text()='Accounts']"));
		
		driver.executeScript("arguments[0].click();", acc);
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Preethi Mani");
		
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
		
		driver.close();
	}

}
