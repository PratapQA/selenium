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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

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
           
           //first find the element where dropdown exists under amazon.com and locate it with e1
           // we can locate them with id =searchDropdownBox
     WebElement e1= driver.findElement(By.id("searchDropdownBox"));
     Select s1=new Select(e1);
     //s1.selectByIndex(1);//index starts with 0//1st option
     //s1.selectByValue("search-alias=alexa-skills");// it is the value wrt the the dropdown visible text name//2nd option
     s1.selectByVisibleText("Alexa Skills");
     
     
           
          
		
	}

}
