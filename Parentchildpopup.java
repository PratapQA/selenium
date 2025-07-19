	package seleniumpackageprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parentchildpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
			
			
		  
	        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	       driver.manage().window().maximize();
	      WebElement e1=  driver.findElement(By.xpath("//span[.='Google']"));
	       e1.click();
	      Set<String> pc= driver.getWindowHandles();
	      System.out.println(pc);
	      Iterator <String> it = pc.iterator();
	     String parentid = it.next();
	     String childid= it.next();
	     System.out.println(parentid);
	     System.out.println(childid);
	     driver.switchTo().window(childid);
	     Thread.sleep(2000);
		driver.close();//here it will close child id
	}

}
