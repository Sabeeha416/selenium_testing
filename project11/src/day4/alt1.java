package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt1 {
	WebDriver d;
      public void browser() {
    	  
      System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
}
      public void title() {
    	  String a=d.getTitle();
    	  System.out.println(a);
    	  
    	  
      }
      public void url() {
    	  String b=d.getCurrentUrl();
    	  System.out.println(b);
    	  
      }
      public void alert_message() throws InterruptedException {
    	  d.findElement(By.id("alertButton")).click();
    	  Alert alt=d.switchTo().alert();
    	  System.out.println(alt.getText());
    	  Thread.sleep(2000);
    	  alt.accept();
    	  
      }
      public void close() {
    	  d.close();
      }
      public static void main(String[] args) throws InterruptedException {
    	alt1 ob= new alt1();
    	ob.browser();
    	ob.title();
    	ob.url();
    	ob.alert_message();
    	ob.close();
      }
      
}

