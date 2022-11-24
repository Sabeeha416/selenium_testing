package testng;

import org.testng.annotations.Test;

public class class2 extends class1 {
  @Test(priority=4)
  public void paymentdetails() {
  System.out.println("payment details generated");
  }
  @Test(priority=5)
  public void deliveryprocess() {
	System .out.println("delivery process details");
  }
 
}
