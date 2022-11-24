package day3;//same xpath only change in colums..printing first column details time and date

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2c2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b="]/td[";
		String c="]";
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=2;j++) {
		
			String e=d.findElement(By.xpath(a+i+b+j+c)).getText();
			System.out.println(e);
			}
	}

}
}