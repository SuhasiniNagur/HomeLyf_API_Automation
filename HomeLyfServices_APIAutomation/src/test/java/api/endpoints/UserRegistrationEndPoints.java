package api.endpoints;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import api.payload.UserPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserRegistrationEndPoints {

	 
public static Response usersendOtp() {
		
	 JSONObject requestBody = new JSONObject();
     requestBody.put("email", "suhasinivnagur8600@gmail.com");

       Response response = given()
             .contentType(ContentType.JSON)
             .body(requestBody.toString())
         .when()
             .post(Routes.USER_SEND_OTP_ENDPOINT);
             response.then().log().all();
		return response;
	}
	
public static Response userverifyOtp() {
	
	 JSONObject requestBody = new JSONObject();
    requestBody.put("email", "suhasinivnagur8600@gmail.com");
    requestBody.put("otp", "1234");

      Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody.toString())
        .when()
            .post(Routes.USER_VERIFY_OTP_ENDPOINT);
            response.then().log().all();
		return response;
	}

public static Response usersignUp() {
	
	 JSONObject requestBody = new JSONObject();
    requestBody.put("name", "suhasinin");
    requestBody.put("email", "suhasinivnagur8600@gmail.com");
    requestBody.put("mobile", "9878675645");
    requestBody.put("password", "Suhasini@123");
    requestBody.put("otp", "1234");
      Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody.toString())
        .when()
            .post(Routes.USER_SIGNUP_OTP_ENDPOINT);
            response.then().log().all();
		return response;
	}

public static Response usersignIn(UserPOJO userpayload ) {
	
	 JSONObject requestBody = new JSONObject();
    requestBody.put("email", userpayload.getEmail());
    requestBody.put("password",userpayload.getPassword());

      Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody.toString())
        .when()
            .post(Routes.USER_SIGNIN_ENDPOINT);
            response.then().log().all();
		return response;
	}
public static Response userForgotpassOTP() {
	
	 JSONObject requestBody = new JSONObject();
   requestBody.put("email", "suhasinivnagur8600@gmail.com");

     Response response = given()
           .contentType(ContentType.JSON)
           .body(requestBody.toString())
       .when()
           .post(Routes.USER_FORGOTPASSSWORD_OTP_ENDPOINT);
           response.then().log().all();
		return response;
	}
public static Response userForgotPass() {
	
	 JSONObject requestBody = new JSONObject();
   requestBody.put("email", "suhasinivnagur8600@gmail.com");
   requestBody.put("NewPassword", "Suhasini@1234");

     Response response = given()
           .contentType(ContentType.JSON)
           .body(requestBody.toString())
       .when()
           .post(Routes.USER_FORGOTPASSWORD_ENDPOINT);
           response.then().log().all();
		return response;
	}
}
