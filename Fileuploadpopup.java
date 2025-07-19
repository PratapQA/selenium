package seleniumpackageprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileuploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
		
		
		  
        driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       driver.manage().window().maximize();
      WebElement e1=  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[1]"));
       e1.sendKeys("C:\\Users\\prata\\Downloads\\abc.txt");
       
	}

}
