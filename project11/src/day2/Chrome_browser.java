package day2;//opening amazon  browser and displaying title and url and getting screenshot of screen

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome_browser {
	WebDriver d;
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	}
    public void getCurrentUrl() {
    	System.out.println(d.getCurrentUrl());
   }
    public void getTitle() {
    	System.out.println(d.getTitle());
    }
    public void drop( ) {
    	WebElement a=d.findElement(By.id("searchDropdownBox"));
    	List<WebElement> a1=a.findElements(By.tagName("option"));
    	System.out.println(a1.size());
    	for(int i=1;i<=a1.size();i++) {
    		System.out.println(a1.get(i).getText());
    	}
    		
    }
    public void screenshot() throws IOException {
    	File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(a, new File("c:\\Users\\sdsab\\searches//scr4.png"));
    	}
    public void close() {
    	d.close();
    }
    
	public static void main(String[] args) throws IOException {
		Chrome_browser cb=new Chrome_browser();
		cb.open_chrome();
		cb.getTitle();
		cb.getCurrentUrl();
		cb.drop();
		cb.screenshot();
		cb.close();
		
		

	}

}
