import org.testng.annotations.Test;

public class Groups2 {
    @Test(groups = {"Include Group"})
    public void test_case1() {
        System.out.println("This is test case 1");
    }

    @Test(groups = {"Include Group"})
    public void test_case2() {
        System.out.println("This is test case 2");
    }

    @Test(groups = {"Exclude Group"})

    public void test_case3() {
        System.out.println("This is test case 3");
    }
}

