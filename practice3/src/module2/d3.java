package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d3 {
WebDriver d;
 public void open_browser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
		d.manage().window().maximize();
 }
 //public void sign_up() throws InterruptedException {
	 //d.findElement(By.linkText("Sign up")).click();
	 //Thread.sleep(2000);
	 
 
 public void register() {
	 d.findElement(By.id("FirstName")).sendKeys("hello");
	 d.findElement(By.id("Surname")).sendKeys("hai");
	 d.findElement(By.id("E_post")).sendKeys("123");
	 d.findElement(By.id("Mobile")).sendKeys("5435467523");
	 d.findElement(By.id("Username")).sendKeys("world");
	 d.findElement(By.id("Password")).sendKeys("5435");
	 d.findElement(By.id("ConfirmPassword")).sendKeys("5435");
	 d.findElement(By.id("submit")).click();
	 WebElement txt=d.findElement(By.xpath("/html/body/div/form/div/div[10]/div/label"));
	 System.out.println(txt.getText());
 }
 //public static  void main(String[] args) throws InterruptedException {
	// d3 e=new d3();
	// e.open_browser();
	 //e.sign_up();
	// e.register();
 }

