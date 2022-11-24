package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/iframe-example/");
		d.manage().window().maximize();
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		Thread.sleep(2000);
		WebElement b=d.findElement(By.id("processing"));
		System.out.println(b.getText());
		Thread.sleep(2000);
		d.close();
		
		
	}

}
