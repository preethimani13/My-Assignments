package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-no='2']")).click();
		
		WebElement destination = driver.findElement(By.xpath("//input[@id='dest']"));
		destination.sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-no='2']")).click();

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		//driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		
		System.out.println("Number of Bus details: "+text);
		
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		
		String text2 = driver.findElement(By.xpath("(//div[contains(@class,'travels')])[2]")).getText();
		
		System.out.println("2nd Bus available from the List: "+text2);
		
		driver.findElement(By.xpath("//span[text()='Ok, got it']")).click();
		
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		
		

	
	}

}
