package utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport {

    public static ExtentReports Extend;
    public static ExtentTest test;



    public static ExtentReports createreport(){

        String Reportpath = System.getProperty("user.dir")+"\\src\\main\\resources\\reports";

        ExtentSparkReporter sparkreporter = new ExtentSparkReporter(Reportpath + "\\index.html");

        sparkreporter.config().setDocumentTitle("Selenium Demo Report");
        sparkreporter.config().setReportName("Selenium results");
        sparkreporter.config().setTheme(Theme.STANDARD);


        Extend = new ExtentReports();

        Extend.attachReporter(sparkreporter);

        Extend.setSystemInfo("Tester","Arun");
        Extend.setSystemInfo("BrowserName","Chrome");
        Extend.setSystemInfo("Role","QA");


        return Extend;

    }

}
