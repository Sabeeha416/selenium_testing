package module2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method sftub
		class11 m1=new class11();
		FileInputStream f=new FileInputStream("\"C:\\Users\\sdsab\\keys.xlsx\"");//saved path
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet xs=wb.getSheet("sheet1");//sheet name
		Row r=null;
		Cell c=null;
		Iterator<Row> row= xs.iterator();
		while(row.hasNext()) {
		 r=row.next();
		 c=r.getCell(2);
		 String s1=c.getStringCellValue();
		 if(s1.equals("Opening_Browser")) {
		         m1.Opening_Browser();
		 
		}
		 else if(s1.equals("Navite")) {
			 m1.Navite();
		 }
		 else if(s1.equals("User_Name")) {
		      m1.usernameenter();
	}
		else if(s1.equals("Password")) {
			m1.passwordenter();
		}
		else if(s1.equals("Click"))  {
			m1.click();
		}
		else {
			m1.close();
		}

}
}
}