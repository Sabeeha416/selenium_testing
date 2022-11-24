package day3;//using time and date   opening that page and copying the xpath

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b="]/td[1]";
		for(int i=1;i<=36;i++)
		{
			String c=d.findElement(By.xpath(a+i+b)).getText();
			System.out.println(c);
		}
		
	}

}
