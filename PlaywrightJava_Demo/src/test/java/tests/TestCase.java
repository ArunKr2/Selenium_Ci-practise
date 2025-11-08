package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void verifyTitle(){

            page.navigate("https://www.flipkart.com/");

            System.out.println(page.title());
    }
}
