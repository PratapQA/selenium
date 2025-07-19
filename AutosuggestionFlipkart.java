package seleniumpackageprograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AutosuggestionFlipkart {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Close the login popup if it appears
        try {
            WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[text()='✕']")));
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("Login popup not shown.");
        }

        // Locate search box and enter text
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("shoes");

        // Small wait for suggestions to load
        Thread.sleep(1000);

        // Get the auto-suggestions
        List<WebElement> suggestions = wait.until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(By.xpath("//form[@action='/search']//ul/li")));

        // Print and click the first suggestion
        if (!suggestions.isEmpty()) {
            System.out.println("First suggestion: " + suggestions.get(0).getText());
            suggestions.get(0).click();
        } else {
            System.out.println("No suggestions found.");
        }

        // Optionally, close the browser
        // driver.quit();
    }
}
