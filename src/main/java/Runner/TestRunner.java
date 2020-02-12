package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\TanujaBelwal\\OnlineShopping\\OnlineShopping\\Feature"
,glue={"StepDefinition"},
plugin={"pretty", "html:target/cucumber-html-report"},
monochrome = true, tags={"@Logindetails"}
)
public class TestRunner {
	
	/*@Before
	public void before(){
	 System.out.println("Started");	
	}
	
	@After
	public void after(){
		System.out.println("End");
	}*/
	
	
}





