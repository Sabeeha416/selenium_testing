package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapik {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		d.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
		

	}

}
