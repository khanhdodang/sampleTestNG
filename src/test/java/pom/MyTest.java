package pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends TestBase {

    // Test-0. (disabled)
    @Test(enabled = false)
    public void testPageObject() throws Exception {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(baseUrl);

        chapterSecond = homePage.clickChapterSecond();
        chapterSecond.clickbut2();
        chapterSecond.clickRandom();
        String data = chapterSecond.getTest();
        homePage = chapterSecond.clickIndex();

        chapterFirstPage = homePage.clickChapterFirst();
        chapterFirstPage.clickSecondAjaxButton();
        chapterFirstPage.clickSecondAjaxButton1(data);
        chapterFirstPage.selectDropDown("Selenium Core");
        chapterFirstPage.verifyButton();
    }

    // Test-1.
    @Test
    public void testAssertSuccess() throws Exception {

        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(baseUrl);
        Thread.sleep(1000); // Intentional pause.

        chapterFirstPage = homePage.clickChapterFirst();
        Thread.sleep(500); // Intentional pause.

        chapterFirstPage.selectDropDown("Selenium Core");
        Thread.sleep(1000); // Intentional pause.

        Assert.assertEquals("Selenium Core", chapterFirstPage.getDropDownText());
    }

    // Test-2.
    @Test
    public void testAssertTrue() throws Exception {

        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(baseUrl);
        Thread.sleep(1000); // Intentional pause.

        chapterFirstPage = homePage.clickChapterFirst();
        Thread.sleep(500); // Intentional pause.

        chapterFirstPage.selectDropDown("Selenium Core");
        Thread.sleep(1000); // Intentional pause.

        Assert.assertTrue(chapterFirstPage.getDropDownText().equalsIgnoreCase("Selenium Core"));
    }

    // Test-3.
    @Test
    public void testAssertFailure() throws Exception {

        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(baseUrl);
        Thread.sleep(1000); // Intentional pause.

        chapterFirstPage = homePage.clickChapterFirst();
        Thread.sleep(500); // Intentional pause.

        chapterFirstPage.selectDropDown("Selenium Core");
        Thread.sleep(1000); // Intentional pause.

        Assert.assertEquals("Selenium RC", chapterFirstPage.getDropDownText());
    }

    // Test-4.
    @Test
    public void testAssertFailureWithMessage() throws Exception {

        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(baseUrl);
        Thread.sleep(1000); // Intentional pause.

        chapterFirstPage = homePage.clickChapterFirst();
        Thread.sleep(500); // Intentional pause.

        chapterFirstPage.selectDropDown("Selenium Core");
        Thread.sleep(1000); // Intentional pause.

        Assert.assertEquals("Selenium RC", chapterFirstPage.getDropDownText(), "Invalid Component Selected!!!\n\t");
    }
}