package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

//		Actions => click()
		Actions act = new Actions(driver);

//		click
//		WebElement exit = driver.findElement(By.partialLinkText("Exit"));
//		act.moveToElement(exit).build().perform();
//		act.click().build().perform();
//		or
//		act.click(exit).build().perform();

//		right click
//		WebElement right = driver.findElement(By.id("context-area"));
//		act.moveToElement(right).build().perform();		
//		act.contextClick().build().perform();4
//		or
//		act.contextClick(right).build().perform();

		
//		double click
//		WebElement doubleEle = driver.findElement(By.id("double-click-target"));
//		act.moveToElement(doubleEle).perform();
//		act.doubleClick().build().perform();
//		or
//		act.doubleClick(doubleEle).build().perform();

//		click and hold
//		WebElement hold = driver.findElement(By.id("hold-target"));
//		act.clickAndHold().build().perform();
//		or
//		act.clickAndHold(hold).build().perform();
		
//		Thread.sleep(2500);
//		
//		release
//		act.release().build().perform();
//		or
//		act.release(hold).build().perform();

//		WebElement source = driver.findElement(By.id("drag-source"));
//		WebElement dest = driver.findElement(By.id("drop-target"));
//
//		scroll 
//		act.scrollByAmount(0, 100).build().perform();
//		act.scrollToElement(dest).build().perform();
//		
//		drag and drop
//		act.dragAndDrop(source, dest).build().perform();
//		act.dragAndDropBy(source, 0, 200).build().perform();
		
//		WebElement slider = driver.findElement(By.id("precision-seekbar"));

//		hover (Slider)
//		act.moveToElement(slider).moveByOffset(20, 0).click().build().perform();
//		act.moveToElement(slider, w, 0).click().build().perform();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
			
//		write something in un
		act.sendKeys("admin@123").build().perform();
		
//		act.sendKeys( "" + Keys.BACK_SPACE +  Keys.BACK_SPACE + Keys.BACK_SPACE + Keys.BACK_SPACE).build().perform();

//		ctrl + a 
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

//		jp
		Thread.sleep(1000);
		
//		tab
//		act.sendKeys(Keys.TAB).build().perform();
		
//		act.keyDown(Keys.TAB).perform();
//		act.keyUp(Keys.TAB).perform();
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
				
		
//		write something in pwd
		act.sendKeys("admin@123").build().perform();
		
//		ctrl + a

		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
