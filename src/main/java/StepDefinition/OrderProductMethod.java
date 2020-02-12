/**
 * 
 */
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Comman_Base_Class.BasePage;

/**
 * @author Tanuja_belwal
 *
 */
public class OrderProductMethod extends BasePage {
	
	public static void SearchProduct(String ProductName)
	{
		
		WebElement searchbox= BasePage.driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query' ]"));
		searchbox.click();
		searchbox.sendKeys(ProductName);
		//LoginLink.click();
	}
	
	public static void Click_on_Search_Icon() throws InterruptedException{
		Thread.sleep(1000);
		BasePage.driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		

		
	}
	public static void Select_Product_And_Add_To_Cart(){
		
		BasePage.driver.findElement(By.xpath("//div[@class='left-block']/div/a[@title='Faded Short Sleeve T-shirts']/img")).click();
		System.out.println("success11129");
		WebElement add_to_cart=BasePage.driver.findElement(By.xpath("//p[@id='add_to_cart']/button[@type='submit']/span"));
		System.out.println("success");
		BasePage.waitforelement(add_to_cart);
		add_to_cart.click();
	}
	
	public static void Click_on_Checkout(){
		
		WebElement Process_To_Checkout=BasePage.driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span"));
		BasePage.waitforelement(Process_To_Checkout);
		Process_To_Checkout.click();
	}

	public static void Click_on_Checkout_At_Summary_Page() throws InterruptedException{
		BasePage.ScrollUP();
		BasePage.driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']/span")).click();
		Thread.sleep(2500);
		
		
	}
	
	public static void Click_on_Checkout_At_Address_Page() throws InterruptedException {
		BasePage.ScrollUP();
		Thread.sleep(2500);
		BasePage.driver.findElement(By.xpath("//button[@name='processAddress']/span")).click();

	}
	public static void Click_on_Checkout_At_Shipping_Page() {
		BasePage.ScrollUP();
	
		BasePage.driver.findElement(By.xpath("//div[@class='checker']/span/input")).click();
		BasePage.driver.findElement(By.xpath("//button[@name='processCarrier']/span")).click();

	}
	public static void Selecy_Payment_mode() {
		BasePage.ScrollUP();
		BasePage.waitforpagetoload();
		BasePage.driver.findElement(By.xpath("//p[@class='payment_module']/a")).click();
		
	}
	public static void Confirm_Your_order(){
		BasePage.ScrollUP();
		BasePage.waitforpagetoload();
		BasePage.driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']/span")).click();
		
	}
}
