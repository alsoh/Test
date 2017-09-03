package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Learn\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		//capabilities.setCapability("marionette", true);
		//WebDriver driver = new FirefoxDriver(capabilities);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/Test/NewFile.html");
		
		WebElement link = driver.findElement(By.id("promptBox"));
		link.click();
		System.out.println("Successfully opened the website");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
