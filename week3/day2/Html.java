package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notiofications");
		EdgeDriver driver = new EdgeDriver(option);
	
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));
		int size = column.size();
		System.out.println(size);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		int size2 = row.size();
		System.out.println(size2);
		
		driver.close();
		
	}

}
