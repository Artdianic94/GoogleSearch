package driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class DriverManager {
    public static WebDriver driver;

    public abstract void setUpDriver() throws MalformedURLException;

    public WebDriver getDriver() {
        return driver;
    }

    public void setTimeout() {
        driver.manage().timeouts().setScriptTimeout(WebTimeouts.SCRIPT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(WebTimeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(WebTimeouts.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void quitDriver() {
        driver.quit();
    }
}
