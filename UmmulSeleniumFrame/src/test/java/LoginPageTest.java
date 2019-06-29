import org.testng.annotations.Test;

import base.TestBase;
@Test //Open the browser and Close it
public class LoginPageTest extends TestBase {

	
public void setup()
{
	GetWebdriver();
	System.out.println("Loginpagetestclass");
	ReadConfigfile();
	System.out.println("Successgul login");
	//CloseBrowser();
}


}
