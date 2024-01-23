package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.UserRegistrationEndPoints;
import api.endpoints.PartnerRegistrationEndPoints;
import api.endpoints.Routes;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PartnerRegistrationTest {

	public static Logger log = (Logger) LogManager.getLogger(PartnerRegistrationTest.class);
	 @BeforeClass
	    public void setup() {
	        RestAssured.baseURI = Routes.BASE_URL;
	    }
	
	@Test(priority=1)
	public void partnertestPostsendOTP() {
		Response response = PartnerRegistrationEndPoints.partnersendOtp();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("PartnerTestPostsendOTP method Pass");
	}
	@Test(priority=2)
	public void partnettestPostVerifyOTP() {
		Response response = PartnerRegistrationEndPoints.partnerverifyOtp();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("PartnerTestPostVerifyOTP method Pass");
	}
	@Test(priority=3)
	public void partnertestPostsignUp() {
		Response response = PartnerRegistrationEndPoints.partnersignUp();
		Assert.assertEquals(response.getStatusCode(), 201);
		log.info("PartnerTestPostsignUp method Pass");
	}
	@Test(priority=4)
	public void partnertestPostsignIn() {
		Response response = PartnerRegistrationEndPoints.partnersignIn();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("PartnerTestPostsignIn method Pass");
	}
	@Test(priority=5)
	public void partnertestPostForgotOtp() {
		Response response = PartnerRegistrationEndPoints.partnerForgotPassTOP();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("PartnerTestPostForgotPasswordOTP method Pass");
	}
	@Test(priority=6)
	public void partnertestPostForgotPass() {
		Response response = PartnerRegistrationEndPoints.partnerForgotPass();
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("PartnerTestPostForgotPassword method Pass");
	}
	
		

}
