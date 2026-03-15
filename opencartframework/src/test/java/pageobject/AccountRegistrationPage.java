package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
   
	

@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstName;
@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastName;
@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;
@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtPhoneNum;
@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;
@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtPwdConfirm;
@FindBy(xpath="//input[@name='agree']")
WebElement checkbox;
@FindBy(xpath="//input[@value='Continue']")
WebElement btncontinue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;



public void setFirstname(String Fname) {
	txtFirstName.sendKeys(Fname);
}
public void setLastname(String Lname) {
	txtLastName.sendKeys(Lname);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
public void setPhonenum(String pnum) {
	txtPhoneNum.sendKeys(pnum);
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void setPasswordConfirm(String pwdconfirm) {
	txtPwdConfirm.sendKeys(pwdconfirm);
}
public void Checkoncheckbox() {
	checkbox.click();
}
public void clickOnContinue() {
	btncontinue.click();
	
}
public String getConfirmationMsg() {
	try {
	return msgConfirmation.getText();
	}
	catch(Exception e) {
	return e.getMessage();
	}
}








}