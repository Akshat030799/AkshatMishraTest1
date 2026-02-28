package com.ApiAutomation.com.ApiAutomation;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ApiTestingAuto {

	public static void main(String[] args) {
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().body("{\r\n"
				+ "\"name\":\"Learn oo Appium java with Java\",\r\n"
				+ "\"isbn\":\"biud\",\r\n"
				+ "\"aisle\":\"2585\",\r\n"
				+ "\"author\":\"akshat kkk\"\r\n"
				+ "}\r\n"
				+ "").when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).body("Msg", equalTo("Book Already Exists"));
	}

}
