package Page;

import Base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Signin extends Testbase {

    @FindBy(xpath = "/html/body/app-root/ng-component/app-header/nav/div/ul/li[2]/a")
    WebElement signin;
    @FindBy(xpath = "/html/body/app-root/ng-component/app-header/nav/div/ul/li[3]/a")
    WebElement signup;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/app-form-layout/div/div/div/form/button")
    WebElement signupbtn;
    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/app-form-layout/div/div/div/form/fieldset[1]/input")
    WebElement signinemail;
    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/app-form-layout/div/div/div/form/fieldset[2]/input")
    WebElement getSigninpassword;
    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/app-form-layout/div/div/div/form/button")
    WebElement signinbtn;


    public Signup_Signin() {
        PageFactory.initElements(driver, this);
    }

    public Home Signinlogo() {
        signin.click();
        signinemail.sendKeys(prop.getProperty("email"));
        getSigninpassword.sendKeys(prop.getProperty("password"));
        signinbtn.click();
        return new Home();
    }

    public void setSignup() {
        signup.click();

    }

    public Home multipleuserlogin(String email, String password){
        signin.click();
        signinemail.sendKeys(email);
        getSigninpassword.sendKeys(password);
        signupbtn.click();
        return new Home();
    }

    public void setname_signup() {
        username.sendKeys(prop.getProperty("name"));
    }

    public void setEmail_signup() {
        email.sendKeys(prop.getProperty("email"));
    }

    public void setPassword_signup() {
        password.sendKeys(prop.getProperty("password"));
    }
    public Home signupbtn() {
        signupbtn.click();
        return new Home();
    }


}
