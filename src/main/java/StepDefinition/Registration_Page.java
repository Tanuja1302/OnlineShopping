/**
 * 
 */
package StepDefinition;

import junit.framework.Assert;
import Comman_Base_Class.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Tanuja_belwal
 *
 */
public class Registration_Page extends BasePage {
	
	@Given("^User is on Landing  page for sign up$")
	public void user_is_on_home_page() throws Throwable {
		BasePage.Browser_Open();
		BasePage.driver.get("http://automationpractice.com/index.php");
	    BasePage.screenshots(BasePage.driver, "Registration", "Browser_Open");
		}

@When("^User click on SignUp link$")
	public void user_click_on_SignIn_link() throws Throwable {
	//BasePage.driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	    RegistrationPageMethods.ClickonLOgin();
	    
		}
@Then("^User should be on Sign Up page$")

public void User_should_be_on_Sign_Up_page() throws Throwable {
	String siginUp_Page_title=driver.getTitle();
	Assert.assertEquals("Login - My Store", siginUp_Page_title);
    BasePage.screenshots(BasePage.driver, "Registration", "SignUpPage");

}
@Then("^enter Email as \"([^\"]*)\" and Click on Create Account button$")

public void Ente_Email_Address_and_Clickon_Continue(String arg1) throws Exception{
	RegistrationPageMethods.Enter_Email_Address(arg1);
    BasePage.screenshots(BasePage.driver, "Registration", "EnterEmail");

}

@Then("^Enter all the required details$")
public void Enter_all_the_required_details() throws Throwable{
	 
	RegistrationPageMethods.Ente_All_Otehr_Details_to_SignUP();
    BasePage.screenshots(BasePage.driver, "Registration", "RegistrationDetails");

}

@Then("^Click on Create Account Button$")
public void Click_on_Create_Account_Button() throws Throwable{
	
RegistrationPageMethods.Click_On_Continue();
}

@Then("^User should be redirected to Dashboard page$")
public void User_should_be_redirected_to_Dashboard_page() throws Throwable{
	
	String ExpectedPageURL="http://automationpractice.com/index.php?controller=my-account";
	String CurrentURl=BasePage.driver.getCurrentUrl();
	Assert.assertEquals(ExpectedPageURL, CurrentURl);
    BasePage.screenshots(BasePage.driver, "Registration", "DashboardPage");

}

}
