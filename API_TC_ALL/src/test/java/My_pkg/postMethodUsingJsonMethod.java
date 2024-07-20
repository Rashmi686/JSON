package My_pkg;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postMethodUsingJsonMethod {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("../API_TC_ALL/BodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject j=new JSONObject(js);
		Response res=
	    given()
	    .contentType(ContentType.JSON)
	    .body(j.toString()) //j is a variable that holds some data, typically a JSON object and .toString() converts the data held by j to a string representation.
	    .when()
	    .post("http://localhost:3000/APIStudents");
		System.out.println("status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	
		
		
	}

}
