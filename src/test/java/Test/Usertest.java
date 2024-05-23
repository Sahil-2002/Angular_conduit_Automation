package Test;

import Base.Testbase;
import Page.Home;
import Page.Signup_Signin;
import Page.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.TestListener.class)
public class Usertest extends Testbase {
   Signup_Signin in;
   Home home;
   User user;

    public Usertest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        Initialization();
        in = new Signup_Signin();
        home = new Home();
        user = new User();
        Thread.sleep(3000);
        in.Signinlogo();
        Thread.sleep(3000);
        home.user();

    }
    @Test
    public void myarticle(){
        user.getmyarticle();
        log.info("check on my article ...");
    }
    @Test
    public void favarticle(){
        user.favarticle();
        log.info("check for fav article ...");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

