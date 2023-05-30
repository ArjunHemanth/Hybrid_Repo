package Practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runner_Youtube extends  Base_Test
{
	@Test(dataProvider = "test1")
	public void run(String data ) throws InterruptedException
	{
		Pom_ScriptY p = new Pom_ScriptY(driver);
		p.searching(data);
		Thread.sleep(2000);
		p.sButton();
		Thread.sleep(2000);
		p.video();
		Thread.sleep(2000);
		p.like();
		Thread.sleep(2000);
		Assert.fail();
		p.sharing();
		Thread.sleep(3000);
	}
	
		@DataProvider(name = "test1")
		public Object[][] createData1() {
		return new Object[][] {
	   { "You rock my world song"},
	 };
	}
}
