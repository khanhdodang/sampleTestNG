package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertIssue {

    SoftAssert softAssert = new SoftAssert();
    String className = "SoftAssertion";

    @Test
    public void test1_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        softAssert.assertAll();
    }

    @Test
    public void test2_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssertion", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        softAssert.assertAll();
    }
}
