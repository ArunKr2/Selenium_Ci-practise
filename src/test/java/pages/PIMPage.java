package pages;

import org.openqa.selenium.WebDriver;
import uistore.Employee_UI;
import utilities.ExcelReader;
import utilities.WebDriverHelper;

public class PIMPage {

    WebDriverHelper helper;
    WebDriver driver;

    public PIMPage(WebDriver driver){
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }


    public void User_AddPage(){

        helper.SendKeys(driver.findElement(Employee_UI.First_Name), ExcelReader.readValue("Sheet1",14,1));
        helper.SendKeys(driver.findElement(Employee_UI.Middle_Name),ExcelReader.readValue("Sheet1",14,2));
        helper.SendKeys(driver.findElement(Employee_UI.Last_Name),ExcelReader.readValue("Sheet1",14,3));
        helper.Click(driver.findElement(Employee_UI.Save_button));
        helper.wait(500);
    }

}
