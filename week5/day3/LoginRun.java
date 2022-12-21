package runnerPackage;

import org.testng.annotations.Test;

import basePackage.ParentClass;
import pagesPackage.LoginPage;

public class LoginRun extends ParentClass{
	@Test	
	public void runLogin() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().loginClick();
	}
}
