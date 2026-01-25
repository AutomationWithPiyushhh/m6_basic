package working_with_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBook {
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		downcast
		TakesScreenshot tks = (TakesScreenshot) driver;

//		getScreenshotAs()
		File source = driver.getFullPageScreenshotAs(OutputType.FILE);
		/*
		 * Obtain the screenshot into a temporary file that will be deleted once the JVM
		 * exits. It is up to users to make a copy of this file.
		 */

//		get the java rep. object of the dummy physical file
		
//		File destination = new File("C:/Users/User/git/m6_basic-new/basic-selenium-m6-new/errorshots/dummy2.png");
		File destination = new File("./errorshots/dummy2.png"); // . means project level

		FileHandler.copy(source, destination);

		System.out.println("ss taken successfullyy !!!");

		driver.quit();
	}
}
