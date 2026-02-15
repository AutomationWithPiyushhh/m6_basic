package handling_frame_popup_window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_windows {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/popups.html");

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

//		step 1 => get the home address/parent session id
		String PID = driver.getWindowHandle();

//		step 2 => perform the task which will open new win/s
		driver.findElement(By.xpath("//button[@onclick='openMultipleWindows()']")).click();

//		step 3 => get all the win addresses/ session IDs
		Set<String> CIDs = driver.getWindowHandles();

//		step 4 => switch to all  the windows and break the loop where condition meets
		for (String i : CIDs) {
			driver.switchTo().window(i);
			if (driver.getCurrentUrl().contains("flipkart")) {
				break;
			}
		}

//		step 5 => perform the task on target window
		Thread.sleep(2000);
		driver.close();

//		step 6 => get back home
		Thread.sleep(3000);
		driver.switchTo().window(PID);

//		close the main window
		Thread.sleep(2000);
		driver.close();

//		quit the server
		Thread.sleep(2000);
		driver.quit();
	}
}
