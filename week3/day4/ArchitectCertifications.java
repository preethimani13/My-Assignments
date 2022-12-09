package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		
		Thread.sleep(1000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		
		Shadow shad = new Shadow(driver);
		
		shad.findElementByXPath("//span[text()='Learning']").click();
		
		Thread.sleep(500);
		
		WebElement trailhead = shad.findElementByXPath("//span[text()='Learning on Trailhead']");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(trailhead).perform();
		
		shad.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		
		Thread.sleep(500);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		if(currentUrl.contains("architect")) {
			System.out.println("URL navigated to Architect Page");
		}else
			System.out.println("URL not navigated to Architect Page");
		
		Thread.sleep(1000);
		
		String text2 = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text')]")).getText();
		System.out.println(text2);
		
		Thread.sleep(1000);
		List<WebElement> cert = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		int size = cert.size();
		
		System.out.println("Total Number of Certifications available: "+size);
		List<String> names = new ArrayList<String>();
		System.out.println("Certificate Name: ");
		
		for (WebElement cerNames : cert) {
				names.add(cerNames.getText());
			System.out.println(cerNames.getText());
		}
		
		Thread.sleep(1000);
		
		WebElement app = driver.findElement(By.xpath("//a[text()='Application Architect']"));
		
		builder.scrollToElement(app).perform();
		
		app.click();
		
		Thread.sleep(3000);
		
		String currentUrl2 = driver.getCurrentUrl();
		
		System.out.println(currentUrl2);
		
		if(currentUrl2.contains("applicationarchitect")) {
			System.out.println("URL navigated to Application Architect Page");
		}else
			System.out.println("URL not navigated to Application Architect Page");
		
		Thread.sleep(1000);
		
		List<WebElement> cert2 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		
		List<String> names2 = new ArrayList<String>();
		
		for (WebElement string : cert2) {
			names2.add(string.getText());
		}
		Set<String> uniquecert = new LinkedHashSet<String>(names2);
		System.out.println("Application Architect's Certification Count: "+uniquecert.size());
		
		driver.close();
		
	}

}
