package seleniumpackageprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GromindsReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Set ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); // Bypass bot detection
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

      
            driver.get("https://grotechminds.com/registration/");

            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

           driver.manage().window().maximize();
           
           driver.findElement(By.name("fname")).sendKeys("pratap");
           driver.findElement(By.name("lname")).sendKeys("kumar");
           driver.findElement(By.name("email")).sendKeys("itsyourwishpratap@gmail.com");
           driver.findElement(By.name("password")).sendKeys("iqwerty123!@#");
          // driver.findElement(By.id("male")).click();

           WebElement maleRadioButton = driver.findElement(By.id("male"));
           if (!maleRadioButton.isSelected()) {
               maleRadioButton.click();
           }
           
           WebElement e1= driver.findElement(By.id("Skills"));
           Select s1=new Select(e1);
           s1.selectByVisibleText("Technical Skills");



           
	}

}
