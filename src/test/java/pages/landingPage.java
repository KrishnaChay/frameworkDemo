package pages;

import driver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class landingPage extends BasePage {


    public landingPage() throws IOException {
    }

    public WebElement login() {
        return getDriver.findElement(By.xpath("//a[contains(.,'Login')]"));
    }
    public WebElement username() {
        return getDriver.findElement(By.id("user_email"));
    }

    public WebElement password() {
        return getDriver.findElement(By.id("user_password"));
    }
}
