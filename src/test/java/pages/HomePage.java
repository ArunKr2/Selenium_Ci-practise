package pages;

import org.openqa.selenium.WebDriver;
import uistore.HomeUI;
import utilities.ExcelReader;
import utilities.WebDriverHelper;

public class HomePage {

    WebDriver driver;
    WebDriverHelper helper;

   public HomePage(WebDriver driver) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
    }


    public void PIM_Tab(){
        helper.Click(driver.findElement(HomeUI.PIM_button));
        helper.Click(driver.findElement(HomeUI.AddUser_button));
        helper.wait(200);
    }

    public void Search(){

         helper.Click(driver.findElement(HomeUI.PIM_button));
         helper.SendKeys(driver.findElement(HomeUI.Name_Search_box), ExcelReader.readValue("Sheet1",22,1));
        helper.wait(1000);

         helper.Click(driver.findElement(HomeUI.Search_Button));

         helper.wait(2000);

         helper.TakeScreenshot();
    }
}
