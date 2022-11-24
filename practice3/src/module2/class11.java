package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class11 {
 ChromeDriver d;
 //methods
 public void Opening_Browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	d=new ChromeDriver();
	
	
	
}
 public void Navite() {
	 d.get("https://demo.guru99.com/test/newtours/");
	 d.manage().window().maximize();
 }
 public void usernameenter() {
	 d.findElement(By.name("userName")).sendKeys("sabeeha");
	 
 }
 public void passwordenter() {
	 d.findElement(By.name("password")).sendKeys("12345");
 }
 public void click() {
	 d.findElement(By.name("submit")).click();
 }
 public void close() {
	 d.close();
 }
	
}
