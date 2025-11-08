package utils;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;


    @BeforeMethod
    public void setUP(){

         playwright = Playwright.create();
         browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setChannel("chrome").setSlowMo(1000).setHeadless(false));
         BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1080,1090));

         page = context.newPage();

         page.navigate("https://www.saucedemo.com/");

    }



    @AfterMethod

    public void TearDown(){

        page.waitForTimeout(3000);

        if(browser!=null){
            browser.close();
        }
        if(playwright!=null){
            playwright.close();
        }


    }

}
