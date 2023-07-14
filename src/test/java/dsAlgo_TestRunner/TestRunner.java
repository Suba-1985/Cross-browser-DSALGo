package dsAlgo_TestRunner;

	import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerLoad;
import hooks.Hooks;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@io.cucumber.testng.CucumberOptions(
			plugin = {"pretty","html:target/cucumber.html" ,"json:target/cucumber.json",
					 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
	monochrome=true,  //console output color
	 //tags from feature file
	features = {"src/test/resources/Features"},
	tags = " "
			,	
	//tags={"@Login"}, //location of feature files (should be in src/test/reso
	glue={"dsAlgo_StepDefinition","hooks"})//location of  step definition files
	public class TestRunner  extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
		 public final static ThreadLocal<String> BROWSER = new ThreadLocal<>();
		@BeforeTest
		@Parameters({"browser"})
		public void browserType(String browser) throws Throwable
		{ 
			
			//ConfigReader.getBrowserType(browser);
	//	Hooks.getProperty(browser);
		TestRunner.BROWSER.set(browser);
		LoggerLoad.info("setting the browser type from test runner class "+browser);
		
		}
		}	
	
	


//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		plugin = {"pretty","html:target/cucumber.html" ,"json:target/cucumber.json",
//				 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//		monochrome = true,
//		features = {"src/test/resources/Features"},
//		glue = {"dsAlgo_StepDefinition","hooks"}
//		)
//
//public class TestRunner {
//
//}
	
	
	
	
	
	

	//features = {"classpath:Features/BHomePage.feature:pageno."},// to run specific scenarion from line no
	//"src/main/resources/publish", tags="@Login, @Sendemail", (using tags to run specific sceanrion file)
	//tags = {"@currentTest"},//(add multiple tags to run like this)