package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.facebook.com/");

//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.location='https://www.facebook.com/';");
//		Thread.sleep(1000);
//		jse.executeScript("window.location='https://www.zomato.com/';");
//		Thread.sleep(1000);
//		jse.executeScript("window.location='https://www.instagram.com/';");

		String url1 = "https://www.facebook.com/";
		String url2 = "https://www.zomato.com/";
		String url3 = "https://www.instagram.com/";

//		jse.executeScript("window.location=arguments[0];", url2, url1);
//		Thread.sleep(1000);

//		jse.executeScript("window.location=arguments[0];", url3, url2);
//		Thread.sleep(1000);
		jse.executeScript("window.location=arguments[0];", url2, url1);

//		scrolling
//		scrollBy(x,y) => relative scrolling
//		scrollTo(x,y) => absolute scrolling

//		jse.executeScript("window.scrollTo(0,500);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
		
//		scroll to particular element
		
		WebElement element = driver.findElement(By.cssSelector("span[class='text-subHeading']"));
		
//		Actions act = new Actions(driver);
//		act.scrollToElement(element).build().perform();
		
		jse.executeScript("arguments[0].scrollIntoView(boolean);", element);
			
		
		

		Thread.sleep(5000);
		driver.quit();

	}
}
