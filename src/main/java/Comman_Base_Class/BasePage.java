package Comman_Base_Class;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {

public static WebDriver driver;


public static void Browser_Open(){
	
	System.setProperty("webdriver.chrome.driver","D:\\TanujaBelwal\\OnlineShopping\\OnlineShopping\\Resource\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

public static void waitforpagetoload()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}



public static void waitforelement(WebElement element)
{
	WebDriverWait wait= new WebDriverWait(driver, 30);
	
	wait.until(ExpectedConditions.visibilityOf(element));
	
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public static void MaxiWind(){
	driver.manage().window().maximize();
}

public static void ScrollUP() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,950)");
}
static int count=0;

public static void screenshots(WebDriver driver,String moduleName,String testcase) throws Exception{


	File scrnshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrnshot, new File(".\\screenshots\\"+moduleName+"\\"+testcase+"\\screen-"+count+".jpeg"));
	count++;

}
/*...................> Method to Select Values from drop down <..........................*/	
public static void select_by_visibletext(WebElement ele, String text)
{
	Select dropdown= new Select(ele);
	dropdown.selectByVisibleText(text);
}

public static void select_by_value(WebElement ele, String value)
{
	Select dropdown= new Select(ele);
	dropdown.selectByValue(value);
}

public static void select_by_index(WebElement ele, int index)
{
	Select dropdown= new Select(ele);
	dropdown.selectByIndex(index);
}

}