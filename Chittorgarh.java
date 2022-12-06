package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notiofications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> securityList = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr/td[3]"));
		int size = securityList.size();
		
		System.out.println("List Size: "+size);
		
		System.out.println("------------------------------------------");
		
		List<String> names = new ArrayList<String>();
		
		for (WebElement sec : securityList) {
			names.add(sec.getText());
			
			System.out.println(sec.getText());
		}
		
		Set<String> list2 = new LinkedHashSet<String>(names);
		
		int size2 = list2.size();
		
		System.out.println("------------------------------------------");
		
		System.out.println("Set Size: "+size2);
		
		if(size==size2) {
			System.out.println("Duplicate not found");
		}else
			System.out.println("Duplicate found");
		
		driver.close();
	}

}
