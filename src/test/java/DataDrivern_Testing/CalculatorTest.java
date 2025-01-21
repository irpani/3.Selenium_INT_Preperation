package DataDrivern_Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    // DataProvider method to supply test data
    @DataProvider(name = "additionData")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
            {2, 3, 4},      // Test case 1: 2 + 3 = 5
            {10, 20, 30},  // Test case  2: 10 + 20 = 30
            {-1, 1, 0},   // Test case   3: -1 + 1 = 0
            {5, 5, 10}    // Test case   4: 5 + 5 = 10
        };
    }

    // Test method using the data provider
    @Test(dataProvider = "additionData")
    public void testAddition(int a, int b, int expectedSum) {
        int actualSum = a + b;
        // Assertion to check if the actual sum is as expected
        Assert.assertEquals(actualSum, expectedSum, "Addition result is incorrect!");
    }
}
