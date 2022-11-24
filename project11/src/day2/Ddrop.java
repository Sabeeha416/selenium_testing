package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Ddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement drag=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions act=new Actions(d);
		act.dragAndDrop(drag,drop).build().perform();
		
		
		
		
	}

}
