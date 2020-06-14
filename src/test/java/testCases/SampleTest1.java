package testCases;

import framework.BasePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LandingPage;

import java.io.IOException;


public class SampleTest1 extends BasePage {

    public WebDriver driver;
    private static Logger logger = LogManager.getLogger(SampleTest1.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = getDriver();
        logger.info("driver initialised ");
    }

    @Test(dataProvider = "getData")
    public void login(String userName, String password) {
        driver.get(properties.getProperty("url"));
        System.out.println("launch browser");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.loginLink().click();
        landingPage.username().sendKeys(userName);
        landingPage.password().sendKeys(password);

    }

    @DataProvider
    public Object[][] getData() {
        Object[][] a = new Object[1][2];
        a[0][0] = "userone";
        a[0][1] = "password1";
        return a;
    }


    @AfterTest
    public void closeBrowser() throws IOException {
        driver.close();
        System.out.println("close browser");
    }

}
