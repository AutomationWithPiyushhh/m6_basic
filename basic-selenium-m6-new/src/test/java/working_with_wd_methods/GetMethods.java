package working_with_wd_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
//		ctrl + f11

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/"); // fully qualified path

		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		Thread.sleep(5000);
		
		driver.quit(); 
	}
}
