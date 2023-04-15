package test_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sucd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SAIIRON-LAP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement target = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	js.executeScript("arguments[0],scrollIntoView(true);",target);
	

	}

}
