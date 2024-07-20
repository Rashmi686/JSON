package My_pkg;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodUsingOrgJson {
// So before hitting the request we should have the request body data
	//Here we are creating body data using org.json library
	
	public static void main(String[] args) {
		JSONArray array=new JSONArray();
		 JSONObject inner1=new JSONObject();	// inner is part of outer object
		 inner1.put("houseNo", "398");
		 inner1.put("sector", "23");
		 inner1.put("type", "Primary Address");
		 
		 
		 JSONObject inner2=new JSONObject();	// inner is part of outer object
		 inner2.put("houseNo", "398");
		 inner2.put("sector", "23");
		 inner2.put("type", "Secondary Address");
		 
		 JSONArray array1=new JSONArray();
		 array.put(0, inner1);
		 array.put(1, inner2);
		 
    JSONObject outer=new JSONObject();
    outer.put("firstname", "DEEPAK");
    outer.put("lastname", "CHANANA");
    outer.put("id", "44444");
    outer.put("designation", "TEAM LEAD");
   outer.put("Address",array);
   System.out.println(outer.toString());
  

}
}