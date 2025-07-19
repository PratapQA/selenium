package seleniumpackageprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosugessionAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		Thread.sleep(9000);
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.name("field-keywords"));
		Thread.sleep(1000);
		e1.sendKeys("shoes");
		Thread.sleep(1000);
List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
e2.get(1).click();

//int count =e2.size();
//System.out.println(count);
		 
		
		

	}

}
