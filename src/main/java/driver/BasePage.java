package driver;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class BasePage {
    public static  WebDriver getDriver;


    public BasePage() throws IOException {
        new WebDriverDiscovery();
       getDriver= WebDriverDiscovery.setDriver();
    }



}
