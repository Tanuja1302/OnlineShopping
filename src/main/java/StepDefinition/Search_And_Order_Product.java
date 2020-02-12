/**
 * 
 */
package StepDefinition;
import Comman_Base_Class.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * @author Tanuja_belwal
 *
 */
public class Search_And_Order_Product extends BasePage{
	
	@Then("^Search for a Product \"([^\"]*)\"$")
	public void Search_for_Product(String ProductName) throws Throwable {
		BasePage.waitforpagetoload();
		OrderProductMethod.SearchProduct(ProductName);
		 BasePage.screenshots(BasePage.driver, "productOrder", "SearchProduct");
	}
	
	@And("^Click on Search icon$")
	public void Click_on_Search_icon() throws Throwable {
			BasePage.waitforpagetoload();
			OrderProductMethod.Click_on_Search_Icon();
	}
	
	@Then("^Select product or add to card$")
	public void Select_product_or_add_to_card() throws Exception{
		
		 OrderProductMethod.Select_Product_And_Add_To_Cart();
		 BasePage.screenshots(BasePage.driver, "productOrder", "AddToCar");
	}
	
	@Then("^Click on Checkout button in pop up$")
	public void Click_on_Checkout_button(){
		
		OrderProductMethod.Click_on_Checkout();
	}
	
	@And("^Click on Process to Checkout at summaryPage$")
	public void Click_Process_to_Checkout_at_summary_page() throws Exception{
		 BasePage.screenshots(BasePage.driver, "productOrder", "Checkou_At_Summary");
		OrderProductMethod.Click_on_Checkout_At_Summary_Page();
	}
	
	@Then("^Click on Process to checkout at Address summaryPage$")
	public void Click_Process_to_Checkout_at_Address_page() throws Exception{
		BasePage.screenshots(BasePage.driver, "productOrder", "Checkou_At_Address");
		OrderProductMethod.Click_on_Checkout_At_Address_Page();
	}
	
	@Then("^Click on Process to checkout at Shipping summaryPage$")
	public void Click_Process_to_Checkout_at_Shipping_page() throws Exception{
		BasePage.screenshots(BasePage.driver, "productOrder", "Checkou_At_Shipping");
		OrderProductMethod.Click_on_Checkout_At_Shipping_Page();
	}
	@Then("^Select a payment Mode$")
	public void Select_a_payment_Mode() throws Exception{
		BasePage.screenshots(BasePage.driver, "productOrder", "Payment");
		OrderProductMethod.Selecy_Payment_mode();
	}
	
	@Then("^Confirm the order$")
	
	public void Confirm_the_order() throws Exception{
		OrderProductMethod.Confirm_Your_order();
		BasePage.screenshots(BasePage.driver, "productOrder", "Confirm_Order");
	}
}
