package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom1 {
	WebDriver d;
	By username =By.name("userName");
	By password =By.name("password");
	By submit =By.name("submit");
	pom1(WebDriver d){
		this.d=d;
	}
public void uname() {
	d.findElement(username).sendKeys("hello");
	
}
public void password() {
	d.findElement(password).sendKeys("world");
}public void signon() {
	d.findElement(submit).click();
}
}
