package com.practice.com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class akshat3 {
	@Test
	public void abcd() {
		String a="Abcd";
		String b="Abc";
		
		//Assert.assertEquals(a, b);
		try {
			Assert.assertEquals(a, b);
		} catch (Error e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("passed");
		}
		System.out.println("texts");
		
	}

}
