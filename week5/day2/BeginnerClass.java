package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeginnerClass {
	public RemoteWebDriver driver;
	public String fileName;

	@Parameters({"browser","url","username","password"})

	@BeforeMethod
	public void preCondition(String browser,String url,String username,String password) {
	
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("-disable-notifications");
			driver = new ChromeDriver(option);
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("-disable-notifications");
			driver = new EdgeDriver(option);
		}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
	driver.findElement(By.id("username")).sendKeys(username);
	
	driver.findElement(By.id("password")).sendKeys(password);
	
	driver.findElement(By.id("Login")).click();
	
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
		
		@DataProvider(name="read",indices={1,3})
		public String[][] dataFetch() throws IOException {
			String[][] data = DataRead.runRead(fileName);
			return data;
		}

	}

