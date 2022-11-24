package amazon;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class last extends another {
  @AfterTest
  public void close() {
	  d.close();
  }
}
