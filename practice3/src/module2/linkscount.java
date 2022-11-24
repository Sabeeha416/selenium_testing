package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class linkscount extends d3{
	public void count()  {
	
	
	//d.findElement(By.xpath("/html/body/nav/button/span")).click();
	WebElement b=d.findElement(By.xpath("/html/body/nav"));
	List<WebElement>a=d.findElements(By.tagName("a"));
	System.out.println(a.size());
	for (int i=1;i<=a.size();i++) {
		System.out.println(a.get(i).getText());
	
	}
	
	}
	public static void main(String[] args){
		linkscount f=new linkscount();
		f.open_browser();
		
		f.count();
	}

}
