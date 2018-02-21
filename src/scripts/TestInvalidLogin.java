package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest
{
	@Test
	public void testInValidLogin() throws InterruptedException
	{
		LoginPage l= new LoginPage(driver);
		int rowCount = Lib.getRowCount("InvalidLogin");
		for (int i = 1; i <= rowCount; i++) 
		{
			String username=Lib.getCellValue("InvalidLogin", i, 0);
			l.setUsername(username);
			Thread.sleep(2000);
			String pwd = Lib.getCellValue("InvalidLogin", i, 1);
			l.setPassword(pwd);
			l.clickLogin();
		}
	}
}