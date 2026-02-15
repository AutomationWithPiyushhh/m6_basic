package handling_frame_popup_window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_notification_popup {
	public static void main(String[] args) throws InterruptedException {
		
//		ChromeOptions setting = new ChromeOptions();
//		setting.addArguments("--disable-notifications");
//		setting.addArguments("--start-maximized");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.easemytrip.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		Thread.sleep(7000);
		driver.quit();
	}
}
