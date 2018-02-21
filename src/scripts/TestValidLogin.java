package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest
{
	@Test
	public void testValidLogin() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		//Enter Username
		String username=Lib.getCellValue("ValidLogin", 1, 0);
		l.setUsername(username);
		Thread.sleep(2000);
		//enter Password
		String pwd = Lib.getCellValue("ValidLogin", 1, 1);
		l.setPassword(pwd);
		l.clickLogin();
	}
}
