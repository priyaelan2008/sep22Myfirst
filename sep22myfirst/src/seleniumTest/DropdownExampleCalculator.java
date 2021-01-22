package seleniumTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExampleCalculator {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\eshi\\geckodriver-v0.27.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.calculator.net/mortgage-calculator.html");
WebElement dropDown=driver.findElement(By.id("cstartmonth"));
Select s1=new Select(dropDown);
s1.selectByValue("1");
Thread.sleep(3000);
s1.selectByIndex(4);
Thread.sleep(3000);
s1.selectByVisibleText("May");
WebElement dropDown1=driver.findElement(By.name("cdownpaymentunit"));
Select s2=new Select(dropDown1);
s2.selectByValue("d");


     
   }
}

