package com.practice2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AkshatPratice2 {

	@BeforeMethod
	public void AkshatFirsttest1() {
		System.out.println("Before Method of 2");
	}

	@AfterTest
	public void AkshatFirsttest2() {
		System.out.println("After Test of 2");
	}

	@BeforeTest
	public void AkshatFirsttest3() {
		System.out.println("Before Test of 2");
	}

	@AfterMethod
	public void AkshatFirsttest4() {
		System.out.println("After Method of 2");

	}

	@AfterSuite
	public void AkshatFirsttest5() {
		System.out.println("After Suite of 2");
		
	}
	@BeforeSuite
	public void AkshatFirsttest6() {
		System.out.println("Before Suite of 2");
		
	}

	@BeforeClass
	public void AkshatFirsttest7() {
		System.out.println("Before Class of 2");
		
	}

	@AfterClass
	public void AkshatFirsttest8() {
		System.out.println("After Class of 2");
		
	}

	@Test (priority=1)
	public void AkshatFirsttest9() {
		System.out.println("Test 1 of 2");
		
	}

	@Test (priority=2)
	public void AkshatFirsttest10() {
		System.out.println("Test 2 of2");
		
	}
}
