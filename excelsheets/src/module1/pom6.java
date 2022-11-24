package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom6 {
WebDriver d;
By uname=By.name("email");
By pass=By.name("password");
By cpass=By.name("confirmPassword");
pom6(WebDriver d){
	this.d=d;
}
public void uname() {
	d.findElement(uname).sendKeys("hello");
	
}
public void pass() {
	d.findElement(pass).sendKeys("world");
}public void cpass() {
	d.findElement(cpass).sendKeys("world");
}
}

