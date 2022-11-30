package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Find Le")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("212215");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
	
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.partialLinkText("Find Le")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("16096");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		System.out.println(text);
		
		System.out.println("Deleted Successfully");
	}
}
