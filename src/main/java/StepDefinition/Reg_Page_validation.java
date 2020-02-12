package StepDefinition;

import java.util.regex.Pattern;

import org.openqa.selenium.By;

import Comman_Base_Class.BasePage;

public class Reg_Page_validation {

	public static void Name_text_validation() {
		
		
		BasePage.driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	    BasePage.driver.findElement(By.id("customer_firstname")).sendKeys("Testing");
        String FnameData=BasePage.driver.findElement(By.id("customer_firstname")).getAttribute("value");
 	

       try{
    	   
        if(FnameData.matches("^[a-zA-Z]*$")){
        	
        	System.out.println("Entered Valid Fname"+FnameData);
        	
        }
        else{
        	System.out.println("entered Wrong details in email Filed");
        }
        
	}
       catch(Exception e){
    	   System.out.println("Error is coming"+e);
    	   }
   	System.out.println("For Testing");

       }

}
