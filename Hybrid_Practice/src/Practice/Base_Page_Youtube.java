package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page_Youtube 
{		
		WebDriver driver;
		public Base_Page_Youtube(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
