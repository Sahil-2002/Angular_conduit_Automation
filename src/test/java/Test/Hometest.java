package Test;

import Base.Testbase;
import Page.Home;
import Page.Signup_Signin;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.TestListener.class)
public class Hometest extends Testbase {
    public Home home;
    public Signup_Signin test;

    public Hometest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        Initialization();
        test = new Signup_Signin();
        home = new Home();
        test.Signinlogo();
        Thread.sleep(3000);
    }

    @Test
    public void checkglobalfeed() {
        home.globalfeed();
    log.info("Checking global feed ...");
    }

    @Test
    public void checkyourfeed() {
        home.yourfeed();
        log.info("Checking your feed ...");
        //driver.findElement(By.xpath("//a[normalize-space()='Your Feed']")).click();
    }

    @Test
    public void checknewarticle() {
        home.newarticle();
        log.warn("on home page click on new article ...");
    }

    @Test
    public void checksetting() {
        home.setting();
        log.warn("on home page click on setting ...");
    }

    @Test
    public void checkuser() {
        home.user();
        log.info("on home page check for user ...");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
