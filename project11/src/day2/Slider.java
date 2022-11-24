package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/slider/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement s1=d.findElement(By.id("slider"));
		Actions act=new Actions(d);
		int y=s1.getLocation().y;
		act.dragAndDropBy(s1, y, 500).build().perform();
	}

}
