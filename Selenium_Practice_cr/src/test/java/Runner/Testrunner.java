package Runner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Base;

public class Testrunner extends Base {

    @BeforeMethod
    public void OpenBrowser(){
        startBrowser();
    }
    @Test
    public void FirstTest() {
        try {

            LoginPage obj1 = new LoginPage(driver);

            obj1.Login();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void closeBrowser(){

        driver.quit();


    }
}
