package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement loginLink() {
        return driver.findElement(By.cssSelector("a[href*='sign_in']"));
    }

    public WebElement registerLink() {
        return driver.findElement(By.cssSelector("a[href*='sign_up']"));
    }

    public WebElement username() {
        return driver.findElement(By.id("user_email"));
    }

    public WebElement password() {
        return driver.findElement(By.id("user_password"));
    }

    public WebElement failure() {
        return driver.findElement(By.xpath("//div[@class='content-box content-box-school-signup']/h1"));
    }
}
