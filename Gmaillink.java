package seleniumpackageprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmaillink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.com");
	WebElement e1=	driver.findElement(By.linkText("Gmail"));
		e1.click();
	Actions a1= new Actions(driver);
	a1.doubleClick(e1).perform();
		
	Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	

	}

}
