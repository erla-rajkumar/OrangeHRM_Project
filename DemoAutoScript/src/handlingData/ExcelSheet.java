package handlingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelSheet {

		@Test(enabled = false)
		public void readXLData() throws EncryptedDocumentException, FileNotFoundException, IOException
		{
			Workbook wk = WorkbookFactory.create(new FileInputStream("./data/data.xlsx"));
			System.out.println(wk.getSheet("Dummy").getRow(0).getCell(1).toString());
		}
	
		@Test
		public void writeXLData() throws EncryptedDocumentException, FileNotFoundException, IOException
		{
			Workbook wk = WorkbookFactory.create(new FileInputStream("./data/data.xlsx"));
			Sheet sh = wk.getSheet("Dummy");
			Row r=null;
			    if(sh!=null)
			    {
			    	r=sh.getRow(25);
			    }
	
			    if(r==null)
			    {
			    	r=sh.createRow(25);
			    }
			    Cell c = r.getCell(10);
			         if(c==null)
			         {
			        	 c=r.createCell(10);
			         }
			    c.setCellValue("dummy students");	
			FileOutputStream fos=new FileOutputStream("./data/data.xlsx");
			wk.write(fos);
			fos.close();
			wk.close();
		}
	
	
	
	
}
