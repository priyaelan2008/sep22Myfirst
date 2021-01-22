package testNG;

import org.testng.annotations.Test;

public class SampleTestCase { 
	@Test(priority=0,enabled=false)
	public void firstTestcase() { 
		System.out.println("This is the first Testcase");
	}
@Test(priority=1)
public void secondTestCases() { 
	System.out.println("This is the second Testcase");
	
}
@Test(priority=2)
public void thirdTestCases() { 
	System.out.println("This is the third Testcase");
	}
@Test(priority=3)
	public void fourthTestCases() { 
		System.out.println("This is the fourth Testcase");		
	}
	}
