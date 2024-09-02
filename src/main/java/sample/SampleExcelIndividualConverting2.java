package sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelIndividualConverting2 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\selenium\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(2).getCell(1));
		System.out.println(value);
		
		
	}

}
