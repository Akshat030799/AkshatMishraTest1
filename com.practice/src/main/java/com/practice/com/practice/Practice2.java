package com.practice.com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice2 {
	@Test
	public void akshat1() {
		System.out.println("AKS1");
		Assert.assertEquals(10, 11);
		
		
	} 
	@Test( enabled =true)
	public void akshat2() {
		
		System.out.println("AKS2");
	}
	@Test(dependsOnMethods = {"akshat1"}, priority = -100)
	public void akshat3()  {
		
		System.out.println("AKS3");
	}
	

}
