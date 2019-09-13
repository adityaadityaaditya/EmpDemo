package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Commonsutility;



public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver idriver)
	{
		this.driver=idriver;
	}
	@FindBy(tagName="form") WebElement form;
	@FindBy(tagName="h1") WebElement tag;
	@FindBy(id="userNameLbl")
	 WebElement usernamelab;
	@FindBy(name="loginName") WebElement uname;
	@FindBy(id="passwordLbl") WebElement passwordlab;
	@FindBy(name="password") WebElement pwd;
	@FindBy(xpath="//input[@value='Login']") WebElement logbtn;
	public void loginToEmp(String username,String password)
	{
        assertTrue(form.getAttribute("action").endsWith("login"));
		assertTrue(tag.getText().equals("Login Page"));
		Commonsutility.checkEnabledAndDisplayed(usernamelab,uname,passwordlab,pwd,logbtn);
		assertTrue(usernamelab.getText().equals("User Name:"));
		assertTrue(uname.getAttribute("type").equals("text"));
		uname.sendKeys(username);
		assertTrue(passwordlab.getText().equals("Password:"));
		assertTrue(pwd.getAttribute("type").equals("password"));
		pwd.sendKeys(password);
		assertTrue(logbtn.getAttribute("value").equals("Login"));
		logbtn.click();
	}
	@FindBy(id="logoutLbl")  WebElement logout;
	public  void logout() {
	Commonsutility.checkEnabledAndDisplayed(logout);
	 assertTrue(logout.getText().equals("Logout"));
	 logout.click();
	}
	@FindBy(xpath="/html/body/font") WebElement invalidlogin;
	public  void invalidattempt() {
		Commonsutility.checkEnabledAndDisplayed(invalidlogin);
		assertTrue(invalidlogin.getText().equals("Invalid Login."));
	}
	@FindBy(xpath="/html/body/font")   WebElement maxattempt;
	public  void maxattempt() {
		Commonsutility.checkEnabledAndDisplayed(maxattempt);
		assertTrue(maxattempt.getText().equals("You have exceded Maximum no of attempts.Please contact Admin"));
	}
	
	
}
