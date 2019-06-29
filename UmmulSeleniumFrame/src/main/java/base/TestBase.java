package base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
	public  static void GetWebdriver()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/umul/Downloads/Farah/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome is initialzed:TestBase");
   }
	public void ReadConfigfile()
	{
		String browser = rb.getString("browser");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		System.out.println("Chrome is login");
	}
	
	
	public  void CloseBrowser()
	{
		driver.close();
		System.out.println("Chrome is closed");
	}
}
