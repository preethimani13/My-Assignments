package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleAlertCheck {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
		//Alert1
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		String text1 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		
		System.out.println("Simple Dialog Alert Result: "+text1);
		
		//Alert2 
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
		
		String text2 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		
		System.out.println("Confirm Dialog Alert Result: "+text2);
		
		//Alert3 
		
		WebElement show3 = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']"));
		
		show3.click();
		
		driver.switchTo().alert().sendKeys("Preethi");
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		String text3 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	
		System.out.println("Confirm Prompt Alert Result: "+text3);
		
		//Sweet Alert (Simple Dialog)
		
				driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
				
				driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
				
				Thread.sleep(1000);
				
				System.out.println("Sweet Alert (Simple Dialog) done");
				
		//Sweet Modal Dialog
				
				driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
				
				Thread.sleep(500);
				
				driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
				
				Thread.sleep(1000);
				
				System.out.println("Sweet Alert (Model Dialog) done");
				
		//Sweet Alert (Confirmation)
				
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//button[contains(@class,'yes')]")).click();
				
				Thread.sleep(1000);	
				
				System.out.println("Sweet Alert (Confirmation) done");
				
				driver.close();
		
	}
}
