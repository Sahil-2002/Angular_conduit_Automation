package Page;

import Base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting extends Testbase {

    @FindBy(xpath = "//input[@placeholder='URL of profile picture']")
    WebElement first;
    @FindBy(xpath = "/html/body/app-root/ng-component/ng-component/div/div/div/div/form/fieldset/fieldset[2]/input")
    WebElement name;
    @FindBy(xpath = "//textarea[@placeholder='Short bio about you']")
    WebElement bio;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement update;
    @FindBy(xpath = "//button[@class='btn btn-outline-danger']")
    WebElement logout;

    public Setting(){
        PageFactory.initElements(driver, this);
    }

    public String getfirst(){
        String data =first.getText();
        return data;
    }
    public String getName(){
        String data = name.getText();
        return data;
    }
    public void getbio(){
        bio.sendKeys("I am sahil");
    }
    public String getmail(){
        String data = email.getText();
        return data;
    }
    public void getupdate(){
        update.click();
    }

    public void setLogout(){
        logout.click();
    }








}
