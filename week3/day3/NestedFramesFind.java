package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFramesFind {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		//Frame 1
		WebElement fr1 = driver.findElement(By.xpath("//div[@class='card mb-3']/iframe[@id='frame1']"));
		
		driver.switchTo().frame(fr1);
		
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Selenium");
	
		//Frame 3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		
		//Frame 2
		
		WebElement fr2 = driver.findElement(By.xpath("//div[@class='card mb-3']/iframe[@id='frame2']"));
		
		driver.switchTo().frame(fr2);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select animals = new Select(dropDown);
		
		animals.selectByValue("avatar");

	}

}
