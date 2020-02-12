/**
 * 
 */
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Comman_Base_Class.BasePage;


/**
 * @author Tanuja_belwal
 *
 */
public class LoginMethod extends BasePage{
	
	public static void ClickonLOgin()
	{
		BasePage.waitforpagetoload();
		BasePage.driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
	}

	public static void LoginDetails(String arg1, String arg2)
	
	{
	    BasePage.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
	    BasePage.driver.findElement(By.id("passwd")).sendKeys(arg2);;

	}
	
	public static void SubmitDetails()
	{
		BasePage.driver.findElement(By.xpath("//button[@ id='SubmitLogin']")).click();
		
	}
	public static void ClickOnLogout(){
		BasePage.driver.findElement(By.xpath("//a[@class='logout']")).click();
		
	}
	
}
