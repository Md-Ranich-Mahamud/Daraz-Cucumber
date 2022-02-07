package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void navigateTo(String url) {
		driver.get(url);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	
	public static void sendKeys(By by, String searchTag) {
		driver.findElement(by).sendKeys(searchTag);
	}

}
