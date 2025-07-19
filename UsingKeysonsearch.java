package seleniumpackageprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingKeysonsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); // Bypass bot detection
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

      
            driver.get("https://www.google.in");

            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

           driver.manage().window().maximize();
           
           driver.findElement(By.name("q")).sendKeys("IPLL");
           driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
           driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
           driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
           driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
           driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"c");
           driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"v");
           driver.findElement(By.name("q")).sendKeys(Keys.ENTER);




           
            
         //  WebElement el = driver.findElement(By.id("nav-link-amazonprime"));
            
		
		
		
	}

}
