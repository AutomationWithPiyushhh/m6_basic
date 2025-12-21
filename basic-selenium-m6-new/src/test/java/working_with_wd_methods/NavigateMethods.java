package working_with_wd_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		Navigation nav = driver.navigate();
		
//		go to facebook
		
//		URL url = new URL("https://www.facebook.com/");
//		driver.navigate().to(url);
		
		nav.to("https://www.facebook.com/");
		Thread.sleep(1000);
		
//		come back to insta
		nav.back();
		Thread.sleep(1000);
		
//		again go to fb
		nav.forward();
		Thread.sleep(1000);
		
//		refresh the page
		nav.refresh();
		Thread.sleep(1000);
		
//		come back to insta
		nav.back();
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		driver.quit();

	}
}
