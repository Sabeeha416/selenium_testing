package multipletabs;//to enter name and password in q-oranngehrm page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class constructor {

	WebDriver d;
	
		constructor() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		 d.findElement(By.name("username")).sendKeys("Admin");
		 d.findElement(By.name("password")).sendKeys("admin123");
		 d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 
		 
	}
	
 public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		constructor a1 = new constructor();
		

	}

}
