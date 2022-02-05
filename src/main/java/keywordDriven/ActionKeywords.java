package keywordDriven;

import Utility.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ActionKeywords {
	public static WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				Constants.DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}

	public void enterEmail() {
		driver.findElement(By.name("username")).sendKeys(Constants.username);
	}

	public void enterPassword() {
		driver.findElement(By.name("pw")).sendKeys(Constants.password);
	}

	public void clickSignIn() {
		driver.findElement(By.cssSelector("input#Login")).click();
	}

	  public void gotoAccountPage(){ 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //change this
		  driver.get(Constants.ACCOUNT_URL); 
	  
	  }
	/* 

	public WebElement getPhoneInput() {
		return driver.findElement(By.cssSelector(Constants.PHONE_INPUT_CSS));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.cssSelector(Constants.SAVE_BUTTON_CSS));
	}

	public void saveAccount() {
		this.getSaveButton().click();
	}



	public WebElement getNameInput() {
		return driver.findElement(By.cssSelector(Constants.NAME_INPUT_CSS));
	}
*/
	public void newAccountCreate() {
		try {
			String accountName;
			
			driver.findElement(By.xpath(Constants.NEW_ACCOUNT_XPATH)).click();
			Thread.sleep(5000);
			if (System.getProperty("account.name") == null || System.getProperty("account.name").isEmpty()) {
				System.setProperty("account.name", "MyAccount");
			}
			
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(System.getProperty("account.name"));
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			//add some logger here
		}

	}

	public void logout() {
		driver.findElement(By.xpath("//a[text() = 'Sign out']")).click();//change this
	}

	public void closeBrowser() {
		driver.quit();
	}
}
