/**
 * 
 */
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Comman_Base_Class.BasePage;
import Comman_Base_Class.Excel_Sheet_SetUp;

/**
 * @author Tanuja_belwal
 *
 */
public class RegistrationPageMethods extends BasePage{

	public static void ClickonLOgin()
	{
		BasePage.waitforpagetoload();
		BasePage.driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
	}
	
	
	public static void Enter_Email_Address(String arg1){
		// Enter Email Address and Click on Submit Button
		
		BasePage.driver.findElement(By.id("email_create")).sendKeys(arg1);
		BasePage.driver.findElement(By.xpath("//button[@ id='SubmitCreate']")).click();
	}
	
	
	public static void Ente_All_Otehr_Details_to_SignUP() throws Throwable{
		Excel_Sheet_SetUp exl= new Excel_Sheet_SetUp();
		String Gender= exl.getexceldata("Sheet1",1,1);
		 String FirstName= exl.getexceldata("Sheet1",1,2);
		 String LastName= exl.getexceldata("Sheet1",1,3);
		 String Password= exl.getexceldata("Sheet1",1,4);
		 String Date= exl.getexceldata("Sheet1",1,5);
		 String DateMonth= exl.getexceldata("Sheet1",1,6);
		 String DateMonthYear= exl.getexceldata("Sheet1",1,7);
		 String Company_name= exl.getexceldata("Sheet1",1,8);
		 String Address1= exl.getexceldata("Sheet1",1,9);
		 String City= exl.getexceldata("Sheet1",1,10);
		 String State= exl.getexceldata("Sheet1",1,11);
		 String Postalcode= exl.getexceldata("Sheet1",1,12);
		 String Country= exl.getexceldata("Sheet1",1,13);
		 String phonenumber= exl.getexceldata("Sheet1",1,14);
	     String fAddress= exl.getexceldata("Sheet1",1,15);
		
	     BasePage.waitforpagetoload();
		
		    if(Gender.contains("Mr"))
		    {
		   	 
		    	BasePage.driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		   	
		    }
		    if(Gender.contains("Mrs"))
		    {
		  
		    	BasePage.driver.findElement(By.xpath("//input[@id='id_gender2']]")).click();
		    }
	    
		    //Enter First name, Last name and Password
		    BasePage.driver.findElement(By.id("customer_firstname")).sendKeys(FirstName);
		    BasePage.driver.findElement(By.id("customer_lastname")).sendKeys(LastName);
		    BasePage.driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(Password);
			
			 //Select Date, Month and year 
			WebElement days= BasePage.driver.findElement(By.xpath("//select[@id='days']"));
			WebElement months=BasePage.driver.findElement(By.xpath("//select[@id='months']"));
			WebElement years=BasePage.driver.findElement(By.xpath("//select[@id='years']"));
	
			BasePage.select_by_value(days, Date);
			BasePage.waitforpagetoload();
			
		
			BasePage.select_by_value(months, DateMonth);
			BasePage.waitforpagetoload();
			
			BasePage.select_by_value(years, DateMonthYear);
			// Click on Checkbox
			
			BasePage.driver.findElement(By.xpath("//input[@type='checkbox' and @value='1']")).click();
			BasePage.driver.findElement(By.id("company")).sendKeys(Company_name);
			BasePage.driver.findElement(By.xpath("//input[@name='address1'and @id='address1']")).sendKeys(Address1);
			BasePage.driver.findElement(By.id("city")).sendKeys(City);
			
			//Select State
			
			WebElement state=BasePage.driver.findElement(By.id("id_state"));
			BasePage.select_by_visibletext(state, State);
			
			//Enter Zip Code
			BasePage.driver.findElement(By.id("postcode")).sendKeys(Postalcode);
			
			WebElement country=BasePage.driver.findElement(By.xpath("//Select[@name='id_country' and @id='id_country']"));
	
			BasePage.select_by_visibletext(country, Country);
			
			//* Enter Mobile Number and Alternative future address
			BasePage.driver.findElement(By.id("phone_mobile")).sendKeys(phonenumber);
			BasePage.driver.findElement(By.xpath("//input[@name='alias' and @id='alias']")).sendKeys(fAddress);
				 
	}
	public static void Click_On_Continue(){
		
		BasePage.driver.findElement(By.xpath("//button[@name='submitAccount']/span")).click();
	}
	
}
