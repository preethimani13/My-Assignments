package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='Search for your city']"));
		from.sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[contains(@class,'jMjMYb')]")).click();

		String currentUrl = driver.getCurrentUrl();
		
		boolean contains = currentUrl.contains("hyderabad");
		
		if(contains==true) {
			System.out.println("URL navigated to Hyderabad City");
			
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Avatar");
		driver.findElement(By.xpath("//span[@class='sc-jhaWeW ChCae']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		
		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//span[text()='3D']")).click();
	    
	    WebElement theatre = driver.findElement(By.xpath("//a[contains(@class,'__venue-name')]"));
	    
	    String name = theatre.getText();
	    
	    System.out.println("First Theatre name is "+name);
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
	  
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[@class='venue-info-text']")).click();
	    
	    //parking facility
	    
	    String facility = driver.findElement(By.xpath("(//div[@class='facility-text'])[4]")).getText();
	    
	    String parking="Parking Facility";
	    
	    boolean park = facility.equalsIgnoreCase(parking);
	    
	    if(park==true) {
	    	System.out.println("Parking facility is Available");
	    	}
	    driver.findElement(By.xpath("//div[@class='cross-container']")).click();
	    
	    driver.findElement(By.xpath("//a[@data-overall-avail-status='3']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
	    
	    driver.findElement(By.xpath("//li[text()='1']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	    
	    driver.findElement(By.xpath("//a[@class='_available']")).click();
	    
	    driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
	    
	    WebElement total = driver.findElement(By.xpath("//span[@class='__sub-total']"));
	    	
	    Thread.sleep(2000);
	    		
	    String price = total.getText();
	    
	    System.out.println("Sub Total: "+price);
	  
	}

}
