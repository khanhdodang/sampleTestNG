package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoadTestMultipleTestPerThread {

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @Test(invocationCount = 10, threadPoolSize = 5)
    public void testGoogleSearch() {

        System.out.printf("%n[+] Thread Id : %s is started!\n", Thread.currentThread().getId());
        WebDriver driver = new FirefoxDriver();
        Date date = null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

        String search_text = "Google Search";
        WebElement search_button = driver.findElement(By.name("btnK"));
        String text = search_button.getAttribute("value");

        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String timstamp = sdf.format(date);
        System.out.println(timstamp + " [Thread-" + Thread.currentThread().getId() + "]- Search button text is "
                + driver.getTitle());

        Assert.assertEquals(text, search_text, "Text not found!");

        System.out.printf("%n[-] Thread Id : %s Ended.\n", Thread.currentThread().getId());
        driver.quit();
    }
}