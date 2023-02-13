package testNg_More_Features;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept_2 {
	String name = "Tom";

	// __Case :1_//In this case we will get java.lang.ArithmeticException: / by 0
	@Test
	public void loginTest() {
		System.out.println("login test .....");
		int i = 9 / 0;
	}

	// ______Case :2_____ In this case Exception Handld Successfully
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest1() {

		System.out.println("login test .....");
		int i = 9 / 0;

	}

	// ______Case :3_____ In this case we will get Null Pointer Exception
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest2() {

		System.out.println("login test .....");
		// int i = 9 / 0;

		ExpectedExceptionConcept_2 obj = new ExpectedExceptionConcept_2();
		obj = null; // because we declare it as null
		System.out.println(obj.name);// get Null Pointer Exception

	}

	// ______Case :4_____ Q: Can we handle 2 Exceptions At a Time A: Yes
	// expectedExceptions return type is Array Of Arguments ....
	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void loginTest3() {

		System.out.println("login test .....");
		// int i = 9 / 0;
		ExpectedExceptionConcept_2 obj = new ExpectedExceptionConcept_2();
		obj = null; // because we declare it as null
		System.out.println(obj.name);// get Null Pointer Exception

	}

	// ______Case :5_____ Q: No exception in code but expecting these 2 exceptions
	// In this case we will get Test Exception
	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void loginTest4() {

		System.out.println("login test .....");
		// int i = 9 / 0;
		ExpectedExceptionConcept_2 obj = new ExpectedExceptionConcept_2();
		// obj = null; //because we declare it as null
		System.out.println(obj.name);//

	}

	// ______Case :6_____ You can also write like Super class Of exception

	@Test(expectedExceptions = Exception.class)
	public void loginTest5() {

		System.out.println("login test .....");
		// int i = 9 / 0;
		ExpectedExceptionConcept_2 obj = new ExpectedExceptionConcept_2();
		// obj = null; //because we declare it as null
		System.out.println(obj.name);//

	}

	// ______Case :7____ You can also write like Super class Of exception

	@Test(expectedExceptions = Throwable.class)
	public void loginTest6() {

		System.out.println("login test .....");
		// int i = 9 / 0;
		ExpectedExceptionConcept_2 obj = new ExpectedExceptionConcept_2();
		// obj = null; //because we declare it as null
		System.out.println(obj.name);//

	}

	// ______Case :_8___can we Write try{} Catch(){} Block -- It is a feature Of
	// Java So in this case line no 97 handled exception with try{} catch(){} will
	// not work

	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void loginTest7() {

		System.out.println("login test .....");
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		ExpectedExceptionConcept_2 obj = new ExpectedExceptionConcept_2();
		// obj = null; //because we declare it as null
		System.out.println(obj.name);//

	}

}
