package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadByXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.partialLinkText("Create Le")).click();
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("IVTL");
			
			driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Arthi");
			
			driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Mani");
			
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			System.out.println("Lead added successfully");
		 
		 

	}

}
