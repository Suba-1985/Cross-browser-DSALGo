package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_Driverfactory.DriverFactory;
import dsAlgo_PageObject.ALandingPage;
import dsAlgo_PageObject.BHomePage;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerLoad;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	private static DriverFactory driverFactory;
	private static WebDriver driver;
	private static ConfigReader configReader;
	static Properties prop;
	static WebDriverWait wait ;
	
	
	@BeforeAll(order = 0)
	 //public static void before_or_after_all()
	public static void getProperty() throws IOException
	{   System.out.println("Initializing Config Properties ");
		configReader =new ConfigReader();
		prop=configReader.init_prop();	
		String browserName=prop.getProperty("browser");
		String geturl=prop.getProperty("url");
		System.out.println("launching the browser from the hooks page");
		driverFactory=new DriverFactory();
		System.out.println("heloo browsername launch");
		driver=driverFactory.init_driver(browserName,geturl);
		LoggerLoad.info("Launching app"+geturl);
				
		}
	@BeforeAll(order = 1)
	public static void getStart() throws IOException
	{  BHomePage home=new BHomePage(driver);
	try {
		home.click_Btn();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@AfterAll// will execute after "1" then order 0
	public static void quitBrowser()
	{
		LoggerLoad.info("Closing App");
		driver.close();
	}
	
	
	@AfterStep(order=1)//for After it will start from 1 and then 0
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())//take ScreenShot;
		{	LoggerLoad	.error("Scenario Failed");
			String screenShotName=scenario.getName().replaceAll("", "_");
			byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath,"image/png", screenShotName);
		}
	}
}
