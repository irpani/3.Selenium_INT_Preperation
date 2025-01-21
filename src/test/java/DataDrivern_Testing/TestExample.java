package DataDrivern_Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExample {

    // DataProvider method
    @DataProvider(name = "testData")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
            { "John", 25 },  // Test case 1
            { "Alice", 30 }, // Test case 2
            { "Bob", 22 }    // Test case 3
                              };
    }

    // Test method using the DataProvider
    @Test(dataProvider = "testData")
    public void testWithData(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}