package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
@Test	
	
public void openGoogle() {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.Google.com");
	driver.quit();
}

@Test		
public void openBing() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.Bing.com");
	driver.quit();
}
	
}
	
	
	
	

	
	
	
	
	
	


