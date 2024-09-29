package restassuredapi;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqresAPI {
	
	@Test
	public void Validate() {
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification rs = RestAssured.given();
		Response rq = rs.request(Method.GET, "/api/users");
		String body = rq.getBody().asString();
		System.out.println(body);
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(rq.statusCode(), 200);
		sa.assertAll();
		
		
		System.out.println(rq.statusCode());
		
		sa.assertEquals(rq.header("Content-Type"),"Content-Type");		
		
	}

}
