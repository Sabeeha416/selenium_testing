package testdefinition;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon2 {
	static WebDriver d;
	@Given("amazon page")
	public void amazon_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    
	   
	}

	@When("page is opened")
	public void page_is_opened() {
		d.get("https://www.amazon.com/");
	    d.manage().window().maximize();
	}

	@Then("user need to capture all links")
	public void user_need_to_capture_all_links() throws InterruptedException {
	    WebElement a=d.findElement(By.id("nav-main"));
	    List<WebElement> qe=d.findElements(By.tagName("a"));
	    System.out.println(qe.size());
	    for(int i=1;i<qe.size();i++) {
	    	System.out.println(qe.get(i).getText());
	    	//qe.get(i).click();
	    	String title=d.getTitle();
	    	String url=d.getCurrentUrl();
	    	Thread.sleep(2000);
	    	d.navigate().back();
	    	a=d.findElement(By.id("nav-main"));
		    qe=d.findElements(By.tagName("a"));
	    
	    }
	}
	 

	@And("stores the links in excelsheet and closes the window")
	public void stores_the_links_in_excelsheet_and_closes_the_window() throws IOException {
	    FileInputStream f=new FileInputStream("C:\\Users\\sdsab\\amazon.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");//sheet name
		Row r=null;
		Cell c=null;
		 WebElement a=d.findElement(By.id("nav-main"));
		 List<WebElement> qe=d.findElements(By.tagName("a"));
		 for(int i=1;i<qe.size();i++) {
				System.out.println(qe.get(i).getText());
				r=ws.createRow(i);
				r.createCell(0).setCellValue(qe.get(i).getText());
				qe.get(i).click();
				r.createCell(1).setCellValue(d.getTitle());
				r.createCell(2).setCellValue(d.getCurrentUrl());
				d.navigate().back();
				a=d.findElement(By.id("nav-main"));
				qe=d.findElements(By.tagName("a"));
			}
			FileOutputStream f3=new FileOutputStream("C:\\Users\\sdsab\\amazon.xlsx");
			wb.write(f3);
			f3.close();
		 
		
	}
}
