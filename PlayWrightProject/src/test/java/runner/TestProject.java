package runner;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Base;



public class TestProject extends Base {

    @Test
    public void testlogin(){
        LoginPage login = new LoginPage(page);

        login.UserCredential();
    }

    @Test
    public void testHome(){

    }
}
