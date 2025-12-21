package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLineOfCode {
	public static void main(String[] args) {
		/*
		 * 1. it will open the empty browser 
		 * 2. it will start the server. 
		 * 3. it will load, reg. and re-initialize the N.S. members
		 */

		/*
		 * ChromeDriver cd = new ChromeDriver();
		 * 
		 * EdgeDriver ed = new EdgeDriver();
		 * 
		 * FirefoxDriver ffd = new FirefoxDriver();
		 */

	
		/* Upcasting
		 * RemoteWebDriver cd = new ChromeDriver();
		 * 
		 * RemoteWebDriver ed = new EdgeDriver();
		 * 
		 * RemoteWebDriver ffd = new FirefoxDriver();
		 */
		
		/* PolyMorphism
		 * RemoteWebDriver driver = new ChromeDriver();
		 * 
		 * driver = new EdgeDriver();
		 * 
		 * driver = new FirefoxDriver();
		 */
		
		WebDriver driver = new ChromeDriver();

				  driver = new EdgeDriver();

				  driver = new FirefoxDriver();

				  
		
	}
}
