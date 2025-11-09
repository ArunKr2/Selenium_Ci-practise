package Runner;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import pages.PIMPage;
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
    @Test(priority=1)
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

    @Test(priority=2)
    public void SecondTest(){
        try{
            LoginPage obj1 = new LoginPage(driver);
            HomePage obj2 = new HomePage(driver);
            PIMPage obj3 = new PIMPage(driver);

            obj1.Login();
            obj2.PIM_Tab();
            obj3.User_AddPage();
            obj2.Search();

            extest = exreport.createTest("Employee Added");

            extest.log(Status.INFO, "Page title is: " + driver.getTitle());

            extest.pass("Employee added Successfully!");

        }
        catch(Exception e){
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
