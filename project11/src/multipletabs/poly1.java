package multipletabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class poly1 {
	static WebDriver d;
	public void details(String a) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get(a);
		 d.manage().window().maximize();
	}
	public void details() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.name("userName")).sendKeys("uname");
		 d.findElement(By.name("password")).sendKeys("pass");
		  d.findElement(By.name("submit")).click();
		
	}
	public void details(String uname,String pass) throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.name("//*[@name='userName']")).sendKeys(uname);
		 d.findElement(By.name("//*[@name='password']")).sendKeys(pass);
		 d.findElement(By.name("//*[@name='submit']")).click();

		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		poly1 p=new poly1();
		p.details("https://demo.guru99.com/test/newtours/");
		//p.details("hai","world");
		p.details();
	}

}
