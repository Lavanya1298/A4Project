package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream(Iconstantutility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(9).createCell(1).setCellValue("jesus love");
		FileOutputStream fos = new FileOutputStream(Iconstantutility.excelPath);
		book.write(fos);
		
		
	}
}


