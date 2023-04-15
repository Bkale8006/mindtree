package test_pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.facebook_login;
import pom.kite_login;

public class cls {
	
	
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SAIIRON-LAP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");

		
	             WebDriver driver= new ChromeDriver();
	             driver.manage().window().maximize();
	             
	             driver.get("https://www.facebook.com/");
	             Thread.sleep(3000);
	             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	             
	             facebook_login login = new facebook_login(driver);
					  
	             //login.EnterUserID();
	            // login.EnterPWD(); 
	             //login.ClickonloginButton();
	             
	             login.CreateAC();
	             Thread.sleep(3000);
	             login.EnterFN();
	             login.EnterLN();
	             login.EnterMobno();
	             login.Enternewpassword();
	             login.EnterDate();
	             login.EnterMonth();
	             login.EnterYears();
	             login.SelectGender();
	            // driver.close();
					 
					 
	}			 
}
