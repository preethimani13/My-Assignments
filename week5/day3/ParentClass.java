package basePackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	
	public ChromeDriver driver;


	@BeforeMethod
	public void preCondition() {
	
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("-disable-notifications");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.get("https://login.salesforce.com/");
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
