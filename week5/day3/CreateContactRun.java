package runnerPackage;

import org.testng.annotations.Test;

import basePackage.ParentClass;
import pagesPackage.LoginPage;

public class CreateContactRun extends ParentClass{
	
	
@Test	
	public void runCreateContact() {
		
		LoginPage log = new LoginPage(driver);
		
		log.enterUsername().enterPassword().loginClick().clickapplauncher().clickViewAll().clickContacts()
		.clickNew().inputSalutation().inputFirstName().inputLastName().inputPhoneNumber().inputEmail().save().verifyContact();
	}

}
