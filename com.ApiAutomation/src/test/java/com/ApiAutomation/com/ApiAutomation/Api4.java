package com.ApiAutomation.com.ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Api4 {

	public static void main(String[] args) {
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String postdata=given().log().all().body("{\r\n"
				+ "\"name\":\"Learn oo Appium java with Java\",\r\n"
				+ "\"isbn\":\"biud\",\r\n"
				+ "\"aisle\":\"2585\",\r\n"
				+ "\"author\":\"akshat kkk\"\r\n"
				+ "}\r\n"
				+ "").when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).body("Msg", equalTo("Book Already Exists")).extract().response().asString();
	
		JsonPath js=new JsonPath(postdata);
		String id=js.getString("ID");
		System.out.println(id);
		
		
		String putdata=given().log().all().body("{\r\n"
				+ "\"name\":\"Bhavya\",\r\n"
				+ "\"isbn\":\"oo\",\r\n"
				+ "\"aisle\":\"555\",\r\n"
				+ "\"author\":\"Akshat Mis\"\r\n"
				+ "}").header("ID",id).when().put("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
		JsonPath jp=new JsonPath(putdata); 
		String Id2=jp.getString("ID");
	
		
		given().log().all().header("ID",id).queryParam("ID", Id2).when().get("Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200);
	
	}

}

