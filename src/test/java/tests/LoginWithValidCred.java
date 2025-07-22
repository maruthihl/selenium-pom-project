package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.ScreenshotListener;

@Listeners(ScreenshotListener.class)
public class LoginWithValidCred extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        test = extent.createTest("Login With Valid Credentials");

        driver.findElement(By.id("userName")).sendKeys("maruthi");
        driver.findElement(By.id("password")).sendKeys("Maruthi@0806");

        WebElement loginBtn = driver.findElement(By.id("login"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);

        boolean isDisplayed = driver.findElement(By.id("userName-value")).isDisplayed();
        Assert.assertTrue(isDisplayed, "Login failed");
    }
}
