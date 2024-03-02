package api.endpoints;

public class Routes { // routes contain only urls
	
	 public static String BASE_URL = "https://homelyf-demo.onrender.com";
	 
	 public static  String USER_SEND_OTP_ENDPOINT = "/api/sendEmail-otp";
	 public static  String USER_VERIFY_OTP_ENDPOINT="/api/verify-otp";
	 public static  String USER_SIGNUP_OTP_ENDPOINT="/api/signup";
	 public static  String USER_SIGNIN_ENDPOINT="/api/signin";
	 public static  String USER_FORGOTPASSSWORD_OTP_ENDPOINT="/api/sendEmail-forgotPassword-otp";
	 public static  String USER_FORGOTPASSWORD_ENDPOINT="/sp/forgotpassword-partner";
	 
	 public static  String PARTNER_SEND_OTP_ENDPOINT = "/sp/sendEmail-otp-partner";
	 public static  String PARTNER_VERIFY_OTP_ENDPOINT="/sp/verify-otp-partner";
	 public static  String PARTNER_SIGNUP_OTP_ENDPOINT="/sp/signup-partner";
	 public static  String PARTNER_SIGNIN_ENDPOINT="/sp/signin-partner";
	 public static  String PARTNER__FORGOT_OTP_ENDPOINT="/sp/sendEmail-forgotPassword-otp-partner";
	 public static  String PARTNER_FORGOTPASSWORD_ENDPOINT="/sp/forgotpassword-partner";
}
