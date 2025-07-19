package seleniumpackageprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Allthelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		
		  
        driver.get("https://www.google.com/");

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       driver.manage().window().maximize();
   List<WebElement> e1=   driver.findElements(By.tagName("a"));
   int count =e1.size();
   System.out.println(count);
   for(int i=0;i<count;i++)
   {
   WebElement link1 = e1.get(i);
   			String url=	link1.getAttribute("href");
   			String text = link1.getText();
   			System.out.println("My Url at index position"+ i );
   				System.out.println(url);
   			System.out.println("Mytext at index position"+ i);
   			System.out.println(text);
   
   
	}

}}
