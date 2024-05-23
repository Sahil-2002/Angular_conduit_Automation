package Page;

import Base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Testbase
{

    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/div/div/div/div[1]/app-feed-toggle/div/ul/li[2]/a")
    WebElement globalfeed;
    @FindBy(xpath = "//a[normalize-space()='Your Feed']")
    WebElement Yourfeed;
    @FindBy(xpath = "//a[@routerlink='/editor']")
    WebElement newArticle;
    @FindBy(xpath = "/html/body/app-root/ng-component/app-header/nav/div/ul/li[3]/a")
    WebElement setting;
    @FindBy(xpath = "/html/body/app-root/ng-component/app-header/nav/div/ul/li[4]/a")
    WebElement user;

    public Home(){
        PageFactory.initElements(driver, this);
    }

    public void globalfeed(){
        globalfeed.click();
    }
    public void yourfeed(){
        Yourfeed.click();
    }
    public NewArticle newarticle(){
        newArticle.click();
        return new NewArticle();
    }
    public Setting setting(){
        setting.click();
        return new Setting();
    }
    public User user(){
        user.click();
        return new User();
    }

}

