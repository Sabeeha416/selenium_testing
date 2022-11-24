package module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours");
		d.manage().window().maximize();
		FileInputStream f=new FileInputStream("C:\\Users\\sdsab\\eclipse-workspace\\TESTNGPROG\\src\\internalfiles\\p1.properties");
	    Properties p1=new Properties();
	    p1.load(f);
		d.get(p1.getProperty("url"));
	    System.out.println("url");
		
	   
	    d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
	    d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	    pom6 p=new pom6(d);
	    p.uname();
	    p.pass();
	    p.cpass();
	    File a1 =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("c:\\Users\\sdsab\\searches//scrs.png"));
		FileInputStream f1= new FileInputStream("c:\\Users\\sdsab\\web.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(f1);
			XSSFSheet ws=wb.getSheet("sheet1");//sheet name
			Row r=null;
			Cell c=null;
		 
			WebElement b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
			List<WebElement>a=d.findElements(By.tagName("option"));
			System.out.println(a.size());
			for (int i=1;i<a.size();i++) {
				System.out.println(a.get(i).getText());
				r=ws.createRow(i);//creating rows
				r.createCell(0).setCellValue(a.get(i).getText());//column in zeroth column
				a.get(i).click();
				if(!a.get(i).isSelected()){
					r.createCell(1).setCellValue("fail");//excel will not create
				}
				else {
					r.createCell(1).setCellValue("pass");//excel will create
					
				}
				FileOutputStream f2=new FileOutputStream("C:\\Users\\sdsab\\web.xlsx");
				wb.write(f2);
				f2.close();
		
	    
	}
	}
}
