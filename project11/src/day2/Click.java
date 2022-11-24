package day2;//firefox driver

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FirefoxDriver d=new FirefoxDriver();
   d.get("http://www.google.com/?gws_rd=ss1");
   d.manage().window().maximize();
   WebElement link=d.findElement(By.linkText("Gmail"));
   Actions act=new Actions(d);
   act.contextClick(link).sendKeys("L").build().perform();
   
	}

}
