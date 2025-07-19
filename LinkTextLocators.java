package seleniumpackageprograms;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LinkTextLocators {
    public static void main(String[] args) {
        // Set ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); // Bypass bot detection
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

       /* try { */
            // Open Amazon
            driver.get("https://www.amazon.in");

            // Wait for page to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find and click the "Mobiles" link (Use correct text or partial text)
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Mobiles")));
            el.click();

            System.out.println("Clicked on 'Mobiles' link successfully!");
/*
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close browser
            ///
             */
            driver.quit();
        
        }
    }

