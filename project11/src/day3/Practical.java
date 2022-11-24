package day3;//using movetoelement ..jqueryui using switch

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		
		
		//music element
		WebElement music=d.findElement(By.id("ui-id-9"));
	    music.click();
	    Thread.sleep(2000);
	    
	    //jazz
	    WebElement jazz=d.findElement(By.id("ui-id-13"));
	    jazz.click();
	    Thread.sleep(2000);
	    
	    WebElement modren=d.findElement(By.id("ui-id-16"));
	    modren.click();
	    Thread.sleep(2000);
	    
	    Actions act=new Actions(d);
	    act.moveToElement(music).moveToElement(jazz).moveToElement(modren);
}

}
