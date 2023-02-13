package testNg_More_Features;

import org.testng.annotations.Test;

public class Priority_Concept_1 {
	// Case(1):
	// Still we discussed Test cases Executed => @Test_1 @Test_2 ...@Test_100 based
	// Based On Alphabetical Order .....

	// Case(2): I will give my Own Priority also let's discuss that ...

	@Test(priority = 1)
	public void a_test() {
		System.out.println("a test");

	}

	@Test(priority = 1)
	public void b_test() {
		System.out.println("b test");

	}

	@Test(priority = 1)
	public void c_test() {
		System.out.println("c test");

	}

	@Test
	public void d_test() {
		System.out.println("d test");

	}

	@Test
	public void e_test() {
		System.out.println("e test");

	}

}
