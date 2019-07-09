package farah.automation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicLogin {

@Test(priority=2)
	public static void Normallogin() 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/umul/Downloads/Farah/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
	    Assert.assertEquals(welcome,"Welcome Admin");
	    driver.close();
	    	
	}

@Test(priority=1)
	public static void LoginwithWindowsAuthorization()
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/umul/Downloads/Farah/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText(), "Welcome to the-internet");
		driver.close();
	}
	
	

}
