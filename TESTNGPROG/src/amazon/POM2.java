package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
 WebDriver d;
 By Fname =By.name("firstName");
 By Lname =By.name("lastName");
 By Phone =By.name("phone");
 By Uname =By.name("userName");
 By Country =By.name("country");
  POM2(WebDriver d){
	  this .d=d;
	  
  }
 
 public void firstname() {
	 d.findElement(Fname).sendKeys("testing123");
 }
 public void lastname() {
	 d.findElement(Lname).sendKeys("testing");
 }
 public void phnnumber() {
	 d.findElement(Phone).sendKeys("3546768984");
 }
 public void uname() {
	 d.findElement(Uname).sendKeys("testing selenium");
 }
 public void cont() {
	 d.findElement(Country).sendKeys("india");
 }
}

