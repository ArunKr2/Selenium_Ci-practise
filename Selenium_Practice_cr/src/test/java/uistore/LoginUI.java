package uistore;

import org.openqa.selenium.By;

public class LoginUI {

    public static By User_name = By.name("username");
    public static By Pass_word = By.xpath("//input[@placeholder='Password']");
    public static By Login = By.xpath("//button[text()=' Login ']");
}
