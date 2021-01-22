package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodExamples {
	WebDriver driver;
	String expectedTitle=null;
	String actualTitle=null;
@BeforeMethod
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("\"http://newtours.demoaut.com");

	
}
@BeforeTest
public void verifyHomeTitlePage() {
	 expectedTitle= "Welcome: Mercury Tours";
	 actualTitle=driver.getTitle();
	 assertEquals(actualTitle, expectedTitle);

	
}
@Test(priority=0)
public void  register() {
	driver.findElement(By.linkText("REGISTER")).click() ;
    expectedTitle = "Register: Mercury Tours";
    actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
}

	
	

@Test(priority=1)
public void support(){
	
	driver.findElement(By.linkText("SUPPORT")).click() ;
    expectedTitle = "Under Construction: Mercury Tours";
    actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
}


@AfterMethod
public void goBackToHomePage() {
	  driver.findElement(By.linkText("Home")).click() ;

	
}
@AfterTest
public void closeTheBrowser() {
	   driver.close();
	
}



}
