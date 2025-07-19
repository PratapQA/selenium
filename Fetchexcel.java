package seleniumpackageprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//step 1
		FileInputStream f1 = new FileInputStream("C:\\Users\\prata\\eclipse-workspace\\Grotechmindsproject\\excelsheet\\pratap.xlsx");
		//step 2
	Workbook w1=WorkbookFactory.create(f1);
	w1.getSheet("login");
		Sheet s1 = w1.getSheet("login");
		Row r1 =	s1.getRow(0);
			Cell c1 =r1.getCell(0);
		String str=	c1.getStringCellValue();
		System.out.println(str);
		

	}

}
