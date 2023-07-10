package dsAlgo_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop;
	
	public Properties init_prop() throws IOException
	{
		prop=new Properties();
		try
		{
			FileInputStream ip=new FileInputStream("src\\test\\resources\\dsAlgo_Config\\Config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();	
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return prop;
	}
	
	public String getUserName()
	{
		String username = prop.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password = prop.getProperty("password");
		return password;		
	}
	
	public static String getUrl1()
	{   
		
		String getUrl=prop.getProperty("url");
		if(getUrl!=null)
		{
			return getUrl;
		}else
		{
			System.out.println("url not mentioned in config properties");
		}	return getUrl;	
	}
	
	public static String homePage() {
		String homepageurl = prop.getProperty("homePageUrl");
		if (homepageurl != null)
			return homepageurl;
		else
			throw new RuntimeException("HomePageurl not specified in the Config.properties file");
	}
	
	public static String registerPage()
	{
		String registerpageurl=prop.getProperty("registerPageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("RegisterationPage not specified in the Config.properties file");			
	}
	public static String ArrayPage()
	{
		String registerpageurl=prop.getProperty("arrayPageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("ArrayPage not specified in the Config.properties file");			
	}
	public static String datastructurePage()
	{
		String registerpageurl=prop.getProperty("datastructurePageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("ArrayPage not specified in the Config.properties file");			
	}
	public static String stackPage()
	{
		String registerpageurl=prop.getProperty("stackPageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("stackPage not specified in the Config.properties file");			
	}
	public static String treePage()
	{
		String registerpageurl=prop.getProperty("treePageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("treePage not specified in the Config.properties file");			
	}
	public static String linkedlistPage()
	{
		String registerpageurl=prop.getProperty("linkedlistPageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("linkedlistPage not specified in the Config.properties file");			
	}
	public static String graphPage()
	{
		String registerpageurl=prop.getProperty("graphPageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("graphPage not specified in the Config.properties file");			
	}
	public static String queuePage()
	{
		String registerpageurl=prop.getProperty("queuePageUrl");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("queuePage not specified in the Config.properties file");			
	}
	public static String loginPage()
	{
		String registerpageurl=prop.getProperty("loginPage");
		if(registerpageurl != null)
		return registerpageurl;
		else throw new RuntimeException("loginPage not specified in the Config.properties file");			
	}
	public static String excelPath()
	{
		String ExcelPath=prop.getProperty("ExceldataPath");
		if(ExcelPath!=null)		
			return ExcelPath;
			else throw new RuntimeException("Excel data path missing");
		
	}
	public static String programdataExcelpath()
	{
		String ExcelPath=prop.getProperty("programdataExcel");
		if(ExcelPath!=null)		
			return ExcelPath;
			else throw new RuntimeException("Excel data path missing");
		
	}
}
