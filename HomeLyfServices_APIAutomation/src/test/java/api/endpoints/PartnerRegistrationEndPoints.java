package api.endpoints;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PartnerRegistrationEndPoints {

	 
public static Response partnersendOtp() {
		
	 JSONObject requestBody = new JSONObject();
     requestBody.put("email", "suhasinivnagur06@gmail.com");

       Response response = given()
             .contentType(ContentType.JSON)
             .body(requestBody.toString())
         .when()
             .post(Routes.PARTNER_SEND_OTP_ENDPOINT);
             response.then().log().all();
		return response;
	}
	
public static Response partnerverifyOtp() {
	
	 JSONObject requestBody = new JSONObject();
    requestBody.put("email", "suhasinivnagur06@gmail.com");
    requestBody.put("otp", "9053");

      Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody.toString())
        .when()
            .post(Routes.PARTNER_VERIFY_OTP_ENDPOINT);
            response.then().log().all();
		return response;
	}

public static Response partnersignUp() {
	
	 JSONObject requestBody = new JSONObject();
    requestBody.put("name", "suhasinin");
    requestBody.put("email", "suhasinivnagur06@gmail.com");
    requestBody.put("mobile", "9878675645");
    requestBody.put("password", "Suhasini@123");
    requestBody.put("otp", "9053");
      Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody.toString())
        .when()
            .post(Routes.PARTNER_SIGNUP_OTP_ENDPOINT);
            response.then().log().all();
		return response;
	}

public static Response partnersignIn() {
	
	 JSONObject requestBody = new JSONObject();
    requestBody.put("email", "suhasinivnagur06@gmail.com");
    requestBody.put("password", "Suhasini@123");

      Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody.toString())
        .when()
            .post(Routes.PARTNER_SIGNIN_ENDPOINT);
            response.then().log().all();
		return response;
	}
public static Response partnerForgotPassTOP() {
	
	 JSONObject requestBody = new JSONObject();
   requestBody.put("email", "suhasinivnagur06@gmail.com");

     Response response = given()
           .contentType(ContentType.JSON)
           .body(requestBody.toString())
       .when()
           .post(Routes.PARTNER_FORGOTPASSWORD_ENDPOINT);
           response.then().log().all();
		return response;
	}
public static Response partnerForgotPass() {
	
	 JSONObject requestBody = new JSONObject();
   requestBody.put("email", "suhasinivnagur06@gmail.com");
   requestBody.put("newPassword", "Suhasini@1234");
   requestBody.put("otp", "7218");

     Response response = given()
           .contentType(ContentType.JSON)
           .body(requestBody.toString())
       .when()
           .post(Routes.PARTNER_FORGOTPASSWORD_ENDPOINT);
           response.then().log().all();
		return response;
	}
}
