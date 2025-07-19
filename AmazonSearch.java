package seleniumpackageprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
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
	            driver.navigate().refresh();

	            // Find and click the "Mobiles" link (Use correct text or partial text)
	            WebElement el = driver.findElement(By.id("twotabsearchtextbox"));
	            el.sendKeys("shoes"+ Keys.ENTER);
	            WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	            e2.click();
	            Set<String> pc = driver.getWindowHandles();
	            System.out.println(pc);
	            Iterator <String> it = pc.iterator();
	   	     String parentid = it.next();
	   	     String childid= it.next();
	   	     System.out.println(parentid);
	   	     System.out.println(childid);
	   	     driver.switchTo().window(childid);
	   	     Thread.sleep(2000);
	   	     
	   	 WebElement e4=    driver.findElement(By.id("add-to-cart-button"));
	            e4.click();
	            
	/*
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            // Close browser
	            ///
	             */
	}

}
