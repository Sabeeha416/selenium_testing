package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	WebDriver d;
  @BeforeTest
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
  
  }
 

