package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxYoutubeClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eshi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("Priyaelan2008@gmail.com");
		WebElement appendBox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");
		WebElement getTextBox=driver.findElement(By.name("username"));
		String value=getTextBox.getAttribute("value"); 
		System.out.println(value);
		WebElement clearBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clearBox.clear();
		WebElement disableBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean enabled= disableBox.isEnabled();
		System.out.println(enabled);
		//driver.close();
		
		

	}

	
		
	


		
	}


