package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {
@Test
	public void runCreateTask() throws InterruptedException {
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
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Task");
		
		driver.findElement(By.xpath("//mark[text()='Task']")).click();
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		
		Thread.sleep(500);
		
		WebElement newTask = driver.findElement(By.xpath("//div[text()='New Task']//parent::div"));
		
		driver.executeScript("arguments[0].click();",newTask);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
		WebElement message = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
		
		String text = message.getText();
		
		System.out.println(text);
		
		if(text.contains("Bootcamp")) {
			System.out.println("Task Verified successfully");
		}else
			System.out.println("Task not added properly");
		
		driver.close();
	}

}
