package api.endpoints;
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.ResponseAwareMatcher.*;
//import static org.hamcrest.Matchers.*;
//
//import api.payload.UserPOJO;
////UserEndPoints.java
////created for perform Create, Read, Update, Delete Request the user API.
//
public class UserEndPoints {
//
//	public static Response createUser(UserPOJO payload) {
//		
//		Response response = given()
//		
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(payload)
//		.when()
//
//		     .post(Routes.post_url);
//		
//        return response;
//		
//	}
//	
//public static Response readUser(String userName) {
//		
//		Response response = given()
//		
//				.pathParam("username", userName)
//	
//		.when()
//
//		     .get(Routes.get_url);
//		
//        return response;
//		
//	}
//
//public static Response updateUser(String userName,UserPOJO payload) {
//	
//	Response response = given()
//	
//	.contentType(ContentType.JSON)
//	.accept(ContentType.JSON)
//	.pathParam("username", userName)
//	.body(payload)
//	.when()
//
//	     .put(Routes.update_url);
//	
//    return response;
//	
//}
//
//public static Response deleteUser(String userName) {
//	
//	Response response = given()
//			.pathParam("username", userName)
//	.when()
//
//	     .delete(Routes.delete_url);
//	
//    return response;
//	
//}
//	
}
