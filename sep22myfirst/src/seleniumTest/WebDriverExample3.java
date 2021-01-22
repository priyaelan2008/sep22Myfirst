package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverExample3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\eshi\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		// declaration and instantiation of objects/variables
		String baseUrl= "https://www.facebook.com/";
		
		String tagName="";
		driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getAttribute("data-testid");
        
        System.out.println(tagName);
        driver.close();
        System.exit(0);

	
		
		
	}
}