package amazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		POM2 ob=new POM2(d);
		ob.firstname();
		ob.lastname();
		ob.phnnumber();
		ob.uname();
		ob.cont();
	}

}
