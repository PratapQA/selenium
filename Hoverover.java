package seleniumpackageprograms;

import java.time.Duration;

import org.bouncycastle.jce.provider.BrokenJCEBlockCipher.BrokePBEWithSHA1AndDES;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Set ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); // Bypass bot detection
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

      
            driver.get("https://www.amazon.in");

            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

           driver.manage().window().maximize();
            
           WebElement el = driver.findElement(By.id("nav-link-amazonprime"));
            
            Actions a1= new Actions(driver);
            a1.moveToElement(el).perform();

           

      //driver.quit();
		
	}

}
