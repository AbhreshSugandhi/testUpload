package module9.KeyWordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static void SetExcel(String path, int sheetnum) throws IOException 
	{
		
		File scr = new File(path);
		FileInputStream fis = new FileInputStream(scr);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(sheetnum);
	}

	public static String getdata(int rownum, int cellnum)
	{
		String data = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
}
