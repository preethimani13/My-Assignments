package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 
		 driver.get("https://en-gb.facebook.com/");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Preethi");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mani");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		 
		 WebElement combo1 = driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select day = new Select(combo1);
		 
		 day.selectByValue("13");
		 
		 WebElement combo2 = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select month = new Select(combo2);
		 
		 month.selectByIndex(8);
		 	 
		 WebElement combo3 = driver.findElement(By.xpath("//select[@id='year']"));
		 
		 Select year = new Select(combo3);
		 
		 year.selectByVisibleText("1991");
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 
		 System.out.println("Facebook SignUp details entered successfully");
		 
		 
	}

}
