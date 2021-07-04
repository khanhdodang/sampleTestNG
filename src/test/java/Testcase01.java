import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase01 {

    @Test
    public void testLoginChrome() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(message.contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void testLoginFirefox() {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(message.contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void testLoginSafari() throws InterruptedException {
        WebDriver driver = new SafariDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);
        String message = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(message.contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void testLoginOpera() {
        WebDriver driver = new OperaDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(message.contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void testLoginChromeHeadless() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(message.contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void testLoginFirefoxHeadless() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(message.contains("You logged into a secure area!"));

        driver.quit();
    }
}
