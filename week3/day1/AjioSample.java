package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//driver.findElement(By.xpath("//button[@aria-label='Allow Location']"));
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-Men')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men')])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement items = driver.findElement(By.xpath("//div[@class='length']"));
		
		String text = items.getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		
		driver.findElement(By.xpath("(//div[text()='MORE'])[2]")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> brands = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		
		int size = brands.size();
		
		System.out.println("Total no of Brands found: "+size);
		
		System.out.println("---------------------------------------");
		
		Set<String> result = new LinkedHashSet<String>();
		
		for (WebElement string : brands) {
			result.add(string.getText());
			
			System.out.println(string.getText());
		}
		
		driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
		
		Thread.sleep(1000);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Bags Name List: ");
		
		List<WebElement> bagsName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		Set<String> s1 = new TreeSet<String>();
		
		for (WebElement bags : bagsName) {
			s1.add(bags.getText());
			
			
			System.out.println(bags.getText());
		}
	}
}
