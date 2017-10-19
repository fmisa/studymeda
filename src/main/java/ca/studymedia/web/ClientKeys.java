package ca.studymedia.web;

public interface ClientKeys {
	//Constants...
	public static final String PAGE_DEFAULT_EXTENSION = ".html";
	
	//Page Name Mappings
	public static final String PAGE_LANDING = "landingPage";
	public static final String PAGE_MEDIA_ASSET = "mediaAssetPage";
	public static final String PAGE_ABOUT = "about";
	public static final String PAGE_ERROR = "error";
	public static final String PAGE_CONTACT = "contact";
	public static final String PAGE_SIGNOUT = "signOut";
	public static final String PAGE_SIGNIN = "signIn";
	public static final String PAGE_SIGNUP = "signUp";
	
	//Session Attribute Keys
	public static final String KEY_ERROR_MESSAGE = "ERROR_MESSAGE";
	
	//Model Atttribute Keys
	public static final String MODEL_USER = "userLogin";
	public static final String MODEL_SIGNUP = "userSignUp";
}