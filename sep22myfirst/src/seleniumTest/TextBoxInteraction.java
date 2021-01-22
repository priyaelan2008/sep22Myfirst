package seleniumTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxInteraction {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.gecko.driver","C:\\eshi\\geckodriver-v0.27.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
// Puts a Implicit wait, Will wait for 10 seconds before throwing exception
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Launch website
driver.navigate().to("http://www.calculator.net/percent-calculator.html");
//driver.get("https://www.calculator.net/mortgage-calculator.html");
// Maximize the browser
driver.manage().window().maximize();

// Enter value 10 in the first number of the percent Calculator
driver.findElement(By.id("cpar3")).sendKeys("150");
driver.findElement(By.id("cpar2")).sendKeys("100");
//WebElement getInterest=driver.findElement(By.id("cinterestrate"));
//String result=getInterest.getAttribute("value");
//System.out.println("result");
Thread.sleep(5000);

// Get the text box from the application
String result = driver.findElement(By.id("cpar3")).getAttribute("value");

// Print a Log In message to the screen
System.out.println(" The Result is " + result);

// Close the Browser.
//driver.close();

}
}



		


