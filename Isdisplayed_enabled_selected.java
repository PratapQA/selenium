package seleniumpackageprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Isdisplayed_enabled_selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Set ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); // Bypass bot detection
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

       /* try { */
            // Open Amazon
            driver.get("https://www.flipkart.com");
          WebElement e1=  driver.findElement(By.className("Pke_EE"));
          
        //  e1.sendKeys("shoes"+Keys.ENTER);
            //if (e1.isDisplayed());
        
          if (e1.isDisplayed()&&e1.isEnabled());

            {
            	
            	e1.sendKeys("shoes"+Keys.ENTER);
            }

		WebElement e3= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/label[1]/div[1]"));
		
		if(e3.isSelected())
		{
			
			System.out.println("ceckbox is selected");
		}
		
		else
		{
			System.out.println("checkbox is not selected lets select it");
		e3.click();
		}
		
		
		
	}

}
