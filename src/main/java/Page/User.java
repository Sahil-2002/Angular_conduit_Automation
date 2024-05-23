package Page;

import Base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User extends Testbase {

    @FindBy(xpath = "//a[normalize-space()='My Articles']")
    WebElement myarticle;
    @FindBy(xpath = "//a[normalize-space()='Favorited Articles']")
    WebElement fav;


    public User(){
        PageFactory.initElements(driver,this);
    }
    public void getmyarticle(){
        myarticle.click();
    }
    public void favarticle(){
        fav.click();
    }

}
