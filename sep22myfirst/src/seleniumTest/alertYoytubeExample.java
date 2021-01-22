package seleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertYoytubeExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement alertButton=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertButton.click();
		
		Alert alert= driver.switchTo().alert();
Thread.sleep(3000);
		alert.accept();
WebElement confirmButton=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
confirmButton.click();
Alert confirmalert=driver.switchTo().alert();
Thread.sleep(3000);
confirmalert.dismiss();
WebElement promtButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
promtButton.click();
Alert promtButtonalert=driver.switchTo().alert();

promtButtonalert.sendKeys("Eshienan");
Thread.sleep(3000);
//driver.close();
promtButtonalert.accept();

	}

}
