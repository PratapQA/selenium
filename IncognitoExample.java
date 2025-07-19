package seleniumpackageprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoExample {
    public static void main(String[] args) {
        // Set Chrome options to open in Incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // Initialize WebDriver with Chrome options
        WebDriver driver = new ChromeDriver(options);

        // Open a website in Incognito mode
        driver.get("https://www.amazon.com");
        //System.out.println(driver.getWindowHandles());
        //System.out.println(driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
       // driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        // Close the browser
       // driver.quit();
    }
}
