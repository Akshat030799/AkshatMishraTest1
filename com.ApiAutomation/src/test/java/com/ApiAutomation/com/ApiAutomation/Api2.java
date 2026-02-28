package com.ApiAutomation.com.ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Api2 {

	
		@Test
			public void Test1() {
			RestAssured.baseURI="https://rahulshettyacademy.com";
			String data=given().log().all().body("{\r\n"
					+ "\"name\":\"Learn oo Appium java with Java\",\r\n"
					+ "\"isbn\":\"biud\",\r\n"
					+ "\"aisle\":\"285\",\r\n"
					+ "\"author\":\"akshat kkk\"\r\n"
					+ "}\r\n"
					+ "").when().post("Library/Addbook.php")
			.then().assertThat().statusCode(200)
			.log().all().extract().response().asString();
		System.out.println(data);
		JsonPath js=new JsonPath(data);
		String Id=js.getString("ID");
		System.out.println("");
		System.out.println(Id);
		assertEquals(Id,"biud285" );
			}
		@Test
		public void Test2() {
			RestAssured.baseURI="https://rahulshettyacademy.com";
			String data=given().log().all().body("{\r\n"
					+ "\"name\":\"Learn oo Appium java with Java\",\r\n"
					+ "\"isbn\":\"biud\",\r\n"
					+ "\"aisle\":\"285\",\r\n"
					+ "\"author\":\"akshat kkk\"\r\n"
					+ "}\r\n"
					+ "").when().post("Library/Addbook.php")
			.then().assertThat().statusCode(200)
			.log().all().extract().response().asString();
		System.out.println(data);
		JsonPath js=new JsonPath(data);
		;
		String Msg=js.getString("Msg");
		
		assertEquals(Msg,"Book Already Exists" );
		}
	
		
}

	

	


