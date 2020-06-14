package testCases;

import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LandingPage;

import java.io.IOException;

public class SampleTest2 extends BasePage {

    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {
        driver = getDriver();
        System.out.println("initialise driver");
    }

    @Test
    public void register() {
        driver.get(properties.getProperty("url"));
        System.out.println("launch browser");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.registerLink().click();
        Assert.assertTrue(landingPage.failure().getText().contentEquals("testing"));
    }


    @AfterTest
    public void closeBrowser() throws IOException {
        driver.close();
        System.out.println("close browser");
    }
}
