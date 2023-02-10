package tests;

import driver.DriverFactory;
import driver.DriverManager;
import driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import java.net.MalformedURLException;


public class BaseTest {
    WebDriver driver;
    DriverManager driverManager;

    @BeforeTest
    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {

        DriverFactory factory = new DriverFactory();
        DriverType driverType = DriverType.CHROME;
        driverManager = factory.getManager(driverType);
        driverManager.setUpDriver();
        driver = driverManager.getDriver();
        driverManager.maximize();
        driverManager.setTimeout();
    }


    @AfterTest(alwaysRun = true)
    public void quiteBrowser() {
        driverManager.quitDriver();
    }

}