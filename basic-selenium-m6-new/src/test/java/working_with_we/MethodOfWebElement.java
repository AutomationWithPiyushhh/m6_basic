package working_with_we;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("admin");

		Thread.sleep(1000);

		fn.clear();

		Thread.sleep(1000);

		fn.sendKeys("admin123");

		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input"));

		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			maleRadio.click();
			if (maleRadio.isSelected()) {
				System.out.println("Male radio is selected...");
			}
		}

		Thread.sleep(1000);

		WebElement signup = driver.findElement(By.name("websubmit"));
//		signup.click();

		String tag = signup.getTagName();
		String id = signup.getAttribute("id");
		String cv = signup.getCssValue("font-family");
		String vt = signup.getText();

		System.out.println(tag);
		System.out.println(id);
		System.out.println(cv);
		System.out.println(vt);

		Dimension dim = signup.getSize();
		Point pt = signup.getLocation();
		Rectangle rect = signup.getRect();

		System.out.println(dim);
		System.out.println(pt);
		System.out.println(rect.getDimension());
		System.out.println(rect.getPoint());
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

		if (signup.isEnabled()) {
			signup.submit();
		} else {
			System.out.println("signup is not clickable...");
		}

		Thread.sleep(5000);
		driver.quit();
	}
}
