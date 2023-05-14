package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccModel extends BaseModel{

	public CreateAccModel(WebDriver d) {
		super(d);	
	}

	public WebElement getFirstName() {
	      By locator=By.xpath("//input[@name='firstname']");
	      WebDriverWait wait=new WebDriverWait(driver,10);
	      wait.until(ExpectedConditions.presenceOfElementLocated(locator))  ;
	  	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		return firstname;
		}
	
	public WebElement getLastName() {
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		return lastname;
		
	}
	
	public WebElement getEmail() {
		WebElement enteremail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return enteremail;
	}
	
	public WebElement getreEmail() {
		WebElement enterreemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		return enterreemail;
	}
	
	public WebElement getpass() {
		WebElement findpass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		return findpass;
	}
	
	public WebElement getBirthMonth(){
	  WebElement findBmonth= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	  return findBmonth;
	}
	
	public WebElement getBirthDay() {
		WebElement findBday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		return findBday;
	}
	
	public WebElement getBirthYear() {
		WebElement findBYear= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		return findBYear;
	}
	
	public WebElement getgenderfemale() {
		WebElement findFemale=driver.findElement(By.xpath("//input[@value='1']"));
		return findFemale;
	}
	
	public WebElement getgendermale() {
		WebElement findMale=driver.findElement(By.xpath("//input[@value='2']"));
		return findMale;
	}
	public WebElement getgendercustom() {
		WebElement findCustom=driver.findElement(By.xpath("//input[@value='-1']"));
		return findCustom;
	}
	
	
	public WebElement getsignup() {
		WebElement findsignup=driver.findElement(By.xpath("//button[text()='Sign Up'][1]"));
		return findsignup;
		
		
	}
	


	
	

}
