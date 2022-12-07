package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlertTextVerification {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement f1 = driver.findElement(By.xpath("//div[@id='iframecontainer']//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(f1);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().sendKeys("Preethi");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(500);
		
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(text2);
		
		
		if (text2.contains("Preethi")) {
			System.out.println("Name Printed correctly");
		}else
			System.out.println("Name not printed");
		
		driver.close();
	}

}
