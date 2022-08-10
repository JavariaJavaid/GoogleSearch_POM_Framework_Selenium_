package Test;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.GoogleSearch_Page;


public class GoogleSearch_Test 
{
	private static WebDriver driver = null;

	public static void main(String Args[])
	{
		GoogleSearch();
		System.out.print("running");
		CloseDriver();
	}
	public static void GoogleSearch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
		
// OR
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver" , projectPath+"\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		String BaseURL="https://www.google.com";
		driver.get(BaseURL);
//		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//
		GoogleSearch_Page.Search_field(driver).sendKeys("POM FrameWork in selenium");
		//WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(60));
		GoogleSearch_Page.Blank_Space(driver).click();
		GoogleSearch_Page.Search_button(driver).sendKeys(Keys.RETURN);
		
		
	}
	
	public static void CloseDriver()
	{
		driver.close();
	}
}