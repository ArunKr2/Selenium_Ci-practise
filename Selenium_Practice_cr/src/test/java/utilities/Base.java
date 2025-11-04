package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    public void startBrowser(){

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(readProperties.getValue("url"));
    }


}
