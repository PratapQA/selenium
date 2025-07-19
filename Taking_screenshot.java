package seleniumpackageprograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Taking_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//upcasting driver to take sreenshot
		//Takingscreenshot with method called getScreenshotAS
		//3. create an object of fileclass
		//File f1= new File("location of new screenshot")- sorce
		//Make user of file handler
		//use its static method called copy to move file from source to destination
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();

	        // Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement searchBox = driver.findElement(By.name("q"));
	        
	        if(searchBox.isDisplayed())
	        {
	        	searchBox.sendKeys("mobiles");
	        }
	  

	        // Small wait for suggestions to load
	        Thread.sleep(1000);
	        
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File screenshot = ts.getScreenshotAs(OutputType.FILE);
	        File Destination = new File("C:\\Users\\prata\\OneDrive\\Pictures\\Screenshots\\ram"+Math.random()+".png");
	        FileHandler.copy(screenshot, Destination);
	        
		
	}

}
