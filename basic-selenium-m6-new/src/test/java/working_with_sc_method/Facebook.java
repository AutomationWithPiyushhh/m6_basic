package working_with_sc_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		By id = By.id("email");
		
		WebElement un = driver.findElement(id);
		un.sendKeys("admin");
		
//		Thread.sleep(3000);
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("password");

		Thread.sleep(3000);
		
//		WebElement link = driver.findElement(By.linkText("Forgotten password"));
		WebElement partialLink = driver.findElement(By.partialLinkText("F"));

//		link.click();
//		partialLink.click();
		
		
//		className => least recommended
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		
//		tagname => not recommended
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int totalLinks = links.size();
		System.out.println(totalLinks);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
