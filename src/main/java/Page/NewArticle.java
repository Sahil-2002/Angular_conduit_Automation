package Page;

import Base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArticle extends Testbase {

    @FindBy(xpath = "//input[@placeholder= 'Article Title']")
    WebElement title;
    @FindBy(xpath = "//input[@placeholder=\"What's this article about?\"]")
    WebElement about;
    @FindBy(xpath = "//textarea[@placeholder='Write your article (in markdown)']")
    WebElement markdown;
    @FindBy(xpath = "//input[@placeholder='Enter tags']")
    WebElement tag;
    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/app-form-layout/div/div/div/app-article-form/form/fieldset/button")
    WebElement publish;
    public NewArticle(){
        PageFactory.initElements(driver, this);
    }
    public void setTitle(){
        title.sendKeys("What is Java?");
    }
    public void setAbout(){
        about.sendKeys("This article is about coding in java ");
    }
    public void setMarkdown(){
        markdown.sendKeys("Lets learn java... ");

    }
    public void setTag(){
        tag.sendKeys("coding");
    }
    public void setPublish(){
        publish.click();
    }
}
