package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_ScriptY extends Base_Page_Youtube
{

	@FindBy(xpath ="//input[@id='search']")
	private WebElement search;
	
	@FindBy(xpath = "//button[@id='search-icon-legacy']")
	private WebElement sbtn;
	
	@FindBy(xpath = "//a[@id='video-title']")
	private WebElement vclk;
	
	@FindBy(xpath = "(//div[@id='segmented-like-button'])[1]")
	private WebElement lyk;
	
	@FindBy(xpath = "(//div[@class='yt-spec-touch-feedback-shape__fill'])[13]")
	private WebElement share;
	
	public Pom_ScriptY(WebDriver driver)
	{
		super(driver);
	}
	
	public void searching(String data)
	{
		search.sendKeys(data);
	}
	
	public void sButton()
	{
		sbtn.click();
	}
	public void video()
	{
		vclk.click();
	}
	public void like()
	{
		lyk.click();
	}
	
	public void sharing()
	{
		share.click();
	}
}
