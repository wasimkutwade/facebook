package facebookutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {


	public static  String readdatafromexcel(int row, int cell) throws EncryptedDocumentException, IOException 
	{
       FileInputStream MyFile=new FileInputStream("E:\\Ariz\\Revisionsheet.xlsx");
		
		String Value = WorkbookFactory.create(MyFile).getSheet("Sheet5").getRow(row).getCell(cell).getStringCellValue();
		return Value;
		
	}

}
