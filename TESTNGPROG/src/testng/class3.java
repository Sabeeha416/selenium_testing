package testng;

import org.testng.annotations.Test;

public class class3 extends class2{
  @Test(priority=6)
  public void feedback(){
	  System.out.println("get feedback");
  }
}
