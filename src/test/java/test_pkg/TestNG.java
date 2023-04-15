package test_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.kite_login;

public class TestNG {
	
	

		
	@BeforeClass
	public void beforeclass()
	{ 
		System.out.println("BeforeClass");
		
	}
		
		@BeforeMethod
		public void beforemethod()
		{
		                            
		}
		
		@Test
		public void t001()
		{
			System.out.println("t001");
		}
		
		@Test 
		public void t002()
		{
			System.out.println("t002");
		}
		@Test 
		public void t003()
		{
			System.out.println("t003");
		}
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("aftermethod");
		}
		@AfterClass
		public void afterclass()
		{
			System.out.println("afterclass");
		}		
		
	}

