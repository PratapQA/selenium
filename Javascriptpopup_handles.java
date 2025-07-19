package seleniumpackageprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascriptpopup_handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 ChromeDriver driver = new ChromeDriver();
		
		
		  
       driver.get("file:///C:/Users/prata/Downloads/registration.html");
       driver.switchTo().alert().accept();

       
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

      driver.manage().window().maximize();
      
     WebElement e1=  driver.findElement(By.id("name"));
    e1.sendKeys("abc");
    WebElement e2=  driver.findElement(By.id("email"));
      e2.sendKeys("abc@gmail.com");
      WebElement e3=  driver.findElement(By.id("password"));
      e3.sendKeys("system123#");
      WebElement e4 = driver.findElement(By.id("country"));
      Select s1 = new Select(e4);
      s1.selectByValue("india");
      WebElement upload=  driver.findElement(By.id("file"));
      upload.sendKeys("C:\\Users\\prata\\Downloads\\abc.txt");
      WebElement checkbox=  driver.findElement(By.id("agree"));
      checkbox.click();
      
		
		
	}

}
