package handling_frame_popup_window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/frames.html");

//		driver.switchTo().frame(0);
//		driver.switchTo().frame("frame_a");

//		WebElement frameEle = driver.findElement(By.cssSelector("iframe[class='depth-0 h-48']"));
//		driver.switchTo().frame(frameEle);

//		driver.switchTo().frame("frame_d");		
//		driver.switchTo().frame("frame_h");
//		driver.switchTo().frame("frame_i");
//		driver.switchTo().frame("frame_j");

		driver.switchTo().frame("frame_d").switchTo().frame("frame_h").switchTo().frame("frame_i").switchTo()
				.frame("frame_j");

//		driver.switchTo().parentFrame();

		driver.findElement(By.id("secret_code")).sendKeys("12345678");

		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame_a");
		
		driver.findElement(By.tagName("input")).sendKeys("Dingesh");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
