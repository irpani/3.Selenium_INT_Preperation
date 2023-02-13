package testNg_More_Features;

import org.testng.annotations.Test;

public class Invocation_Count_Test_4 {

	// I want to run this test 10 times What I will do ?
	// I cann't write same test 10 times so what I will do
	// invocation Count in testNg u can usse this ...
	// In testNg we never do Method Overloading ... who will Supply the data from
	// these methods ???
	// So that's y we never use that ....

	// Q:Any Special Case Of Invocation Count ??
	// A: We Can use this in Api Testing ,want to create user back to back
	// Invocation Count 100 --- created 100 users immediately ...
	@Test(invocationCount = 10)
	public void getUserInfoTest() {

		System.out.println("get user ....");

	}

}
