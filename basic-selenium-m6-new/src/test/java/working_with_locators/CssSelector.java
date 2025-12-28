package working_with_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/");
		
//		Thread.sleep(3000);
//		
//		WebElement username = driver.findElement(By.cssSelector("input[aria-label='Phone number, username or email address']"));
//		username.sendKeys("admin");
//		
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		
		driver.navigate().to("https://www.facebook.com/");
//		
//		String quotes = "Main string 'inner string' \" another inner string \"";
//		System.out.println(quotes);
		
		driver.findElement(By.cssSelector("#email")).sendKeys("admin");
//		driver.findElement(By.cssSelector("._6lth")).click();
		
		driver.findElement(By.cssSelector("div button")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
