package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxYouTubeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eshi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
WebElement cplus = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input"));
cplus.click();
WebElement selenium=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input"));
Boolean seleniumSelected=selenium.isSelected();
System.out.println(seleniumSelected);
WebElement first= driver.findElement(By.
		xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
if(first.isSelected()) {
	first.click();
}
WebElement second=driver.findElement(By.
		xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
if(second.isSelected()) {
	second.click();
}
WebElement multipleselect1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
multipleselect1.click();
WebElement multipleselect2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
multipleselect2.click();
WebElement multipleselect3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
 multipleselect3.click();
	}

}
