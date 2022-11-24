package multipletabs;//newtours giving usename and password and clicking submit button

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	WebDriver d;
	public void open_browser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 d=new ChromeDriver();
	 d.get("https://demo.guru99.com/test/newtours/");
	 d.manage().window().maximize();
	 d.findElement(By.name("userName")).sendKeys("selenium");
	 d.findElement(By.name("password")).sendKeys("testing");
	 Thread.sleep(2000);
	 d.findElement(By.name("submit")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		functions f = new functions();
		f.open_browser();
	

	}

}
