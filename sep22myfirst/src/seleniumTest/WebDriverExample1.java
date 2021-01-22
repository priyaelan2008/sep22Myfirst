package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverExample1  {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\eshi\\geckodriver-v0.27.0-win64\\geckodriver.exe");
    	
    	FirefoxDriver driver = new FirefoxDriver(); //Opens FF browser
    	
    //	InternetExplorerDriver driver=new InternetExplorerDriver();
    	          
        driver.get("http://www.facebook.com"); // Enter facebook.com
        
      String tagName = driver.findElement(By.id("email")).getTagName(); // F E get tag
    	//driver.get("http://www.facebook.com"); // Enter facebook.com
        
    	//String tagName = driver.findElement(By.id("identifierId")).getTagName();

    	
    	
        System.out.println(tagName);
        
      driver.findElement(By.id("email")).sendKeys("Hello"); // Type hello in email text box
      driver.findElement(By.id("pass")).sendKeys("pass");
      driver.findElement(By.linkText("Forgot Password?")).click();
        
      // driver.findElement(By.id("identifierId")).sendKeys("elanchezhiyan2000@gmail.com"); // Type hello in email text box

        
       // driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Hello");
        
        //driver.close();
        //System.exit(0);
}
}
