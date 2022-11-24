package testdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon1 {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdsab\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.amazon.com/");
	    d.manage().window().maximize();
	   
	}

	@When("user need to select the dropdown elements and searches text")
	public void user_need_to_select_the_dropdown_elements_and_searches_text() {
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("deals");
	}

	@Then("user needs  to click on search button")
	public void user_needs_to_click_on_search_button() throws InterruptedException {
		Thread.sleep(2000);
	   d.findElement(By.id("nav-search-submit-button")).click();
	}

	@And("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(2000);
		d.navigate().back();
		
	   
	}
}
