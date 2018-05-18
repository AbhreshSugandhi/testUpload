package module9.UsingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelInteract {

	static int rowcount = 0;
	
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
	FileInputStream fis = new FileInputStream("D:\\Training\\Programs\\Edureka_Mar_E_WE\\src\\module9\\TestData\\TestData.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sh = wb.getSheetAt(0);

	Row row = sh.getRow(1);
	
	Cell cell = row.getCell(1);
	
	System.out.println(cell);
	
	String CellValue = cell.getStringCellValue();
	
	System.out.println(CellValue);
	
	}

}
