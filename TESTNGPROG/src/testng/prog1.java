package testng;

import org.testng.annotations.Test;

public class prog1 {
  @Test(priority=1)
  public void opening_browser() {
	  System.out.println("application sucessfully opened");
	  
  }
  @Test(priority=2)
  public void customerdetails() {
	  System.out.println("customer details updated");
	  
  }
  @Test(priority=3)
  public void productdetails() {
	  System.out.println("product deatils updated");
	  
  }
  @Test(enabled=false)
  public void paymentdeatails() {
	  System.out.println("payment details updated");
  }
  @Test(priority=4)
  public void deliveryprocess() {
	  System.out.println("delivered to correct place");
  }
  @Test(priority=5)
  public void feedback() {
	  System.out.println("feedback recevied");
  }
  @Test(priority=6)
  public void logoff() {
	  System.out.println("logged off");
  }
}
