package seleniumpackageprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestionpracto {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
        searchBox.sendKeys("physician");

        // Wait until suggestions are visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'c-omni-suggestion-item')]")));

        boolean found = false;

        // Loop through suggestions by index, and re-fetch each suggestion element before using
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[contains(@class, 'c-omni-suggestion-item')]"));
        for (int i = 0; i < suggestions.size(); i++) {
            // Re-locate the suggestion in each loop to avoid stale reference
            WebElement suggestion = driver.findElements(By.xpath("//div[contains(@class, 'c-omni-suggestion-item')]")).get(i);
            String text = suggestion.getText();
            System.out.println("Suggestion: " + text);
            if (text.contains("General Physician")) {
                suggestion.click(); // Only click on a freshly fetched element
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("General Physician not found.");
        }

        // Optional: driver.quit();
    }
}
