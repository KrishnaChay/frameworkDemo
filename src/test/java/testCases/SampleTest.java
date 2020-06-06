package testCases;

import driver.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.landingPage;

import java.io.IOException;

public class SampleTest extends BasePage {

    landingPage l = new landingPage();

    public SampleTest() throws IOException {
    }


    @Test
    public void launch()  {
        getDriver.get("http://qaclickacademy.com/");
        l.login().click();
        l.username().sendKeys("user");
        l.password().sendKeys("password");
    }


}
