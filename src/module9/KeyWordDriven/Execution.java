package module9.KeyWordDriven;

import java.io.IOException;

public class Execution {

	public static void main(String[] args) throws IOException {
		
		String path = "D:\\Training\\Programs\\Edureka_Mar_E_WE\\src\\module9\\TestData\\MyDataEngine.xlsx";

		ExcelUtility.SetExcel(path, 0);
			for(int i=0; i<=3; i++) 
			{
				String keyword = ExcelUtility.getdata(i, 3);
				if(keyword.equals("openbrowser")) 
				{
					ActionKeywords.openbrowser();
				}
				else if (keyword.equals("navigate"))
				{
					ActionKeywords.navigate();
				}
				else if (keyword.equals("click_Gmail"))
				{
					ActionKeywords.click_Gmail();
				}
				
			}
	}

}
