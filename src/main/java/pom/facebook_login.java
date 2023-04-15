package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook_login {
	

	
	@FindBy(xpath="//input[@id='email']")
			private WebElement userid;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pwd;
	@FindBy(xpath="//button[@value='1']")
	private WebElement login;
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement CreateAC;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement FN;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement LN;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement mobno;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement Npwd;
	@FindBy(xpath="//select[@aria-label='Day']")
	private WebElement Date;
	@FindBy(xpath="//select[@aria-label='Month']")
	private WebElement Month;
	@FindBy(xpath="//select[@aria-label='Year']")
	private WebElement Year;
	@FindBy(xpath="(//label[@class='_58mt'])[2]")
	private WebElement Gender;
	
	
	
	
	public facebook_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserID()
	{
		userid.sendKeys("9604698006");
	}
	public void EnterPWD()
	{
		pwd.sendKeys("8983127587");
	}
	public void ClickonloginButton()
	{
		login.click();
	}
	public void CreateAC()
	{
		CreateAC.click();
	}
	public void EnterFN()
	{
		FN.sendKeys("Nilesh");
	}
	public void EnterLN()
	{
		LN.sendKeys("Kale");
	}
	public void EnterMobno()
	{
		mobno.sendKeys("960469800");
	}
	public void Enternewpassword()
	{
		Npwd.sendKeys("Brk@1234");
	}
	public void EnterDate()
	{
		Date.sendKeys("30");
	}
	public void EnterMonth()
	{
		Month.sendKeys("02");
	}
	public void EnterYears()
	{
		Year.sendKeys("1988");
	}
	public void SelectGender()
	{
		Gender.click();
	}
	
}
