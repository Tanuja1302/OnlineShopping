package StepDefinition;

import Comman_Base_Class.BasePage;
import cucumber.api.java.en.Then;

public class Registration_Page_Field_Vaildation {

	@Then("^enter the name and Validate first name field$")
	public void Fname_validate() throws Throwable {
		Reg_Page_validation.Name_text_validation();
	}
}
