package com.practice.com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAkshat1 {
	
@BeforeMethod
public void AkshatFirsttest1() {
	System.out.println("Before Method");
	}
@AfterTest	
public void AkshatFirsttest2() {
	System.out.println("After Test");
	}

@BeforeTest
public void AkshatFirsttest3() {
	System.out.println("Before Test");
	}
@AfterMethod
public void AkshatFirsttest4() {
	System.out.println("After Method");
	
}

@AfterSuite
public void AkshatFirsttest5() {
	System.out.println("After Suite");
	
}
@BeforeSuite
public void AkshatFirsttest6() {
	System.out.println("Before Suite");
	
}

@BeforeClass
public void AkshatFirsttest7() {
	System.out.println("Before Class");
	
}

@AfterClass
public void AkshatFirsttest8() {
	System.out.println("After Class");
	
}

@Test (priority=1)
public void AkshatFirsttest9() {
	System.out.println("Test 1");
	
}

@Test (priority=2)
public void AkshatFirsttest10() {
	System.out.println("Test 2");
	
}



}






