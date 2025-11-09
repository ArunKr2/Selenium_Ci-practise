package uistore;

import org.openqa.selenium.By;

public class Employee_UI {

    public static By First_Name = By.name("firstName");

    public static By Middle_Name = By.name("middleName");

    public static By Last_Name = By.xpath("//input[@placeholder='Last Name']");

    public static By Save_button = By.xpath("//button[text()=' Save ']");

    public static By Set_Profile = By.xpath("//img[@class='employee-image']");
}
