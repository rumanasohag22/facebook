package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateAccModel;

public class CreateAccPage extends CreateAccModel{

	public CreateAccPage(WebDriver d) {
		super(d);
	
	}
	
	public void typefname(String x) {
		WebElement first=getFirstName();
		first.sendKeys(x);
	}
	
	public void typelname(String y) {
		WebElement last=getLastName();
		last.sendKeys(y);
	}
	public void typeemail(String em) {
		WebElement email=getEmail();
		email.sendKeys(em);
	}
	
	public void typereemail(String reem) {
		WebElement reemail=getreEmail();
		reemail.sendKeys(reem);
	}
	
	public void typepass(String password) {
		WebElement pass=getpass();
		pass.sendKeys(password);
	}
	
	public void selectmonth(String month) {
		WebElement selmonth=getBirthMonth();
	    Select selectm= new Select (selmonth);
	    selectm.selectByVisibleText(month);
    }
	
	public void selectday(String day) {
		WebElement selday=getBirthDay();
		Select selectday=new Select (selday);
		selectday.selectByVisibleText(day);
	}
	
	public void selectyear(String year) {
		WebElement selyear=getBirthYear();
		Select selectyear=new Select (selyear);
		selectyear.selectByVisibleText(year);
	}
	
	public void clickongender(String gender) {

	if (gender.equals("Female")) {
    	

		WebElement gender1= getgenderfemale();
	gender1.click();
		
    }
    else if(gender.equals("Male")){

 	   WebElement gender2=getgendermale();
       gender2.click();
 	
    }
    else {

        WebElement gender3=getgendercustom();
         gender3.click();

    }

	}
	
	
	public void clickOnSignUp() {
		WebElement clcksgnup=getsignup();
		clcksgnup.click();	
	}
	
	
	
	
	
	
	
	


}
