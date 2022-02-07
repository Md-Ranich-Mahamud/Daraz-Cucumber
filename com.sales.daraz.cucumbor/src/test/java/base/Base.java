package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	// Declaration of WebDriver variable
	public static WebDriver driver;
	
	// This is a navigateTo method
	public static void navigateTo(String url) {
		driver.get(url);
	}
	
	// This is a click method
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	// This is a sendKeys method
	public static void sendKeys(By by, String searchTag) {
		driver.findElement(by).sendKeys(searchTag);
	}

}
