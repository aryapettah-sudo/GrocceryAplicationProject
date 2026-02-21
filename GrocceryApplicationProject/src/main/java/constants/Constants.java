package constants;

public class Constants {
	
	public static final String TESTDATAFILE = System.getProperty("user.dir") +"\\src\\test\\resources\\TestData.xlsx";
	public static final String CONFIGFILE = System.getProperty("user.dir") +"\\src\\main\\resources\\config.properties";
	
	public static final String VALIDCREDENTIALERROR = "user was unable to login with valid credentials";
	public static final String INVALIDPASSWORDERROR = "user was login with invalid password";
	public static final String INVALIDUSERNAMEERROR = "user was login with invalid username";
	public static final String INVALIDCREDENTIALERROR = "user was login with invalid credentials";
	
	public static final String LOGOUTERROR = "User is unable to logout";
	
	public static final String CREATEADMINERROR = "user was unable to add user in adminusers";
	public static final String SEARCHADMINERROR = "user was unable to search adminusers";
	public static final String RESETADMINERROR = "user was unable to reset adminusers";
	
	public static final String ADDNEWSERROR = "user was unable to add new news";
	public static final String SEARCHNEWSERROR = "user was unable to search news";
	public static final String RESETNEWSERROR = "user was unable to reset news";
	
	public static final String DROPDOWNVALUE = "staff";
}