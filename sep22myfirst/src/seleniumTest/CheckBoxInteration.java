package seleniumTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxInteration {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver","C:\\eshi\\geckodriver-v0.27.0-win64\\geckodriver.exe");

WebDriver driver = new FirefoxDriver();
//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Launch website
driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
driver.manage().window().maximize();

//Click on check Box
//driver.findElement(By.id("caddoptional")).click();
WebElement getBox=driver.findElement(By.name("chouseprice"));
String value=getBox.getAttribute("value");
System.out.println("The value is:"+ value);
driver.findElement(By.id("cdownpayment")).clear();
driver.findElement(By.id("cdownpayment")).sendKeys("80");
WebElement interestRate=driver.findElement(By.id("cinterestrate"));
String values=interestRate.getAttribute("value");
System.out.println(values);


//System.out.println("The Output of the IsSelected " + driver.findElement(By.id("caddoptional")).isSelected());
//System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("caddoptional")).isEnabled());
//System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("caddoptional")).isDisplayed());

//driver.close();
}
}