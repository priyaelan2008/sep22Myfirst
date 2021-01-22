package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonYouTubeClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		//WebElement clickButton=driver.findElement(By.id("home"));
		//clickButton.click();
		WebElement getPosition=driver.findElement(By.id("position"));
		Point xyvalue=getPosition.getLocation();
		int xvalue=xyvalue.getX();
		int yvalue=xyvalue.getY();
		System.out.println("xvalue"+xvalue);
		System.out.println("yvalue"+yvalue); 
		WebElement colorBox=driver.findElement(By.id("color"));
		String color=colorBox.getCssValue("background-color");
		System.out.println(color);
		WebElement sizeBox=driver.findElement(By.id("size"));
		int width=sizeBox.getSize().width;
		int height=sizeBox.getSize().height;
		System.out.println("width :"+width+"Height :"+height);
		
	}

}
