package farah.automation;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basicauth {
@Test
	public static void main(String[] args)
	{/**
		System.setProperty("webdriver.chrome.driver","C:/Users/umul/Downloads/apiTest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("i m in chrome");
		//To handle chrome authentication popup pass the username and password in the URL,since elements are not identified using locators
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("i m here");
		String actual = driver.findElement(By.cssSelector("#content > div > p")).getText();
		Assert.assertEquals(actual, "Congratulations! You must have the proper credentials.");
		System.out.println("I m not here");**/
		System.setProperty("webdriver.chrome.driver","C:/Users/umul/Downloads/Farah/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		WebElement Slide = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
		Actions move = new Actions(driver);
	    Action action = move.dragAndDropBy(Slide, 55, 0).build();
	    action.perform();
	    String verifiedrange= driver.findElement(By.xpath("//*[@id=\"range\"]")).getText();
	    Assert.assertEquals(verifiedrange, "5");
	    System.out.println("The max range is 5");
	    Action action1 = move.dragAndDropBy(Slide, -55, 0).build();
	    action1.perform();
	    String verifiedrange1= driver.findElement(By.xpath("//*[@id=\"range\"]")).getText();
	    Assert.assertEquals(verifiedrange1, "0");
	    System.out.println("The min range is 0");
	
		
	}

	
}

