package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Script
{
	public static String get_data(String sh,int row,int cell)
	{
		String value="";
		try
		{
			FileInputStream fis= new FileInputStream("./Excel/TestData.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sh);
			Row r = sheet.getRow(row);
			Cell c = r.getCell(cell);
			value=c.toString();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return value;
		}
		
	}

