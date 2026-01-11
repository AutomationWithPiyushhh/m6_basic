package working_with_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuApp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

//		implicit wait
		WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
		remove.click();

		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();

//		explicit wait

		WebElement enable = driver.findElement(By.xpath("//button[text()='Enable']"));
		enable.click();

		WebElement input = driver.findElement(By.cssSelector("input[type='text']"));

//		make this input clickable
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.elementToBeClickable(input));
		
//		FluentWait wait = new FluentWait(driver);
//		wait.withTimeout(Duration.ofSeconds(15));
//		wait.pollingEvery(Duration.ofMillis(100));
//		wait.ignoring(ElementNotInteractableException.class);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(input));


		
		input.sendKeys("1234567");

		Thread.sleep(5000);
		driver.quit();
	}
}
