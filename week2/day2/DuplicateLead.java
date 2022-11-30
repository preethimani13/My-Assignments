package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("akilan@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String title = driver.getTitle();
		
		boolean contains = title.contains("Duplicate Lead");
		
		System.out.println(contains);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		boolean equals = text2.equals(text);
		
		System.out.println(equals);
		
		
		
		
	}

}
