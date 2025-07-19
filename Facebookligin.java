package seleniumpackageprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookligin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.facebook.com");
		//WebElement e1 =driver.findElement(By.id("email"));
		WebElement e1 =driver.findElement(By.xpath("(//input)[3]"));

		e1.sendKeys("abc@gmail.com");
		WebElement e2 =driver.findElement(By.id("pass"));
		e2.sendKeys("12345");
		WebElement e3= driver.findElement(By.xpath("//button"));
		e3.click();
		

		
	}

}
