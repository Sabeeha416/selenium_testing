package testdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class excel {
	WebDriver d;
	@Given("user opens newtours website")
	public void user_opens_newtours_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   d=new ChromeDriver();
		    d.get("https://demo.guru99.com/test/newtours/");
		    d.manage().window().maximize();
		   
	}

	@When("user need to click register link")
	public void user_need_to_click_register_link() {
	 d.findElement(By.linkText("REGISTER")).click();
	 
		}
	

	@Then("user needs to get country names from dropdown")
	public void user_needs_to_get_country_names_from_dropdown() throws IOException {
	 FileInputStream f= new FileInputStream("C:\\Users\\sdsab\\frames.xlsx");
	 XSSFWorkbook wb=new XSSFWorkbook(f);
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
			FileOutputStream f2=new FileOutputStream("C:\\Users\\sdsab\\frames.xlsx");
			wb.write(f2);
			f2.close();
		}
		}
	
	
	

	@And("user navigated to home page and closes the window")
	public void user_navigated_to_home_page_and_closes_the_window() {
		d.navigate().back();
		d.close();
		
	}
	    
	}


