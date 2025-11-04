package pages;

import org.openqa.selenium.WebDriver;
import uistore.LoginUI;
import utilities.ExcelReader;
import utilities.WebDriverHelper;

public class LoginPage {

    WebDriver driver;
    public static WebDriverHelper helper;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        helper = new WebDriverHelper(driver);

    }


    public void Login(){

        helper.SendKeys(driver.findElement(LoginUI.User_name), ExcelReader.readValue("Sheet1",1,1));
        helper.SendKeys(driver.findElement(LoginUI.Pass_word),ExcelReader.readValue("Sheet1",1,2));

        helper.Click(driver.findElement(LoginUI.Login));

        helper.ImplicitWait();

        helper.TakeScreenshot();

    }
}
