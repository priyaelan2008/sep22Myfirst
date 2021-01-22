package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\eshi\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		// declaration and instantiation of objects/variables
		String baseUrl= "https://www.facebook.com/";
		String expectedTitle="Facebook - Log In or Sign Up";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		System.out.println("actualTitle"+actualTitle);

		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test passed");
		
		} 
		else {
			System.out.println("Test Failed");
		}
	driver.close();
	System.exit(0); 
	
		
		
	}
}