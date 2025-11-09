package uistore;

import org.openqa.selenium.By;

public class HomeUI {

    public static By PIM_button = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");

    public static By AddUser_button = By.xpath("//button[text()=' Add ']");

    public static By Name_Search_box = By.xpath("(//input[@placeholder='Type for hints...'])[1]");

    public static By Search_Button = By.xpath("//button[text()=' Search ']");
}
