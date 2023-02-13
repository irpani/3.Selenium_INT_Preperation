package testNG_XML_File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//Q1:In frameWork also we are creating 100 of classes Are u executing It 1 by 1 ??
//Q2:What  is the Common code u will see in each & every class  ?
//Q3:Don't u think setup() Method and TearDown() method almost same ? Yes or No ?
//This is the bioler plate code returning again & again so What we will do ?
//What is the Solution for that ?

//Q:Problem here is we need to run 3 classes individually sol for that it testNg.xml
//testNgxml:- With the help of it we wil bundled these classes will start executing  ...

//Q: Where Should I create xml file ?
//A: XML file is not a JAVA code ... I should Create src/main/java or src/test/java ???

//Both (1),& (2) are related to JAVA related code only ....
//(1).src/main/java  is  for JAVA Libraries 
//(2).src/test/java  is for testNg test related code
// Q:Where Should I write xml file ? It is not a JAVA Code
//A:src/test/resources u can create anyfileName.xml So that we can run classes togehter in 1 go ...
public class GoogleTest_1 extends BaseClass_0 {

	@Test(priority = 1)
	public void searchTest() {
		// driver.get("https://www.google.com/");
		boolean flag = driver.findElement(By.linkText("हिन्दी")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void googleSearchTest() {

		boolean flag = driver.findElement(By.linkText("తెలుగు")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void urlTest() {

		String str = driver.getCurrentUrl();
		System.out.println(str);
		Assert.assertTrue(str.contains("google"));
	}

}