package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSolution {

    SoftAssert softAssert1 = new SoftAssert();
    SoftAssert softAssert2 = new SoftAssert();
    String className = "SoftAssertion";

    @Test
    public void test1_UsingSoftAssertion() {
        softAssert1.assertTrue(true == true);
        softAssert1.assertEquals("SoftAssert", "SoftAssertion");
        softAssert1.assertEquals(className, "SoftAssertion");
        softAssert1.assertAll();
    }

    @Test
    public void test2_UsingSoftAssertion() {
        softAssert2.assertTrue(true == true);
        softAssert2.assertEquals("SoftAssertion", "SoftAssertion");
        softAssert2.assertEquals(className, "SoftAssertion");
        softAssert2.assertAll();
    }
}