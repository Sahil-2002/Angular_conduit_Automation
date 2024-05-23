package Test;

import Base.Testbase;
import Page.Home;
import Page.Setting;
import Page.Signup_Signin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.TestListener.class)
public class Settingtest extends Testbase {
    Signup_Signin in ;
    Home home;
    Setting set;
    public Settingtest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        Initialization();
        in= new Signup_Signin();
        home = new Home();
        set = new Setting();
        in.Signinlogo();
        Thread.sleep(5000);
        home.setting();
    }


    @Test
    public void checkname(){
        String name = set.getName();
        System.out.println("name is "+name);
        Assert.assertEquals(name,prop.getProperty("name"));
        log.info("check name is same as user name ... ");
    }
    @Test
    public void checkfirst(){
        String data = set.getfirst();
        Assert.assertEquals(data,"random data");
        log.info("check first name ...");

    }
    @Test
    public void setbio(){
        set.getbio();
        log.info("checking for bio ...");
    }
    @Test
    public void checkmail(){
       String data =  set.getmail();
       Assert.assertEquals(data,prop.getProperty("email"));
       log.warn("check mail is same as user mail ...");
    }
    @Test
    public void logout(){
        set.setLogout();
        log.info("check user is coming back on home page  ...");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
