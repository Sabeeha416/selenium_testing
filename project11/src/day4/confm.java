package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confm {
	WebDriver d;
    public void browser() {
  	  
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
    }
          public void title() {
        	  System.out.println(d.getTitle());
        	  
          }
          public void current_url() {
        	  System.out.println(d.getCurrentUrl());
        	
          }
          public void conformation_window( ) throws InterruptedException { 
        	  d.findElement(By.id("confirmButton")).click();
        	  Alert alt=d.switchTo().alert();
        	  System.out.println(alt.getText());
        	  Thread.sleep(2000);
        	  alt.accept();
        	  WebElement s=d.findElement(By.id("confirmResult"));
        	  System.out.println(s.getText());
        	  
        	}
          public void close() {
        	  d.close();
          }
          public static void main(String[] args) throws InterruptedException {
        	  confm ob=new confm();
        	  ob.browser();
        	  ob.title();
        	  ob.current_url();
        	  ob.conformation_window();
        	  ob.close();
        	  
          }
        	  
          }