package Runner;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;
import pages.LoginPage;
import utilities.Base;
import utilities.ExtendReport;

public class Testrunner extends Base {

    ExtentReports exreport;
    ExtentTest extest;

    @BeforeTest
    public void Reportgenerate(){

        exreport = ExtendReport.createreport();
    }

    @BeforeMethod
    public void OpenBrowser(){
        startBrowser();
    }
    @Test
    public void FirstTest() {
        try {

            LoginPage obj1 = new LoginPage(driver);

            obj1.Login();

            extest = exreport.createTest("Log  Browser");

            extest.log(Status.INFO, "Page title is: " + driver.getTitle());

            extest.pass("login successfully!");


        } catch (Exception e) {
            e.printStackTrace();

            extest.fail("Login Failed");
        }
    }
    @AfterMethod
    public void closeBrowser(){

        driver.quit();


    }

    @AfterTest

    public void flushreport(){
        exreport.flush();
    }
}
