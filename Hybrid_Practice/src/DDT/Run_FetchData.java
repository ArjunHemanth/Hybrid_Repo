package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_FetchData {
	
		public static void main(String[] args) {
			String value = Generic_Script.get_data("Sheet1", 0, 0);
			System.out.println(value);
			String value1 = Generic_Script.get_data("Sheet1", 0, 1);
			System.out.println(value1);
			
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(value);
			driver.findElement(By.id("pass")).sendKeys(value1);
			driver.findElement(By.xpath("//button[@type='submit']")).click(); 
			
	}
}
