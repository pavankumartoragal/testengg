package testngpgm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class t1
 {
	@Test
   public void test1()
       {
    	 Reporter.log("hi java",true);
       }

	@Test
  public void test2()
      {
   	 Reporter.log("hello java",true);
      }
 }
