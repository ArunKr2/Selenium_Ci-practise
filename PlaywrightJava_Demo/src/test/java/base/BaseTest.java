package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod
    public void setup() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000).setChannel("chrome"));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1070,1080));
        page = context.newPage();

    }

    @AfterMethod
    public void teardown() {

        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
