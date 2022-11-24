package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classesandobj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("bts");
		d.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("bts@gmail.com");
		d.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("korea");
		d.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("korea");
		Thread.sleep(2000);
		WebElement t=d.findElement(By.xpath("//*[@id='submit']"));
		t.click();
		String s1=d.findElement(By.xpath("//*[@id='output']/div")).getText();
		System.out.println(s1);
		d.close();
	}

}
