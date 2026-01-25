package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String url1 = "https://www.facebook.com/";
		
		jse.executeScript("window.location=arguments[0];", url1);

//		scroll to particular element
//		WebElement element = driver.findElement(By.cssSelector("span[class='text-subHeading']"));
//		
//		jse.executeScript("arguments[0].scrollIntoView(boolean);", element);
		
//		type something on username
		WebElement un = driver.findElement(By.id("email"));
		
		String unValue = "admin";
//		System.out.println(unValue);
//		System.out.println("unValue");
		
//		un.sendKeys("admin");
//		jse.executeScript("arguments[0].value='admin';", un);

		jse.executeScript("arguments[0].value=arguments[1];", un, unValue);
//								WE			   value
	
		Thread.sleep(2000);
		
//		click on particular element
		WebElement loginBtn = driver.findElement(By.name("login"));
		
//		loginBtn.click();
		jse.executeScript("arguments[0].click();", loginBtn);
		
		
		
		

		Thread.sleep(5000);
		driver.quit();

	}
}
