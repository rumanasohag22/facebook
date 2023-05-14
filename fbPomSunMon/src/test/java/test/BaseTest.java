package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateAccPage;
import page.HomePage;

public class BaseTest {
	static WebDriver driver;
	static HomePage hp;
	static CreateAccPage cp;
	
	@BeforeSuite
	
	public void setUp() {
		
		
	          System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		       driver =new ChromeDriver();
		       driver.get("https://facebook.com");
}
	
	public void getHomePage() {
		hp=new HomePage(driver);
		
	}
	
	
	public void getCreateAccPage() {
		cp=new CreateAccPage(driver);
	}
	

}
