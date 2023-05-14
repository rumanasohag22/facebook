package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel{
	
	WebDriver driver;
	
	public HomeModel(WebDriver d)
	{
		driver=d;
	}
	
	public WebElement getCreateAccBtn() {
	WebElement button= driver.findElement(By.xpath("//*[text()='Create new account']"));
	return button;
	
	
	
}

}


//
//public class HomeModel extends BaseModel {
//
//	public HomeModel(WebDriver d) {
//		super(d);
//	
//	}
//	
//	public WebElement getCreateAccBtn() {
//		WebElement button= driver.findElement(By.xpath("//*[text()='Create new account']"));
//		return button;
//	}
//
//}
