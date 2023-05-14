package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelRead;
 


public class CreateAccPageTest extends BaseTest {
	@Test(dataProvider="fbData")
	
	public void createAccPageTest(String firstname, 
			String lastname, String enteremail, 
			String enterreemail,String enterpass, 
			String selectmonth,String selectday, 
			String selectyear, String gender) {
		
	
	getHomePage();
	
	hp.clickAccBtn();
	

		getCreateAccPage();
		cp.typefname(firstname );
		cp.typelname(lastname);
		cp.typeemail(enteremail);
		cp.typereemail(enterreemail);
		cp.typepass(enterpass);
		cp.selectmonth(selectmonth);
		cp.selectday(selectday);
		cp.selectyear(selectyear);
		cp.clickongender(gender);
//		cp.clickOnSignUp();
		
	}
	

	@DataProvider(name="fbData")
	public Object [][] getData() throws IOException{
		Object [][] x;
		String filename="data/FBpom.xlsx";
		String sheetname="Sheet2";
		ExcelRead er =new ExcelRead(filename, sheetname);
		x=er.excelToArray();
		
		return x;
	}

}
