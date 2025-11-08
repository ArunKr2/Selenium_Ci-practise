package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Set;

public class WebDriverHelper {

    WebDriver driver;

    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }

    public void Click(WebElement ele){
        ele.click();
    }

    public void SendKeys(WebElement ele , String Value){
        ele.sendKeys(Value);
    }

    public void Mouse_hover(WebElement ele){
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
    }

    public void ExplicitWait(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(ele));

    }

    public void ImplicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public void WindowHandle(){

        String ParentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        for(String wins : windows) {
            if (!wins.equals(ParentWindow)) {

                driver.switchTo().window(wins);
                break;
            }

        }
        }

        public void JsClick(WebElement ele){

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()",ele);

        }

        public void Enter(WebElement ele){
          ele.sendKeys(Keys.ENTER);
        }


    public void wait(int seconds){

       try{
           Thread.sleep(seconds);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }

    public void TakeScreenshot() {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Scrshot\\screenshot.png";

            File Dest = new File(filePath);

            FileHandler.copy(src, Dest);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}