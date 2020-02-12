package StepDefinition;



import junit.framework.Assert;
import Comman_Base_Class.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Page extends BasePage{
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		BasePage.Browser_Open();
		BasePage.driver.get("http://automationpractice.com/index.php");
	     BasePage.screenshots(BasePage.driver, "Login", "Browser_Open");
		}

@When("^User click on LogIn link$")
	public void user_click_on_LogIn_link() throws Throwable {
		LoginMethod.ClickonLOgin();
	     BasePage.screenshots(BasePage.driver, "Login", "Login");

		}

@Then("^enter username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_should_enter_valid_credentials(String arg1, String arg2) throws Throwable {
	LoginMethod.LoginDetails(arg1, arg2);
    BasePage.screenshots(BasePage.driver, "Login", "EnterLoginDetails");

	}
//	Then I enter username as "<Username>" and Password as "<Password>"

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Exception{
		LoginMethod.SubmitDetails();
	    BasePage.screenshots(BasePage.driver, "Login", "Homepage");

		}		

@Then("^User should be on Home page$")
	public void user_should_be_on_Home_page() throws Throwable {
		String success = driver.getTitle();
		Assert.assertEquals("My account - My Store", success);
	    
	}
@Then("^Click on Logout button$")
public void Click_on_Logout_button() throws Throwable {
  Thread.sleep(2000);
  LoginMethod.ClickOnLogout();
  BasePage.driver.close();
  
}

}



