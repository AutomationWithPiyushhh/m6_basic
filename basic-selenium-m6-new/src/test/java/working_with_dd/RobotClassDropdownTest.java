package working_with_dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClassDropdownTest {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			driver.get("https://automationwithpiyush.vercel.app/dropdown.html");

			driver.findElement(By.id("mode-btn")).click();

			WebElement robotArea = driver.findElement(By.id("robot-dropdown"));
			robotArea.click();

			Robot robot = new Robot();
			robot.setAutoDelay(500); 
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

			robot.delay(500);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			System.out.println("Done !!!");

		} finally {
			Thread.sleep(3000);
			driver.quit();
		}
	}
}