package Generic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Script extends Base_Test
{
	
	@Test
	public void test1() throws InterruptedException
	{
		String gen = Generic_Script_ExcelSheet.get_data("Sheet1", 0, 0);
		String gem = Generic_Script_ExcelSheet.get_data("Sheet1", 0, 1);
		
		POM_Script p = new POM_Script(driver);
		p.user(gen);
		p.pass(gem);
		p.login();
		Assert.fail();
		Thread.sleep(2000);
	}
	
//	@DataProvider(name = "test1")
//	public Object[][] createData1() {
//	 return new Object[][] {
//	   { "boss","12345"},
//	 };
	}


