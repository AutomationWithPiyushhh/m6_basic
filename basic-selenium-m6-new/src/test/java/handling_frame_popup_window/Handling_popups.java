package handling_frame_popup_window;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_popups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/popups.html");
		
		Thread.sleep(2000);
//		explicit wait => method 
		
		Alert ale = driver.switchTo().alert();
		String textOfFirstAlert = ale.getText();
		System.out.println(textOfFirstAlert);
		
		ale.sendKeys("Kushal");
		ale.accept();

//		C:\Users\User\OneDrive\Desktop\mock.pdf
		
		String path = "C:\\Users\\User\\OneDrive\\Desktop\\mock.pdf";
		
		WebElement fileUpload = driver.findElement(By.id("fileUpload"));
		fileUpload.sendKeys(path);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
