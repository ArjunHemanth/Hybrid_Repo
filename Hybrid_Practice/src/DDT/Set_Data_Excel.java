package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Data_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		int count = eles.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			Row r = sh.createRow(i);	//alt+shift+l
			Cell c = r.createCell(0);
			String value = eles.get(i).getAttribute("href");
			c.setCellValue(value);
			//System.out.println(value);
		}
	
		FileOutputStream fos =  new FileOutputStream("./Excel/TestData.xlsx");
		book.write(fos);
		Thread.sleep(2000);
		driver.close();	
		
		
	}

}
