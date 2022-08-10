package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearch_Page {
	
	private static WebElement element = null;
	
	public static WebElement Search_field(WebDriver driver)
	{
		 element = driver.findElement(By.name("q"));
		 return element;
	}
	
	public static WebElement Search_button(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		return element;
	}
	public static WebElement Blank_Space(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("//input[@name='q']/../../../.."));
		return element;
	}
	//div[contains(text(),"Dark theme")]
	public static WebElement Setting_button(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[text()='Settings']"));
		return element;
	}
	public static WebElement DarkTheme_Option(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[text()='Settings']"));
		return element;
	}

}
