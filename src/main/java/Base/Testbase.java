package Base;

import Util.Testutil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Testbase {
    public static WebDriver driver;
    public static Properties prop;

   // public static org.apache.log4j.Logger log = Logger.getLogger(Testbase.class);
    public static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Testbase.class);

    public ExtentReports extentReports = new ExtentReports();
    public ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D:\\intellij_workspace\\Angular-pom\\Outputfile\\Extentreport.html");



    String config = "D:\\intellij_workspace\\Angular-pom\\src\\main\\java\\Config\\Config.properties";




    public Testbase() {

        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(config);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void Initialization(){
String browser = prop.getProperty("browser");
       if(browser.equals("chrome")){
           driver= new ChromeDriver();
       }
       driver.manage().window().maximize();
       driver.get(prop.getProperty("url"));

       driver.manage().timeouts().pageLoadTimeout(Testutil.Pageloadtimeout, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(Testutil.implicitlywait, TimeUnit.SECONDS);

    }

}
