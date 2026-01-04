package working_with_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
		remove.click();
		
		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
