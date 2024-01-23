package api.test;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.github.javafaker.Faker;
//
//import api.endpoints.UserEndPoints;
//import api.payload.UserPOJO;
//import io.restassured.response.Response;
//
public class UserTest {
//
//	Faker faker;
//	UserPOJO userPayload;
//	@BeforeClass
//	public void setupData() {
//		
//		faker=new Faker();
//		userPayload=new UserPOJO();
//		
//		userPayload.setId(faker.idNumber().hashCode());
//		userPayload.setUsername(faker.name().username());
//		userPayload.setUsername(faker.name().firstName());
//		userPayload.setUsername(faker.name().lastName());
//		userPayload.setUsername(faker.internet().safeEmailAddress());
//		userPayload.setUsername(faker.internet().password(5,10));
//		userPayload.setUsername(faker.phoneNumber().cellPhone());
//		
//	}
//	
//	
//	@Test(priority=1)
//	public void testPostUser() {
//		Response response = UserEndPoints.createUser(userPayload);
//		
//		response.then().log().all();
//		Assert.assertEquals(response.getStatusCode(), 200);
//	}
//	
//	@Test(priority=2)
//	public void testGetUserByName() {
//	
//		Response response = UserEndPoints.readUser(this.userPayload.getUsername());
//		response.then().log().all();
//		
//		Assert.assertEquals(response.statusCode(),200);
//		
//	}
//	
//	@Test(priority=3)
//	public void testUpdateUserName() {
//		
//		userPayload.setFirestName(faker.name().firstName());
//		userPayload.setLastName(faker.name().lastName());
//		userPayload.setEmail(faker.internet().safeEmailAddress());
//		
//        Response response = UserEndPoints.updateUser(this.userPayload.getUsername(),userPayload);
//		response.then().log().all();
////		response.then().log().body().statusCode(200);
//		
//		Assert.assertEquals(response.getStatusCode(), 200);
//		
//		//checking data after updation
//		
//		  Response responseAfterUpdate  = UserEndPoints.updateUser(this.userPayload.getUsername(),userPayload);
//		
//		  Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
//	}
//	
//	@Test(priority=4)
//	public void testDeleteUserByName() {
//		
//		Response response = UserEndPoints.deleteUser(this.userPayload.getUsername());
//		Assert.assertEquals(response.getStatusCode(), 200);
//	}
}
