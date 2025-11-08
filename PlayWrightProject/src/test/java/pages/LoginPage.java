package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import locators.Test1Locators;

public class LoginPage {

    Page page;

    public LoginPage(Page page){
        this.page=page;
    }


    public void UserCredential(){

        page.locator(Test1Locators.username).fill("standard_user");
        page.getByPlaceholder(Test1Locators.password).fill("secret_sauce");
        page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName(Test1Locators.submit)).click();
    }
}
