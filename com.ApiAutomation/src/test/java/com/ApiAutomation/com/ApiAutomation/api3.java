package com.ApiAutomation.com.ApiAutomation;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class api3 {
	public static void main(String[] args) {
		
	
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
	
	
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String data1=given().log().all().queryParam("ID", Id).when().get("Library/GetBook.php")
	.then().assertThat().statusCode(200)
	.log().all().extract().response().asString();
System.out.println(data1);
JsonPath js1=new JsonPath(data1);
String k=js1.getString("book_name");
System.out.println(k  );


}}
