package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Script extends Base_Page
{
	@FindBy(name="email")
	private WebElement usname;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(name ="login")
	private WebElement log;
	
	public POM_Script(WebDriver driver)
	{
		super(driver);
	}
	
	public void user(String un)
	{
		usname.sendKeys(un);
	}
	public void pass(String pw)
	{
		pwd.sendKeys(pw);
	}
	public void login()
	{
		log.click();
	}
	
}
