package seleniumpackageprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosugFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();

	        // Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("shoes");

	        // Small wait for suggestions to load
	        Thread.sleep(1000);

	        // Get the auto-suggestions
	        List<WebElement> suggestions = driver.findElements(By.xpath("//form[@action='/search']//ul/li"));
	        suggestions.get(2).click();
	}

}
