package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyExample {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\eshi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/percent-calculator.html");
WebElement secondBox=driver.findElement(By.name("cpar2"));
secondBox.sendKeys("200");
WebElement firstBox=driver.findElement(By.name("cpar1"));
firstBox.sendKeys("300");
WebElement getValue=driver.findElement(By.name("cpar1"));
String value=getValue.getAttribute("value class");
System.out.println(getValue);
//WebElement clearBox=driver.findElement(By.
	//	xpath("//*[@id=\'content\']/table[1]/tbody/tr[2]/td/img"));

//clearBox.click();;

	}

}
