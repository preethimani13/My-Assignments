package implementationForCreateContact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactStepsDefinition {
	public EdgeDriver driver;
	
	@Given ("Launch browser,get Url and Login")
	public void precondition() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		driver = new EdgeDriver(option);
	
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);
	}
	@When ("Click Contacts from AppLauncher") 
	public void clickContacts() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("contacts");
		
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		
		Thread.sleep(500);
	}
	@And ("Click New Button")
	public void clickNew() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@And ("Select salutation from Combo")
	public void selectSalutation() {
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		
		driver.findElement(By.xpath("//span[@title='Mrs.']")).click();
	}
	@And ("Input First Name field as {string}")
	public void inputFirstName(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	}
	@And ("Input Last Name field as {string}")
	public void inputLastName(String lname) {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
	}
	@And ("Input mobile number as {string}")
	public void inputmobile(String mobile) {
		driver.findElement(By.xpath("//input[@name='MobilePhone']")).sendKeys(mobile);
	}
	@And ("Input Email ID Field as {string}")
	public void inputemail(String email) {
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
	}
	@When ("Click Save Button")
	public void save() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then ("Confirm the Save Operation with {string}")
	public void saveConfirm(String fname) {
		String text = driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();
		
		if(text.contains(fname)) {
			System.out.println("Contact Added successfully");
		}else
			System.out.println("Contact not Added successfully");
		
		System.out.println("Contact Name saved as: "+text);
		
	}
}
