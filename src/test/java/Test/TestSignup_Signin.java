package Test;

import Base.Testbase;
import Page.Home;
import Page.Signup_Signin;
import Util.Testutil;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.annotations.*;

@Listeners(Listener.TestListener.class)
public class TestSignup_Signin extends Testbase {
    Signup_Signin sc;

    public TestSignup_Signin() {
        super();
    }

    @BeforeMethod
    public void setup() {
        Initialization();
        sc = new Signup_Signin();
    }


    @Test
    public void checksignup() throws InterruptedException {
        sc.setSignup();
        Thread.sleep(3000);
        sc.setname_signup();
        sc.setEmail_signup();
        sc.setPassword_signup();
        sc.signupbtn();
        log.fatal("check on sign up operarion carefully...");
    }


    @Test
    @Description("Checking user is able to sign in or not ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("User sign in")
    @Story("Checking user after providing valid details able to sign in or not ")
    public void  checksignin() throws InterruptedException {
        sc.Signinlogo();
        log.fatal("sign in is necessary...");
    }
    @DataProvider
    public Object[][] data(){
        Object[][] data = Testutil.login("Login");
        return data;
    }
    @Test(dataProvider = "data")

    public void multiplelogin(String email, String password){
        sc.multipleuserlogin(email,password);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
