package project22;

import org.openqa.selenium.chrome.ChromeDriver;

public class pp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.amazon.com");
d.manage().window().maximize();
d.findElement(locator("name")).sendkeys("books");
System.out.println(d.getCurrentUrl());
System.out.println(d.getTitle());

d.navigate().back();
	
	}

}
