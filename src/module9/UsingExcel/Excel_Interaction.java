package module9.UsingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Excel_Interaction {

	public void ReadExcel() throws IOException, BiffException {

		FileInputStream fs = new FileInputStream("D:\\Training\\Programs\\Edureka_Mar_E_WE\\src\\module9\\TestData\\TestData.xls");
		
		//To get the workbook
		Workbook wb = Workbook.getWorkbook(fs);

		//To get the sheet
		Sheet sh = wb.getSheet(0);
		
		//to get the no of rows in the sheet
		int TotalRow = sh.getRows();
		
		//to get the no fo columns in the sheet
		int TotalColumn = sh.getColumns();
		
		for(int row = 1; row<TotalRow; row++) {
			for(int col = 0; col<TotalColumn; col++) {
				System.out.println(sh.getCell(col, row).getContents()+"\t");
			}
		}
	}

	public static void main(String args[]) throws BiffException, IOException {
		Excel_Interaction rd = new Excel_Interaction();
		rd.ReadExcel();
	}
	
}
