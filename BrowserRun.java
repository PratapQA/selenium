package seleniumpackageprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserRun {
    public static void main(String[] args) {
        // Set ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); // Bypass bot detection
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        
        try {
            // Open Amazon
            driver.get("https://www.amazon.com");

            // Wait for the search box to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));

            // Perform search
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes", Keys.ENTER);

            // Wait for results to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.s-main-slot")));

            System.out.println("Search completed successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
        	
        	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
            // Close browser
            driver.quit();
        }
    }
}
