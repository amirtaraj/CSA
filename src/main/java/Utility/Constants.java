package Utility;

public class Constants {
	
	//Driver
	public static final String DRIVER = "D:\\Develop\\Salesforce-Selenium\\src\\test\\resources\\chromedriver.exe";
    //URL
    public static final String URL = "https://teksystems62-dev-ed.lightning.force.com/lightning/page/home";
    //File Location
    public static final String filePath = "\\src\\main\\java\\excelData\\KeyWords.xlsx";
    

    //User Info - username
    public static final String username = "amirtaraj.r@gmail.com";
    //User Info - password
    public static final String password = "PasswordGoesHere";
    
    public static String BASE_URL = "https://login.salesforce.com/?locale=in";
    public static String HOME_URL = "https://teksystems62-dev-ed.lightning.force.com/lightning/page/home";
    public static String ACCOUNT_URL = "https://teksystems62-dev-ed.lightning.force.com/lightning/o/Account/home/";
    public static String ACCOUNT_ID_VIEW = "https://teksystems62-dev-ed.lightning.force.com/view";
    
    public static final String ACCOUNT_PAGE_URL = "//a[@href='/lightning/o/Account/home']";
    public static final String NEW_ACCOUNT_XPATH = "//a[@title='New']";
    public static final String NAME_INPUT_CSS = "input[id*='name']";
    public static final String PHONE_INPUT_CSS = "input[id*='phone']";
    public static final String SAVE_BUTTON_CSS = "input[id*='save']";

    public static final String INPUT_PASSWORD_CSS = "pw";
    public static final String INPUT_USERNAME_CSS = "username";
    public static final String PAGE_HOME_IDENTIFIER_ANCH = "//a[@href='/lightning/page/home']";
}
