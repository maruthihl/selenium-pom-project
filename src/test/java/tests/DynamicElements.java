package tests;

import java.awt.Window;
import java.awt.event.WindowStateListener;
import java.lang.constant.Constable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements 
{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/dynamic-properties");
	driver.manage().window().maximize();
	
	WebElement targetElement = driver.findElement(By.id("visibleAfter"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoview(true);",targetElement);
	
}
}

