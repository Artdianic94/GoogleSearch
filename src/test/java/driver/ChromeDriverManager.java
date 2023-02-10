package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {
    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker().browserVersion("beta");

    @Override
    public void setUpDriver() {
        driver = wdm.create();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--whitelisted-ips=127.0.0.1");
        System.setProperty("webdriver.chrome.args", "--disable-logging");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("window-size=1024,768"); // Bypass OS security model
        driver = new ChromeDriver(options);
    }
}
