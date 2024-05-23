package Test;

import Base.Testbase;
import Page.Home;
import Page.NewArticle;
import Page.Signup_Signin;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.TestListener.class)
public class NewArticletest extends Testbase {
    Signup_Signin in;
    Home home;
    NewArticle article;
    public NewArticletest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        Initialization();
        in = new Signup_Signin();
        home= new Home();
        article = new NewArticle();
        in.Signinlogo();
        home.newarticle();
    }
    @Test
    public void publish(){
        article.setTitle();
        article.setAbout();
        article.setMarkdown();
        article.setTag();
        article.setPublish();
        log.info("publish the article ...");
        log.warn("clicking on publish is mandatory ... ");

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
