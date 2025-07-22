package tests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TakeScreenShot 
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/login");
	driver.manage().window().maximize();
//	TakeScreenShot ts = (TakeScreenShot) driver;
//	File src = ts.getScreenshotAs(OutputType.FILE);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("login_screenshot.png");
	try {
		Files.copy(src.toPath(), dest.toPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Screen shot captured in the login page");
	driver.quit();
	
	

	
	 
}
	
}