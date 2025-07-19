package seleniumpackageprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	        // Initialize WebDriver with options
	        WebDriver driver = new ChromeDriver();

	       /* try { */
	            // Open Amazon
	       driver.get("https://www.google.com/");
	           
	            Thread.sleep(9000);
	            
	            driver.manage().window().maximize();
	          WebElement e1=  driver.findElement(By.name("q"));
	          e1.sendKeys("Banglore"); 
	          Thread.sleep(1000);
	          
	   List<WebElement> e2= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

	   e2.get(1).click();
	        //  int count= e2.size();
	    //System.out.println(count);
		
		
	}

}
