package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promt1 {
	WebDriver d;
    public void browser() {
  	  
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
    }
          public void title() {
          String s=d.getTitle();
          System.out.println(s);
        	  
          }
          public void current_url() {
        	  String a=d.getCurrentUrl();
        	  System.out.println(a);
          }
          public void promt_window() throws InterruptedException {
        	  d.findElement(By.id("promtButton")).click();
        	  Alert alt=d.switchTo().alert();
        	  System.out.println(alt.getText());
        	  alt.sendKeys("welcome to selenium");
        	  Thread.sleep(2000);
        	  alt.accept();
        	  WebElement w1=d.findElement(By.id("promtResult"));
        	  System.out.println(w1.getText());
        	  
        	  }
          public void close() {
        	  d.close();
          }
          public static void main(String[] args) throws InterruptedException {
        	  promt1 ob=new promt1();
        	  ob.browser();
        	  ob.title();
        	  ob.current_url();
        	  ob.promt_window();
        	  ob.close();
        	  
          }
}
