package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prog2 {
	WebDriver d;
  //@BeforeMethod
	@BeforeClass
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.in/");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void gettitle() {
  System.out.println("d.getTitle()");
}
  @Test(priority=2)
  public void geturl() {
	  System.out.println("d.getCurrentUrl");
  }
  @Test(priority=3)
  public void getscreenshot() throws IOException {
	  File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(a1,new File("C:\\Users\\sdsab\\Searches//scr.png") );
  }
  //@AfterMethod
  @AfterClass
  public void close() {
	  d.close();
  }
}