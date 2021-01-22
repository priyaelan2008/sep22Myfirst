package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonYouTubeExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		WebElement unchecked=driver.findElement(By.name("news"));
		
		WebElement checked=driver.findElement(By.
xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		
		Boolean status1= unchecked.isSelected();
		 Boolean status2=checked.isSelected();
		 System.out.println(status1);
		 System.out.println(status2);
		 WebElement above40=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
		 above40.click();
				
		

	}

}
