package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomeDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:\\Users\\User\\git\\m6_basic-new\\basic-selenium-m6-new\\src\\test\\java\\HTML\\dd.html");

//		dd element ka object
		WebElement stuDD = driver.findElement(By.id("student"));

//		Select class ka object
		Select selStud = new Select(stuDD);

//		perform the task
		selStud.selectByIndex(2);

//		dd element ka object
		WebElement carDD = driver.findElement(By.id("car"));

//		Select class ka object
		Select selCar = new Select(carDD);

//		perform the selection task
		selCar.selectByIndex(0);
		selCar.selectByValue("second");
		selCar.selectByVisibleText("Naya Vala Verna");

//		get all the students
		List<WebElement> students = selStud.getOptions();

		for (WebElement i : students) {
			String text = i.getText();
//			System.out.println(text);
		}

//		get all the students
		List<WebElement> cars = selCar.getOptions();

		for (WebElement i : cars) {
			String text = i.getText();
//			System.out.println(text);
		}

//		miscellaneous
		WebElement first = selCar.getFirstSelectedOption();
		System.out.println(first.getText());

		List<WebElement> all = selCar.getAllSelectedOptions();
		for (WebElement i : all) {
			System.out.println(i.getText());
		}

//		deselection
		if (selStud.isMultiple()) {
			selStud.deselectAll();
		}

		if (selCar.isMultiple()) {
			selCar.deselectAll();
		}

		Thread.sleep(3000);
		
		driver.quit();
	}
}
