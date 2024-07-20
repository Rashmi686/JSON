package My_pkg;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllTC {
	
	public static void main(String[] args) {
		Response res = 
		given()
		
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIStudents/70c7"); // Path parameter - http://localhost:3000/APIStudents/idValue, Query parameter -http://localhost:3000/APIStudents?key=value
		System.out.println("Status code is");   //"http://localhost:3000/APIStudents?firstname=Chirag"
		
		System.out.println(res.statusCode()); // "http://localhost:3000/APIStudents" - If we want to fetch all records.
		System.out.println("Response data is");
		System.out.println(res.asString());
}
}

		
		
		
		
		
		
		
		
		
	