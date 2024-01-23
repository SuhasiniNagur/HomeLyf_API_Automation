package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.UserRegistrationEndPoints;
import api.payload.UserPOJO;
import api.utilities.DataProviders;
import api.endpoints.Routes;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserRegistrationTest {

	public static Logger log = (Logger) LogManager.getLogger(UserRegistrationTest.class);

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = Routes.BASE_URL;
	}

//	@Test(priority = 1)
	public void testPostsendOTP() {
		Response response = UserRegistrationEndPoints.usersendOtp();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("TestPostsendOTP method executed successfully");
	}

//	@Test(priority = 2)
	public void testPostVerifyOTP() {
		Response response = UserRegistrationEndPoints.userverifyOtp();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("TestPostVerifyOTP method executed successfully");
	}

//	@Test(priority = 3)
	public void testPostsignUp() {
		Response response = UserRegistrationEndPoints.usersignUp();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("TestPostsignUp method executed successfully");
	}

	@Test(priority = 1, dataProvider ="userData", dataProviderClass = DataProviders.class)
	public void testPostsignIn(String email,String password) {
		
		UserPOJO userpayload=new UserPOJO();
		
		userpayload.setEmail(email);
		userpayload.setPassword(password);
		
		Response response = UserRegistrationEndPoints.usersignIn(userpayload);
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("TestPostsignIn method executed successfully");
	}

//	@Test(priority = 5)
	public void testPostForgotOTP() {
		Response response = UserRegistrationEndPoints.userForgotpassOTP();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("TestPostForgotPasswordOTP method executed successfully");
	}

//	@Test(priority = 6)
	public void testPostForgotPass() {
		Response response = UserRegistrationEndPoints.userForgotPass();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("TestPostForgotPassword method executed successfully");
	}

}
