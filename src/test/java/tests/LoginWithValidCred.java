package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName-value")));

        Assert.assertTrue(userLabel.isDisplayed(), "Login failed");

    }
}
